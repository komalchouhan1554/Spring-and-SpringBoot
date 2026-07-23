# ☕ Spring AOP — Java & Annotation-Based Configuration

---

## 📌 Overview

> Instead of XML, we use **Java Configuration Classes** and **Annotations** to configure AOP in Spring.
> No `spring.xml` needed — everything is pure Java! 🎉

---

## 🧱 Key Annotations Used

| Annotation | Purpose |
|---|---|
| `@Configuration` | Marks the class as a Spring Java Config file |
| `@Bean` | Declares a Spring Bean inside a `@Configuration` class |
| `@EnableAspectJAutoProxy` | Enables AOP / AspectJ auto-proxy support |
| `@Aspect` | Marks a class as an **Aspect** (contains advices) |
| `@Before` | Defines **Before Advice** |
| `@After` | Defines **After (Finally) Advice** |
| `@AfterReturning` | Defines **After Returning Advice** |
| `@AfterThrowing` | Defines **After Throwing Advice** |
| `@Around` | Defines **Around Advice** |
| `@Pointcut` | Declares a **reusable Pointcut expression** |

---

## ⚙️ Step-by-Step Setup

---

### 🔧 Step 1 — Java Configuration Class

> This replaces your `spring.xml` file completely.

```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration                  // 📋 This is a Spring Config class
@EnableAspectJAutoProxy         // 🔁 Enables AspectJ Auto Proxy (AOP support)
public class AppConfig {

    // 🫘 Declare your target bean
    @Bean
    public BankTransaction bankTransaction() {
        return new BankTransaction();
    }

    // 🫘 Declare your Aspect bean
    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
```

- 📋 `@Configuration` → tells Spring this class provides bean definitions
- 🔁 `@EnableAspectJAutoProxy` → activates AOP proxy creation automatically
- 🫘 `@Bean` → registers each object as a Spring-managed bean

---

### 🧩 Step 2 — Create the Aspect Class

> The Aspect class holds all your **advice methods**.

```java
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect         // 🎭 This class is an Aspect
@Component      // 🫘 Also register it as a Spring Bean (alternative to @Bean in config)
public class LoggingAspect {
    // 👇 All advice methods go here
}
```

---

### 🎯 Step 3 — Define a Reusable Pointcut (Optional but Recommended)

```java
import org.aspectj.lang.annotation.Pointcut;

@Pointcut("execution(* in.sp.services.BankTransaction.*(..))")
public void bankMethods() {}    // 👈 Just an empty method — acts as a reference label
```

- ♻️ Define **once**, reuse in **multiple advices**
- ✅ Cleaner and avoids repeating the expression everywhere

---

## 🛡️ Types of Advices (Annotation-Based)

---

### 1️⃣ `@Before` — Before Advice

> ▶️ Runs **before** the target method executes.

```java
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;

@Before("execution(* in.sp.services.BankTransaction.*(..))")
public void logBefore(JoinPoint jp) {
    System.out.println("🟢 [BEFORE] Method called: " + jp.getSignature().getName());
}

// ✅ Using reusable pointcut reference
@Before("bankMethods()")
public void logBefore(JoinPoint jp) {
    System.out.println("🟢 [BEFORE] Method: " + jp.getSignature().getName());
}
```

- 🔔 Executes **prior** to the method
- ❌ Cannot stop the method (unless exception is thrown)
- 🔍 `JoinPoint` gives access to method name, args, target object

---

### 2️⃣ `@After` — After (Finally) Advice

> 🔚 Runs **after** the target method — whether it succeeds or throws an exception.

```java
import org.aspectj.lang.annotation.After;

@After("execution(* in.sp.services.BankTransaction.*(..))")
public void logAfter(JoinPoint jp) {
    System.out.println("🔵 [AFTER] Method finished: " + jp.getSignature().getName());
}
```

- 🔄 Works like a **`finally` block** in Java
- ✅ Always executes regardless of outcome

---

### 3️⃣ `@AfterReturning` — After Returning Advice

> ✅ Runs **only when** the target method **returns successfully** (no exception).

```java
import org.aspectj.lang.annotation.AfterReturning;

@AfterReturning(
    pointcut = "execution(* in.sp.services.BankTransaction.*(..))",
    returning = "result"        // 👈 Binds the return value to this variable
)
public void logAfterReturning(JoinPoint jp, Object result) {
    System.out.println("✅ [AFTER-RETURNING] Method: " + jp.getSignature().getName());
    System.out.println("📦 Return Value: " + result);
}
```

- 📦 `returning = "result"` — captures the **actual return value**
- ❌ Does NOT run if an exception is thrown

---

### 4️⃣ `@AfterThrowing` — After Throwing Advice

> ❌ Runs **only when** the target method **throws an exception**.

```java
import org.aspectj.lang.annotation.AfterThrowing;

@AfterThrowing(
    pointcut = "execution(* in.sp.services.BankTransaction.*(..))",
    throwing = "ex"             // 👈 Binds the thrown exception to this variable
)
public void logAfterThrowing(JoinPoint jp, Throwable ex) {
    System.out.println("🚨 [AFTER-THROWING] Method: " + jp.getSignature().getName());
    System.out.println("💥 Exception: " + ex.getMessage());
}
```

- 🚨 `throwing = "ex"` — captures the **thrown exception object**
- ✅ Does NOT run on successful return

