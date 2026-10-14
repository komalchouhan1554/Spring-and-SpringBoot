# 📄 JSP Tags

## 🔖 What are JSP Tags?
- 🧩 JSP tags are special elements or directives used within the JSP document to **embed Java code**, **perform actions**, or **define custom behaviors**.
- 🔗 JSP tags allow us to mix **dynamic Java code** with **static HTML content**, making it easier to create dynamic web pages.

---

## 🏷️ Types of JSP Tags

There are **3 types** of JSP tags:

### 1️⃣ JSP Scripting Tags 📜
- Used to embed Java code directly inside the JSP page.
- Includes:
  - `<% %>` → 🔧 Scriptlet tag
  - `<%= %>` → 📤 Expression tag
  - `<%! %>` → 🧱 Declaration tag

### 2️⃣ JSP Directive Tags 📋
- Used to give special instructions to the JSP container (like page settings, imports, etc.).
- Includes:
  - `<%@ page %>` → ⚙️ Page directive
  - `<%@ include %>` → 📥 Include directive
  - `<%@ taglib %>` → 🏷️ Taglib directive

### 3️⃣ JSP Action Tags 🎬
- Used to perform some action, such as including a file, forwarding to another page, or using JavaBeans.
- Includes:
  - `<jsp:include>` → 📎 Include a resource
  - `<jsp:forward>` → ➡️ Forward request
  - `<jsp:useBean>` → 🫘 Use JavaBean
  - `<jsp:setProperty>` / `<jsp:getProperty>` → 🔧 Set/Get bean properties

---

## 📝 NOTE

✨ There are many other libraries and tags that we can use in JSP to provide some additional functionalities, i.e.:

- 📚 **JSTL** (JSP Standard Tag Library)
- 🌱 **Spring MVC Tags**
- 🥊 **Struts Tags**
- 👤 **JavaServer Faces (JSF) Tags**
- ➕ etc.

⚡ These tags can be used within the JSP using:
- 🏷️ **Taglib Directive Tag**, or
- 🎬 **Custom Action Tag**

---

### Tag Categories

![Tags](Tag%20Categories.png)

---

> 💡 **Tip:** Combining scripting, directive, and action tags with libraries like JSTL helps keep JSP pages cleaner and more maintainable! 🚀