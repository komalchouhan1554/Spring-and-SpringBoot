# 🌱 Spring Framework — Advanced Bean Configuration Notes

---

## 1️⃣ 🌐 Global Attributes

### 🔍 What are Global Attributes?

> **Global Attributes** are attributes defined at the **top-level `<beans>` tag** in the Spring XML configuration file. Instead of repeating the same attribute on every `<bean>` tag, you define it once globally and it applies to **all beans** in the file.

---

### 📋 Common Global Attributes

| Attribute | Description |
|-----------|-------------|
| `default-autowire` 🔧 | Sets the default autowiring mode for all beans (`no`, `byName`, `byType`, `constructor`) |
| `default-lazy-init` 💤 | Sets whether all beans should be lazily initialized (`true` / `false`) |
| `default-init-method` 🚀 | Defines a default init method for all beans |
| `default-destroy-method` 💥 | Defines a default destroy method for all beans |
| `default-autowire-candidates` 🎯 | Pattern to filter which beans are eligible for autowiring |

---

### 💡 Example

```xml
<!-- Without Global Attributes ❌ — Repeated on every bean -->
<beans>
    <bean class="com.example.Car"    id="car"    autowire="byName" lazy-init="true"/>
    <bean class="com.example.Engine" id="engine" autowire="byName" lazy-init="true"/>
    <bean class="com.example.Tyre"   id="tyre"   autowire="byName" lazy-init="true"/>
</beans>
```

```xml
<!-- With Global Attributes ✅ — Defined once, applies to all beans -->
<beans default-autowire="byName"
       default-lazy-init="true"
       default-init-method="init"
       default-destroy-method="destroy">

    <bean class="com.example.Car"    id="car"/>
    <bean class="com.example.Engine" id="engine"/>
    <bean class="com.example.Tyre"   id="tyre"/>

</beans>
```

---

### ✅ Advantages of Global Attributes

- 🧹 Reduces **code repetition**
- 📖 Makes XML config **cleaner and readable**
- 🛠️ Easy to change behavior for **all beans at once**
- ⚡ Individual beans can **override** global attributes if needed

> 💡 **Override Example:** Even if `default-lazy-init="true"` is set globally, a specific bean can override it with `lazy-init="false"`.

---

## 2️⃣ 🧬 Bean Inheritance

### 🔍 What is Bean Inheritance?

> **Bean Inheritance** allows one bean (child) to **inherit the properties and configuration** of another bean (parent). It works similarly to Java class inheritance but at the **bean configuration level**.

- The **parent bean** acts as a template.
- The **child bean** inherits all properties of the parent and can also **override or add** its own properties.
- Uses the **`parent`** attribute in the child `<bean>` tag.

---

### 💡 Example

```java
// Java Classes
public class Vehicle {
    private String brand;
    private String color;
    private int speed;
    // getters & setters
}

public class Car extends Vehicle {
    private int doors;
    // getters & setters
}
```

```xml
<!-- Parent Bean 👨 -->
<bean class="com.example.Vehicle" id="vehicleBean">
    <property name="brand" value="Toyota"/>
    <property name="color" value="Red"/>
    <property name="speed" value="120"/>
</bean>

<!-- Child Bean 👶 — Inherits from vehicleBean -->
<bean class="com.example.Car" id="carBean" parent="vehicleBean">
    <property name="doors" value="4"/>
    <!-- brand, color, speed are inherited from vehicleBean -->
    <!-- color is overridden below -->
    <property name="color" value="Blue"/>
</bean>
```

---

### 🔑 Key Points

- 🔗 Use the **`parent`** attribute in the child `<bean>` tag to specify the parent bean
- 📥 Child bean **inherits** all `<property>` values from parent
- ✏️ Child bean can **override** any inherited property
- ➕ Child bean can **add new properties** of its own
- 🔄 Bean inheritance is **independent** of Java class inheritance

---

### ✅ Advantages

- 🧹 Eliminates **duplicate property declarations**
- 📦 Promotes **reusability** of bean configurations
- 🛠️ Easy to **maintain** — change parent, all children are updated

---

## 3️⃣ 🚫 Abstract Bean

### 🔍 What is an Abstract Bean?

> An **Abstract Bean** is a bean that is defined **only as a template** and **cannot be instantiated** directly by the Spring container. It is meant to be used **only as a parent** for other beans.

- Declared using `abstract="true"` attribute in the `<bean>` tag.
- Spring will **NOT create an object** for an abstract bean.
- Useful when you want to define **common properties** without creating a real object.

