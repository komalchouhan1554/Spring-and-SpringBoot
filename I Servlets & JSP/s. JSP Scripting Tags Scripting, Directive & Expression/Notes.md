# 📝 JSP Scripting Tags

- 🎯 These tags are used to embed Java Code into a JSP Page.
- 🧩 There are **3 types** of JSP Scripting Tags:
    1. 📌 Declaration Tag
    2. ⚙️ Scriptlet Tag
    3. 🖨️ Expression Tag

---

## 1️⃣ Declaration Tag 📌

- ✅ This tag is used to declare **variables**, **methods**, **classes**, or **interfaces**.
- 🧾 **Syntax:**
    ```jsp
    <%! ----variables, methods, classes, interfaces declaration---- %>
    ```
- 🏛️ If we declare variables or methods, they will be of **instance** or **class level**.

---

## 2️⃣ Scriptlet Tag ⚙️

- ✅ It is used to execute **Java source code** in JSP.
- 🧾 **Syntax:**
    ```jsp
    <% ----java code---- %>
    ```
- 🔄 Whatever code we provide in the scriptlet tag will be placed inside the `_jspService()` method.
- ⚠️ **NOTE:**
    - 🚫 It's important to note that embedding too much Java code in JSP can lead to **less maintainable** and **less readable** code.
    - 💡 It's often recommended to use **JavaBean** or **Servlets** for complex business logic and keep the JSP page for **presentation (view)** only.

---

## 3️⃣ Expression Tag 🖨️

- ✅ It is used to **print the values** of variables or method calls directly to the output stream.
- 🧾 **Syntax:**
    ```jsp
    <%= ----variables or method calls---- %>
    ```
- ✨ The code placed within the JSP expression tag will be written to the **output stream** of the response, so we don't need to use `out.println()` to write the data.

---

## 🔑 Quick Summary

| Tag 🏷️ | Symbol 🔣 | Purpose 🎯 | Goes Into ➡️ |
|---|---|---|---|
| Declaration | `<%! %>` | 📌 Declare variables/methods/classes | Class level (outside `_jspService()`) |
| Scriptlet | `<% %>` | ⚙️ Execute Java code | Inside `_jspService()` |
| Expression | `<%= %>` | 🖨️ Print output directly | Written to response output stream |