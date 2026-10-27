# 🏗️ MVC (Model View Controller)

> MVC is a **design pattern** used to separate the different layers of an application — i.e., we're able to separate the **Model** layer, **View/UI (presentation)** layer, and **Controller** layer. 🧩

---

## 🧱 Architecture of MVC (for Simple Applications)

```
Client (Browser) 🌐
      |
      | 1. Request
      v
 Controller 🎮  <-------> 🗄️ Model
      |                 (Data + Business Logic)
      | 2. Selects View
      v
   View 🖼️  ----> 3. Response ----> Client 🌐
```

MVC has **3 components**:

### 1️⃣ M — Model 🗄️
- 📦 Manages the application's **data** (handles data storage, retrieval, and manipulation) and **business logic**.
- 🧑‍💻 `POJO` (Plain Old Java Object) classes act as the Model.

### 2️⃣ V — View 🖼️
- 🎨 Represents the **UI/Presentation layer**, which is transferred to the client as a response.
- Two types of views:
  - 📄 **Static view** — HTML, CSS, etc.
  - ⚡ **Dynamic view** — JSP, JSTL, etc.

### 3️⃣ C — Controller 🎮
- 📥 Handles client requests, processes **user inputs and events**.
- 🔄 Acts as an **intermediary** between the Model and the View.
- 🧑‍💻 `Servlets` act as the Controller.

---

## 🏢 Architecture of MVC (for Complex Applications)

For real-world, large-scale applications, the simple 3-layer flow is usually expanded into additional layers for better separation of concerns, testability, and maintainability:

```
Client (Browser) 🌐
      |
      v
 Front Controller 🚦 (e.g., DispatcherServlet in Spring)
      |
      v
   Controller 🎮  ------------------> 🗄️ Model
      |                                   |
      | delegates to                      v
      v                            🧠 Service Layer
 Service Layer 🧠  <----------------- (Business Logic)
      |
      v
   DAO / Repository Layer 🗃️ (Data Access Object)
      |
      v
   Database 💾
      |
      v (data flows back up)
   Controller 🎮 ---> selects ---> View 🖼️ ---> Response ---> Client 🌐
```

### 🔍 Additional Layers Explained

| Layer | Emoji | Responsibility |
|---|---|---|
| **Front Controller** | 🚦 | Single entry point for all requests (e.g., `DispatcherServlet` in Spring MVC); routes requests to the right controller |
| **Controller** | 🎮 | Receives requests, calls service layer, chooses the view |
| **Service Layer** | 🧠 | Contains **business logic**; keeps controllers thin |
| **DAO/Repository Layer** | 🗃️ | Handles **database operations** (CRUD); abstracts persistence details |
| **Model** | 📦 | POJOs / Entities representing data |
| **View** | 🖼️ | Final UI rendered to the client |
| **Database** | 💾 | Actual data storage (MySQL, PostgreSQL, MongoDB, etc.) |

### ✅ Why the extra layers?
- 🧵 **Separation of concerns** — each layer has a single responsibility
- 🧪 **Easier testing** — business logic (Service) can be tested independently of DB or UI
- 🔧 **Maintainability** — changes in DB layer don't affect Controller/View
- 📈 **Scalability** — layers can be scaled or replaced independently (e.g., swap DB without touching business logic)

---
![MVC](MVC%201.png)
---
![MVC](MVC%202.png)
---
![MVC](MVC%203.png)

---
## 📝 Quick Summary

| Component | Handles | Java Equivalent |
|---|---|---|
| 🗄️ Model | Data + Business Logic | POJO |
| 🖼️ View | UI/Presentation | HTML/JSP/JSTL |
| 🎮 Controller | Request handling | Servlet |
| 🧠 Service (complex apps) | Business logic | Service classes |
| 🗃️ DAO (complex apps) | DB operations | Repository/DAO classes |