---

### 💡 Example

```xml
<!-- Abstract Bean 🚫 — Cannot be instantiated -->
<bean id="baseBean" abstract="true">
    <property name="dataSource" ref="dataSource"/>
    <property name="timeout"    value="30"/>
</bean>

<!-- Child beans inherit from abstract bean ✅ -->
<bean class="com.example.UserDAO"    id="userDAO"    parent="baseBean"/>
<bean class="com.example.ProductDAO" id="productDAO" parent="baseBean"/>
```

> ⚠️ If you try to use `context.getBean("baseBean")`, Spring will throw a **`BeanIsAbstractException`**.

---

### 🆚 Bean Inheritance vs Abstract Bean

| Feature | Bean Inheritance 🧬 | Abstract Bean 🚫 |
|---------|---------------------|-----------------|
| Can be instantiated? | ✅ Yes | ❌ No |
| Used as parent? | ✅ Yes | ✅ Yes |
| Requires `class` attribute? | ✅ Yes | ❌ Optional |
| Purpose | Reuse + instantiate | Template only |

---

### ✅ Advantages of Abstract Bean

- 🎯 Enforces a **pure template** — prevents accidental instantiation
- 🧹 Centralizes **common configuration** in one place
- 🔒 Provides a **stricter structure** than regular bean inheritance

---

## 4️⃣ 🎭 Profiling

### 🔍 What is Profiling in Spring?

> **Profiling** in Spring allows you to define **different bean configurations for different environments** (like Development, Testing, Production). Only the beans belonging to the **active profile** are loaded by the Spring container.

- Uses the **`profile`** attribute on `<beans>` tag or `@Profile` annotation.
- You can activate a profile via:
  - `application.properties`
  - JVM arguments
  - Programmatically in code

---

### 💡 Example — XML Based Profiling

```xml
<!-- Development Profile 🛠️ -->
<beans profile="dev">
    <bean class="com.example.DevDataSource" id="dataSource">
        <property name="url" value="jdbc:h2:mem:devdb"/>
    </bean>
</beans>

<!-- Production Profile 🚀 -->
<beans profile="prod">
    <bean class="com.example.ProdDataSource" id="dataSource">
        <property name="url" value="jdbc:mysql://prod-server/mydb"/>
    </bean>
</beans>
```

---

### 💡 Example — Annotation Based Profiling

```java
@Configuration
@Profile("dev") // 🛠️ Active only in dev environment
public class DevConfig {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                   .setType(EmbeddedDatabaseType.H2)
                   .build();
    }
}

@Configuration
@Profile("prod") // 🚀 Active only in production environment
public class ProdConfig {

    @Bean
    public DataSource dataSource() {
        // Returns production DataSource
        return new HikariDataSource();
    }
}
```

---

### ⚙️ Activating a Profile

```properties
# In application.properties
spring.profiles.active=dev
```

```bash
# As JVM argument
-Dspring.profiles.active=prod
```

```java
// Programmatically
AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
ctx.getEnvironment().setActiveProfiles("dev");
ctx.register(AppConfig.class);
ctx.refresh();
```

---

### ✅ Advantages of Profiling

- 🌍 Easily switch between **dev, test, and prod** environments
- 🔒 Keeps **sensitive production configs** separate
- 🧹 No need to change code — just **activate the right profile**
- 🎯 Supports **multiple active profiles** at the same time

---

## 5️⃣ 🪆 Nested Beans

### 🔍 What are Nested Beans?

> A **Nested Bean** (also called an **Inner Bean**) is a bean that is defined **inside another bean's property or constructor-arg tag**. It is only accessible to the **enclosing (outer) bean** and cannot be referenced by any other bean.

