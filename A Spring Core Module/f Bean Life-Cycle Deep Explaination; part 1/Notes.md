# 🌱 Spring Bean Life Cycle

The Spring Bean Life Cycle consists of **5 key phases** from creation to destruction:

```
📦 Loading Bean Definitions
        ⬇️
🏗️ Bean Instantiation
        ⬇️
⚙️ Bean Initialization
        ⬇️
✅ Bean Usage
        ⬇️
💀 Bean Destruction
```

---

## 1. 📦 Loading Bean Definitions

> 🗒️ *Bean definitions are the **blueprint/settings** that tell Spring how to create a bean object.*

- Contains information about:
  - 🏷️ The **class** to instantiate
  - 🔧 **Property configurations**
  - 💉 **Dependency injection** settings
  - ⚙️ Other configurations

- Bean definitions can be provided via:
  - 📄 **XML configuration file**
  - ☕ **Java configuration class**
  - 🏷️ **Annotations**

- 🔍 This phase involves **reading and parsing** configuration files to create bean definitions for all beans managed by the Spring container.

---

## 2. 🏗️ Bean Instantiation

> 🏭 *The Spring container creates an instance of the bean based on its bean definitions.*

### 🔨 Ways to create Bean Objects:

| # | Method | Description |
|---|--------|-------------|
| a | 🏠 Default / No-arg Constructor | Most common way |
| b | 🏭 Static Factory Method | Uses a static method to create instance |
| c | 🔁 Instance Factory Method | Uses a method on an existing instance |


### 📋 In This Phase:
- 🔢 Bean objects are **initialized with default values** based on property data types in the JavaBean class.
- 💉 The container also **injects required dependencies** into the bean object via:
  - 🛠️ **Setter Method DI**
  - 🏗️ **Constructor DI**

---

## 3. ⚙️ Bean Initialization

> ✨ *In this phase, the bean object is initialized with its **original/actual values***.

### 🔨 How Bean Objects Are Initialized:

**a. 🏷️ Using `property` tags** *(XML configuration)*

**b. 🎯 Using Explicit Ways:**

| # | Approach | Notes |
|---|----------|-------|
| i | 🛠️ Custom `init()` method | Defined in bean class |
| ii | 🔄 `afterPropertiesSet()` of `InitializingBean` | Callback interface |
| iii | 🏷️ `@PostConstruct` annotation | Requires `javax.annotation-api-xxx.jar` |

---

## 4. ✅ Bean Usage

> 🚀 *Once fully initialized, the bean is **ready to be used** in your application.*

- 📥 Beans can be **retrieved from the Spring container**.
- 💼 Used to execute **business logic** in the application.

```java
// Example: Retrieving a bean from the Spring container
ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
MyBean myBean = context.getBean("myBean", MyBean.class);
myBean.doSomething(); // ✅ Bean in use!
```

---

## 5. 💀 Bean Destruction

> 🗑️ *In this phase, bean objects are **destroyed or deleted** by the Spring container.*

### 🔨 How Bean Objects Are Destroyed:

| # | Approach | Notes |
|---|----------|-------|
| i | 🛠️ Custom `destroy()` method | Defined in bean class |
| ii | 🔄 `destroy()` of `DisposableBean` | Callback interface |
| iii | 🏷️ `@PreDestroy` annotation | Requires `javax.annotation-api-xxx.jar` |

---

## 🗺️ Complete Life Cycle Overview

```
┌─────────────────────────────────────────────────────────────┐
│                  🌱 SPRING BEAN LIFE CYCLE                  │
├─────────────────────────────────────────────────────────────┤
│                                                             │
│  📦 1. Loading Bean Definitions                             │
│        └── XML / Java Class / Annotations                   │
│                       ⬇️                                    │
│  🏗️ 2. Bean Instantiation                                   │
│        ├── Default Constructor                              │
│        ├── Static Factory Method                            │
│        ├── Instance Factory Method                          │
│        └── Dependency Injection (Setter / Constructor)      │
│                       ⬇️                                    │
│  ⚙️ 3. Bean Initialization                                  │
│        ├── property tags                                    │
│        ├── Custom init() method                             │
│        ├── afterPropertiesSet() - InitializingBean          │
│        └── @PostConstruct annotation                        │
│                       ⬇️                                    │
│  ✅ 4. Bean Usage                                           │
│        └── Business logic execution                         │
│                       ⬇️                                    │
│  💀 5. Bean Destruction                                     │
│        ├── Custom destroy() method                          │
│        ├── destroy() - DisposableBean                       │
│        └── @PreDestroy annotation                           │
│                                                             │
└─────────────────────────────────────────────────────────────┘
```
---
![alt-text](1_Bean_Life-Cycle.png)
---
---

## 📌 Quick Reference — Callback Interfaces & Annotations

| Phase | Interface / Annotation | Method | JAR Required |
|-------|----------------------|--------|--------------|
| ⚙️ Init | `InitializingBean` | `afterPropertiesSet()` | ❌ Built-in |
| ⚙️ Init | `@PostConstruct` | — | ✅ `javax.annotation-api` |
| 💀 Destroy | `DisposableBean` | `destroy()` | ❌ Built-in |
| 💀 Destroy | `@PreDestroy` | — | ✅ `javax.annotation-api` |

---

> 💡 **Tip:** Using `@PostConstruct` and `@PreDestroy` annotations is the **recommended modern approach** as it keeps your bean classes loosely coupled from Spring interfaces!