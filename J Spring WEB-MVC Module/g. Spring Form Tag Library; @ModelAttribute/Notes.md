# 🌱 Spring MVC Notes

## 🏷️ Spring Form Tag Library

📌 **What is it?**
A collection of JSP tags that simplify the process of creating HTML forms with Spring MVC.

### 🤔 Why should we use the Spring Form Tag Library?

1. 🔗 **Data Binding Support**
   The form tags help with data binding between form fields and Java Objects. This means values entered into form fields can be automatically bound to corresponding properties of a Java Object.

2. ✅ **Validation Support**
   The form tag library integrates with the Spring Validation Framework (or others), allowing us to perform server-side validations easily.

3. 🌍 **Internationalization (i18n)**
   The form tag library supports internationalization by providing tags that let us display messages in different languages based on the user's locale.

4. 📖 **Improved Code Readability**
   The tags make our code more readable and easier to maintain.

5. ⏱️ **Reduced Development Time**
   The tags help us develop web applications more quickly and easily.

### 📝 NOTE

- 💪 The Spring Form Tag Library is a powerful tool that helps us develop web applications more quickly and easily. It is a standard part of the Spring MVC Framework and is used by many developers.
- 📦 To use the Spring Form Tag Library, we need to have **`spring-webmvc`** on the classpath (this is where the `spring-form.tld` tag library lives), and declare it in the JSP with:
  ```jsp
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  ```
  ⚠️ Correction: `spring-security-taglibs` is a **different** dependency — it provides Spring **Security** tags (like `<sec:authorize>`), not the form tags. It's not required just to use `<form:*>` tags.

---

## 🎯 @ModelAttribute

📌 **What is it?**
An annotation used to bind a method parameter or return value to a model attribute, facilitating data preparation for the view or form handling.

### 🛠️ How to use @ModelAttribute

1. 🔹 **Parameter-Level Annotation**
   Used on a method parameter (usually in a `@RequestMapping`/`@PostMapping` handler) to bind form data submitted by the user to a Java object.
   ```java
   @PostMapping("/submit")
   public String submitForm(@ModelAttribute("user") User user) {
       // 'user' object is auto-populated from form fields
       return "result";
   }
   ```

2. 🔹 **Method-Level Annotation**
   Used on a method (not a request-handling method) to add an object to the model **before** any request handler in the controller is invoked. Runs automatically for every request to that controller.
   ```java
   @ModelAttribute("user")
   public User addUserToModel() {
       return new User();
   }
   ```

---
✨ *Happy Learning!* ✨