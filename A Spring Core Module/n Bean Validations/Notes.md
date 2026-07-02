# 🌱 Spring Bean Validations — Notes

---

## 📦 Bean Validation

> **Bean validation** is the process of verifying that the data inside a bean object is correct and meets the required constraints.

### ✅ Ways to Achieve Bean Validation

| # | Method |
|---|--------|
| 1️⃣ | Using `Validator` interface |
| 2️⃣ | Using **JSR-303** Bean Validation |
| 3️⃣ | Using `@Valid` and `@Validated` annotations |
| 4️⃣ | Using annotations of **SpEL** (Spring Expression Language) |
| ➕ | ...and more! |

---

## 🔌 `Validator` Interface

The `Validator` interface is provided by Spring to define custom validation logic.

### 📝 Syntax

```java
interface Validator {
    public boolean supports(Class clazz);
    public void validate(Object obj, Errors errors);
}
```

### 🔍 Method Descriptions

- **`supports(Class clazz)`** — Checks whether the validator can validate instances of the given class.
- **`validate(Object obj, Errors errors)`** — Validates the given object and, in case of validation errors, registers them into the `Errors` object.

---

## 🔗 `DataBinder`

> `DataBinder` is a **Spring class** used for **data binding**.

### 📌 Key Responsibilities

- 🔄 Binds data from **HTTP request parameters** to **Java objects**

### ⚠️ Important Notes

- ❌ `DataBinder` is **NOT** responsible for validation itself
- ✅ However, it **can be configured with validators** to perform validation on the bound data
- 📋 Validation results are stored in a **separate object** of type `BindingResult`, which can be accessed **after** the data bind process

---

## 📊 `BindingResult`

> `BindingResult` is an **interface** that represents the **result of data binding and validation**.

### 🏗️ Implemented Classes

| # | Class Name |
|---|------------|
| 1️⃣ | `MapBindingResult` |
| 2️⃣ | `BeanPropertyBindingResult` |

### 🔁 How It Fits Together

```
HTTP Request
     ↓
  DataBinder        ← configured with → Validator
     ↓
  Java Object
     ↓
  BindingResult     ← stores → Errors / Validation Results
```

---

## 🗂️ Quick Summary

| 🧩 Component | 📋 Role |
|---|---|
| `Validator` | Interface to write custom validation logic |
| `DataBinder` | Binds HTTP params to Java objects |
| `BindingResult` | Stores binding + validation results |
| `@Valid` / `@Validated` | Annotations to trigger validation |
| JSR-303 | Standard specification for bean validation |

---

> 💡 **Tip:** Always check `BindingResult.hasErrors()` after binding to decide whether to proceed or return validation failure messages!