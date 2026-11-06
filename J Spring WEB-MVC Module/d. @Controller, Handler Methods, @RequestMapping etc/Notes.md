# 🌱 Spring MVC Notes

## 🎯 @Controller

- 🏷️ It is a **stereotype annotation** that indicates a class serves the role of a **controller**.
- 📝 Syntax:
  ```java
  @Controller
  class MyController {
  }
  ```
- 🌐 It indicates that the annotated class is responsible for **handling HTTP requests**.
- 🏗️ This annotation is used in the **MVC architectural pattern** for building web applications.

---

## 🎮 Handler Methods

- 🔗 These methods are also known as **URL Handler Methods**.
- ⚙️ They are responsible for:
  - 📥 Processing the incoming requests
  - 🧠 Performing business logic
  - 📦 Preparing model data to be rendered by the view page
- 🗺️ In order to map the incoming request/URL, handler methods can be annotated with HTTP method-related annotations like `@RequestMapping`, `@PostMapping`, `@GetMapping`, etc.

### 🔍 Case Studies for Handler Methods

1. ✍️ We can provide **any name** for a handler method.
2. 🔄 We can have **any return type**, such as:
   - `String` → representing a view name 🖼️
   - `ModelAndView` → a container for model data + view name 📦🖼️
3. 🧩 We can use **non-primitive data types** as parameters.
   - ✅ Primitive data types can also be used, but they are typically used for simple cases like receiving query parameters.

> 💡 **NOTE:** From the above points, it's clear that handler methods are **very flexible**, which is why this approach is most commonly used. 🚀

---

## 📡 HTTP Methods Related Annotations

### 1️⃣ @RequestMapping
- 🧰 A **versatile annotation** that can handle various HTTP methods (GET, POST, etc.).
- 📍 Can be applied at the **method level** or **class level**.
- 📝 Syntax:
  ```java
  @RequestMapping("/url")
  @RequestMapping(value = {"/url1", "/url2", "/url3"})
  @RequestMapping(value = "/url", method = RequestMethod.POST)   // 🟰 same as @PostMapping("/url")
  @RequestMapping(value = "/url", method = {RequestMethod.POST, RequestMethod.GET})
  ```

### 2️⃣ @GetMapping
- 📥 Used for handling **HTTP GET** requests.
- ⚡ A specialized form of `@RequestMapping` for the **GET** method.

### 3️⃣ @PostMapping
- 📤 Used for handling **HTTP POST** requests.
- ⚡ A specialized form of `@RequestMapping` for the **POST** method.

### ➕ etc.
- More specialized annotations exist too:
  - 🟠 `@PutMapping` — for PUT requests
  - 🔴 `@DeleteMapping` — for DELETE requests
  - 🟡 `@PatchMapping` — for PATCH requests