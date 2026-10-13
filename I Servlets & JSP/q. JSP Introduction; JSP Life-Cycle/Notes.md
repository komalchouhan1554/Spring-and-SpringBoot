# 📘 Web Pages & JSP Notes

## 🧊 Static Web Pages

- 🔒 Static web pages are **pre-built** and do not change content unless manually edited by a web developer.
- 🛠️ Created using **HTML, CSS**, etc.
- ⚡ Fast to load because there is **no server-side processing** involved.
- 📌 **Examples:**
  - 🏠 Home pages
  - 🔑 Login and register pages
  - 💼 Portfolio pages
  - ℹ️ Website information pages
  - ➕ etc.

---

## 🔄 Dynamic Web Pages

- 🔁 Content **changes** based on user input, database updates, or external factors.
- 🛠️ Created using **Servlets, JSP, Spring, PHP, Python**, etc.
- 🧩 More versatile, but ⏳ may take longer to load due to server-side processing.
- 📌 **Examples:**
  - 👤 Profile pages
  - 🌐 Social networking website home pages
  - 🛒 Shopping web pages
  - ➕ etc.

---

## ☕ JSP (Java Server Pages)

- 🖥️ Server-side technology used to create **dynamic web pages**.
- 🧬 Allows embedding **Java code within HTML code**.
- ⬆️ Considered an **advanced version of Servlet** technology.
  - 📄 Servlets → embed HTML within Java code
  - 📄 JSP → embed Java within HTML code

### ⚖️ Servlet vs JSP

| # | Servlet | JSP |
|---|---------|-----|
| 1️⃣ | Java-based code | HTML-based code |
| 2️⃣ | 😓 Hard to write | 😊 Easier to write |
| 3️⃣ | 🚀 Faster | 🐢 Slower (needs conversion & compilation) |
| 4️⃣ | 🎮 Acts as **Controller** (MVC) | 🖼️ Acts as **View** (MVC) |
| 5️⃣ | 🔁 Modification is time-consuming (reload, recompile, restart) | ⚡ Modification is fast (just refresh) |

### ✨ Features of JSP

1. 🧩 **Simplified Development** — combines Java & HTML for dynamic pages.
2. 🏷️ **Built-in Tags** — scriptlet tags, action tags, custom tags for streamlined coding.
3. 🔧 **Easy Maintenance** — promotes maintainability, flexibility, and portability.
4. 🚫🔄 **No Recompilation** — changes don't require recompilation/redeployment.
5. 🌱 **Extension to Servlet** — built on top of servlet technology for easier development.

### 🏗️ How to Create JSP Pages

1. 📝 Create a text file with **`.jsp`** extension.
2. 🧱 Write HTML code for the page structure.
3. ☕ Embed Java code using tags like `<%---=%>` or `<jsp:--->` for dynamic content.

### ⚠️ Note

- 📁 JSP pages should be created inside the **webapp** folder.
- 🔐 JSP pages can also be created in the **WEB-INF** folder, but since it's private, you must provide mapping in **`web.xml`** to access them.

---

## 🔃 JSP Life Cycle

1. 📥 **JSP Loading** — JSP page is loaded into the server.
2. 🔍 **JSP Parsing** — Container parses the JSP page to identify Java code.
3. 🔄 **JSP Translation** — JSP page is translated into a servlet.
4. ⚙️ **Servlet Compilation** — Java servlet source code is compiled.
5. 📦 **Servlet Loading** — Compiled servlet class is loaded.
6. 🆕 **Servlet Instantiation** — An instance of the servlet is created.
7. 🚀 **Servlet Initialization** — Servlet object is initialized.
8. 📨 **Servlet Processing** — Servlet handles client requests.
9. 💥 **Servlet Destruction** — Servlet is destroyed during undeployment or server shutdown.