# 🏷️ Java + Annotation Based Autowiring

---

## 🔍 What is Annotation Based Autowiring?

> In **Annotation Based Autowiring**, we use the **`@Autowired`** annotation to automatically inject bean dependencies — no need to manually wire beans in XML.

---

## 📌 `@Autowired` Annotation

The `@Autowired` annotation can be used in **3 places**:

| # | Usage | Description |
|---|-------|-------------|
| 1️⃣ | **Field (Property)** | Applied directly on the field/variable |
| 2️⃣ | **Setter Method** | Applied on the setter method |
| 3️⃣ | **Constructor** | Applied on the constructor |

---

### 1️⃣ Field Injection

```java
@Component
public class Car {

    @Autowired  // 🏷️ Injected directly on the field
    private Engine engine;

}
```

---

### 2️⃣ Setter Method Injection

```java
@Component
public class Car {

    private Engine engine;

    @Autowired  // 🏷️ Injected via setter method
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
```

---

### 3️⃣ Constructor Injection

```java
@Component
public class Car {

    private Engine engine;

    @Autowired  // 🏷️ Injected via constructor
    public Car(Engine engine) {
        this.engine = engine;
    }

}
```

---

## ⚠️ Problem — Confusion with Multiple Beans

> If there are **2 or more bean objects** of the same type that are ready to be injected, Spring gets **confused** about which one to inject!

```java
@Component
public class Car {

    @Autowired
    private Engine engine;  // ❓ Which Engine bean to inject?

}
```

```xml
<!-- Both beans are of the same type! -->
<bean class="com.example.PetrolEngine" id="petrolEngine"/>
<bean class="com.example.DieselEngine" id="dieselEngine"/>
```

---

## ✅ Solution — `@Qualifier` Annotation

> To resolve the confusion caused by multiple beans of the same type, we use the **`@Qualifier`** annotation along with `@Autowired`.

```java
@Component
public class Car {

    @Autowired
    @Qualifier("petrolEngine")  // ✅ Specifies exactly which bean to inject
    private Engine engine;

}
```

> 💡 The value passed to `@Qualifier` should match the **bean id** defined in the Spring configuration.

---

## 📄 Important Note

> ✅ We **can** use the `@Autowired` annotation even when using an **XML-based Spring configuration file**.

```xml
<!-- Enable annotation processing in XML config -->
<context:annotation-config/>

<bean class="com.example.Car" id="car"/>
<bean class="com.example.Engine" id="engine"/>
```

---

## 🗂️ Quick Summary

| Annotation | Purpose |
|------------|---------|
| `@Autowired` 🏷️ | Automatically injects the matching bean |
| `@Qualifier` 🎯 | Specifies which bean to inject when multiple beans of the same type exist |

---

> 💡 **Key Takeaway:** Use `@Autowired` for automatic DI and always pair it with `@Qualifier` when there's a possibility of multiple beans of the same type to avoid `NoUniqueBeanDefinitionException`! 🚨