- The nested bean does **not need an `id`** (since it can't be referenced outside).
- It is used when a bean dependency is **only needed by one specific bean**.

---

### 💡 Example

```xml
<bean class="com.example.Car" id="car">

    <property name="engine">
        <!-- 🪆 Nested / Inner Bean — defined inside Car's property -->
        <bean class="com.example.Engine">
            <property name="type"  value="V8"/>
            <property name="power" value="450"/>
        </bean>
    </property>

    <property name="brand" value="Ford"/>

</bean>
```

> 🔒 The `Engine` bean above is **only accessible to `Car`** — no other bean can use it.

---

### 🆚 Nested Bean vs Regular Bean

| Feature | Regular Bean 🫘 | Nested Bean 🪆 |
|---------|----------------|---------------|
| Has `id`? | ✅ Yes | ❌ Optional / Not needed |
| Accessible by other beans? | ✅ Yes | ❌ No — private to parent |
| Defined where? | Top-level `<beans>` | Inside another `<bean>` tag |
| Reusable? | ✅ Yes | ❌ No |

---

### ✅ Advantages of Nested Beans

- 🔒 **Encapsulation** — hides bean from the rest of the container
- 🧹 Keeps configuration **closer to where it's used**
- 🎯 Useful for **one-time use** dependencies

---

## 6️⃣ 🔁 Method Replacer

### 🔍 What is Method Replacer?

> **Method Replacer** is a Spring feature that allows you to **replace (override) the implementation of a method** in a bean **at runtime**, without changing the original Java class. It uses the **`<replaced-method>`** tag in XML configuration.

- The replacement class must implement the **`MethodReplacer`** interface.
- The `MethodReplacer` interface has one method: **`reimplement()`**.
- Useful when you want to **change a method's behavior** without modifying the source code.

---

### 🛠️ Steps to Use Method Replacer

1. ✅ Create the **original bean class** with the method to be replaced.
2. ✅ Create a **replacer class** that implements `MethodReplacer`.
3. ✅ Override the **`reimplement()`** method with the new logic.
4. ✅ Configure using **`<replaced-method>`** tag in XML.

---

### 💡 Example

```java
// Step 1️⃣ — Original class with method to be replaced
public class MyService {

    public String getMessage() {
        return "Hello from Original Method! 👋";
    }

}
```

```java
// Step 2️⃣ — Replacer class implementing MethodReplacer
import org.springframework.beans.factory.support.MethodReplacer;
import java.lang.reflect.Method;

public class MyMethodReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        // 🔁 New logic replaces the original getMessage()
        return "Hello from Replaced Method! 🚀";
    }

}
```

```xml
<!-- Step 3️⃣ — XML Configuration -->

<!-- Replacer bean -->
<bean class="com.example.MyMethodReplacer" id="myReplacer"/>

<!-- Original bean with replaced-method -->
<bean class="com.example.MyService" id="myService">
    <replaced-method name="getMessage" replacer="myReplacer"/>
    <!--
        name     = method name to replace
        replacer = id of the MethodReplacer bean
    -->
</bean>
```

```java
// Step 4️⃣ — Using the bean
ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
MyService service = ctx.getBean("myService", MyService.class);

System.out.println(service.getMessage());
// Output: Hello from Replaced Method! 🚀
```

---

### 🔑 Key Points

- 📦 Replacement class must implement **`org.springframework.beans.factory.support.MethodReplacer`**
- 🔁 The `reimplement()` method receives:
  - `obj` — the bean instance
  - `method` — the method being replaced
  - `args` — the method arguments
- ⚠️ Works using **CGLIB proxies** under the hood (Spring creates a subclass)
- 🎯 The replaced method can be **any method** — not just abstract ones

---

### ✅ Advantages of Method Replacer

- 🔧 Change method behavior **without modifying** source code
- 🧩 Useful for **legacy code** where you can't change the original class
- 🎯 Allows **runtime behavior modification**

### ❌ Disadvantages

- 🐢 Uses CGLIB proxying — adds a **slight performance overhead**
- 🧪 Harder to **test and debug**
- 📖 Rarely used — consider **AOP (Aspect Oriented Programming)** as a cleaner alternative

---

## 🗂️ Overall Quick Summary

| Topic | Key Concept | Key Attribute / Annotation |
|-------|-------------|---------------------------|
| 🌐 Global Attributes | Apply config to ALL beans at once | `default-autowire`, `default-lazy-init` etc. on `<beans>` |
| 🧬 Bean Inheritance | Child bean inherits parent bean's properties | `parent="parentBeanId"` |
| 🚫 Abstract Bean | Template-only bean, cannot be instantiated | `abstract="true"` |
| 🎭 Profiling | Load beans based on active environment | `profile="dev/prod"` or `@Profile` |
| 🪆 Nested Beans | Inner bean, private to enclosing bean | Defined inside `<property>` tag |
| 🔁 Method Replacer | Replace a method's logic at runtime | `<replaced-method>` + `MethodReplacer` |

---

> 💡 **Pro Tip:** These are **advanced Spring configuration features** that give you fine-grained control over your beans. While powerful, always prefer **simpler alternatives** (like `@Profile`, `@Autowired`, AOP) in modern Spring Boot applications! 🚀