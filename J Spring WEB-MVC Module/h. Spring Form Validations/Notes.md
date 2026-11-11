# 🌱 Validations in Spring

- ✅ Validations are the restrictions provided to the client while filling the form so that the data entered by the client is **valid**.

## 🔀 Types of Validations

1. 🖥️ **Client-Side Validations**
   - Technologies used: JavaScript, VB Script, etc.
2. 🖧 **Server-Side Validations**
   - Technologies used: Servlets, JSP, Spring, Webservices, etc.

## 🛠️ Ways to Achieve Validations

We can achieve validations in multiple ways, but the important ones are:

1. 🧩 Using `Validator` interface
2. 📜 Using JSR-303 Bean Validation
3. 🏷️ Using `@Valid` annotation
4. ➕ etc.

---

## 📘 JSR-303 Bean Validation

- 📝 It is the **formal specification** that defines the standard annotations for validating Java Beans.

### 🏷️ Annotations in JSR-303 Bean Validation

| Category | Annotations |
|----------|-------------|
| 🔹 Basic Annotations | `@NotNull`, `@Null`, `@NotEmpty`, `@NotBlank`, `@Size`, `@Min`, `@Max`, `@Pattern` |
| ⏳ Temporal Annotations | `@Past`, `@Future`, `@Present` |
| ➕ etc. | — |

> ### ⚠️ NOTE
> - 🔧 **Java Bean Validations API** implements the JSR-303 Bean Validation Annotations.
> - 🐘 **Hibernate Validator** extends the Java Bean Validations API with additional annotations for hibernate entities and ORM scenarios.

---

## 🏷️ `@Valid` Annotation

- 📌 It is a **standard annotation** used to indicate that a method parameter or object field requires validation.
- 📍 It is placed directly before the parameter or object to be validated. It can also be applied to a method parameter of type `Object` or any class that supports bean validation.

### ✍️ Syntax

```java
public void anyMethod(@Valid SomeClass/Object param)
{
    // implementation
}
```

- 🔗 `@Valid` can be integrated with the JSR-303 Bean Validation API for comprehensive and standardized validation in Spring Applications.

---

## 🏛️ JCP (Java Community Process)

- ⚙️ It is simply a process which allows interested parties (organisation or individual) to develop standard technical specifications for Java technology.
- 📅 It was established in **1998**.
- 👥 The JCP is a **membership-based community** and anyone can join by filling out an application form on the Oracle JCP website.
- 🗳️ JCP members have the right to:
  - 📤 Propose JSRs
  - 🧭 Lead JSRs
  - ✔️ Vote for JSRs
  - 💬 Participate in JCP discussions

## 📄 JSR (Java Specification Request)

- 📋 It is a **formal, open standard document proposal** that is submitted to the JCP by an organization or individual.
- 🧾 A JSR contains proposed changes, additions, or improvements to the Java Technology Specifications.

### 🌟 Some JSRs related to Spring

| JSR | Description |
|-----|--------------|
| 🔢 JSR-303 | Bean Validation |
| 🔢 JSR-349 | Context and Dependency Injection |
| 🔢 JSR-380 | Expression Language |


---

![JSR & JCP](JSR%20And%20JCP.png)

---