---

### 5️⃣ `@Around` — Around Advice

> 🔁 The most **powerful** advice — fully wraps the method execution.

```java
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;

@Around("execution(* in.sp.services.BankTransaction.*(..))")
public Object logAround(ProceedingJoinPoint pjp) throws Throwable {

    System.out.println("⏩ [AROUND - BEFORE] Method: " + pjp.getSignature().getName());

    Object result = pjp.proceed();  // 🚀 Calls the actual target method

    System.out.println("⏪ [AROUND - AFTER] Method: " + pjp.getSignature().getName());

    return result;  // 🔄 Must return the result
}
```

- ⚡ Runs logic **before AND after** the method
- 🛑 Can **prevent** execution by not calling `pjp.proceed()`
- 🔧 Uses `ProceedingJoinPoint` (extended version of `JoinPoint`)
- 🔄 Must `return` the result of `pjp.proceed()`

---

## 🗃️ Complete Aspect Class Example

```java
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // 🎯 Reusable Pointcut
    @Pointcut("execution(* in.sp.services.BankTransaction.*(..))")
    public void bankMethods() {}

    // 1️⃣ Before
    @Before("bankMethods()")
    public void logBefore(JoinPoint jp) {
        System.out.println("🟢 Before: " + jp.getSignature().getName());
    }

    // 2️⃣ After
    @After("bankMethods()")
    public void logAfter(JoinPoint jp) {
        System.out.println("🔵 After: " + jp.getSignature().getName());
    }

    // 3️⃣ After Returning
    @AfterReturning(pointcut = "bankMethods()", returning = "result")
    public void logAfterReturning(JoinPoint jp, Object result) {
        System.out.println("✅ AfterReturning: " + result);
    }

    // 4️⃣ After Throwing
    @AfterThrowing(pointcut = "bankMethods()", throwing = "ex")
    public void logAfterThrowing(JoinPoint jp, Throwable ex) {
        System.out.println("🚨 AfterThrowing: " + ex.getMessage());
    }

    // 5️⃣ Around
    @Around("bankMethods()")
    public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("⏩ Around Before: " + pjp.getSignature().getName());
        Object result = pjp.proceed();
        System.out.println("⏪ Around After: " + pjp.getSignature().getName());
        return result;
    }
}
```

---

## 🚀 Step 4 — Run / Load the Context

```java
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // 🏗️ Load Java Config (replaces ClassPathXmlApplicationContext)
        AnnotationConfigApplicationContext ctx =
            new AnnotationConfigApplicationContext(AppConfig.class);

        // 🫘 Get the bean
        BankTransaction bt = ctx.getBean(BankTransaction.class);

        // 🏃 Call methods — AOP advices fire automatically!
        bt.deposit();
        bt.withdraw();

        ctx.close(); // 🔒 Close context
    }
}
```

---

## 🔍 JoinPoint vs ProceedingJoinPoint

| Feature | `JoinPoint` | `ProceedingJoinPoint` |
|---|---|---|
| Available in | `@Before`, `@After`, `@AfterReturning`, `@AfterThrowing` | `@Around` only |
| Can call target method | ❌ No | ✅ Yes (`pjp.proceed()`) |
| Get method name | ✅ `jp.getSignature().getName()` | ✅ `pjp.getSignature().getName()` |
| Get arguments | ✅ `jp.getArgs()` | ✅ `pjp.getArgs()` |
| Get target object | ✅ `jp.getTarget()` | ✅ `pjp.getTarget()` |

---

## 📊 Advice Comparison Table

| Annotation | Runs When | Stops Execution | Return Value Access | Exception Access |
|---|---|---|---|---|
| `@Before` | Before method | ❌ No | ❌ No | ❌ No |
| `@After` | Always (finally) | ❌ No | ❌ No | ❌ No |
| `@AfterReturning` | Success only | ❌ No | ✅ Yes | ❌ No |
| `@AfterThrowing` | Exception only | ❌ No | ❌ No | ✅ Yes |
| `@Around` | Before & After | ✅ Yes | ✅ Yes | ✅ Yes |

---

## ⚡ XML vs Annotation-Based — Quick Comparison

| Feature | XML-Based | Annotation-Based |
|---|---|---|
| Config file | `spring.xml` | Java class with `@Configuration` |
| Enable AOP | AOP schema in XML | `@EnableAspectJAutoProxy` |
| Declare Aspect | `<aop:aspect ref="...">` | `@Aspect` on class |
| Declare Advice | `<aop:before method="...">` | `@Before("...")` on method |
| Load Context | `ClassPathXmlApplicationContext` | `AnnotationConfigApplicationContext` |
| Boilerplate | 🔴 More (XML tags) | 🟢 Less (just annotations) |

---

## 💡 Key Takeaways

- ⚙️ `@Configuration` + `@EnableAspectJAutoProxy` = replaces entire `spring.xml` AOP config
- 🎭 `@Aspect` marks the class; `@Before`, `@After` etc. mark individual advice methods
- 🎯 `@Pointcut` helps define **reusable expressions** — define once, use everywhere
- 🔁 `@Around` is the most powerful — needs `ProceedingJoinPoint` and must call `pjp.proceed()`
- 🚀 Use `AnnotationConfigApplicationContext` to load Java-based Spring config

---

*📝 Notes on Spring AOP — Java & Annotation-Based Configuration*