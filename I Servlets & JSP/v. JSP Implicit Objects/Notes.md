# 📝 JSP Implicit Objects

> 🤖 JSP implicit objects are **pre-defined objects** that are automatically available for use in our JSP pages without the need to explicitly declare or instantiate them.
>
> 🏗️ These objects are **created by the JSP container**.

---

## 📦 There are a total of 9 implicit objects in JSP:

| # | Object 🔑 | Type | Category |
|---|-----------|------|----------|
| 1️⃣ | `out` | `JspWriter` | 🏫 Class |
| 2️⃣ | `request` | `HttpServletRequest` | 🔌 Interface |
| 3️⃣ | `response` | `HttpServletResponse` | 🔌 Interface |
| 4️⃣ | `session` | `HttpSession` | 🔌 Interface |
| 5️⃣ | `application` | `ServletContext` | 🔌 Interface |
| 6️⃣ | `config` | `ServletConfig` | 🔌 Interface |
| 7️⃣ | `pageContext` | `PageContext` | 🏫 Class |
| 8️⃣ | `page` | `Object` | 📄 Refers to the JSP page itself |
| 9️⃣ | `exception` | `Throwable` | 🏫 Class ⚠️ |

---

## 🔍 Quick Reference

1. 🖨️ **`out`** → `JspWriter` — used to write output to the response.
2. 📥 **`request`** → `HttpServletRequest` — holds client request data.
3. 📤 **`response`** → `HttpServletResponse` — used to send response to client.
4. 👤 **`session`** → `HttpSession` — tracks user session data.
5. 🌐 **`application`** → `ServletContext` — shared data across the whole app.
6. ⚙️ **`config`** → `ServletConfig` — servlet configuration info.
7. 🧭 **`pageContext`** → `PageContext` — access to page-level attributes & other objects.
8. 📄 **`page`** → `Object` — refers to the current JSP page instance (like `this`).
9. 💥 **`exception`** → `Throwable` — used only in error pages to handle exceptions.

---

![Implicit Objects](Implicit%20Objects.png)

---

✅ **Total: 9 Implicit Objects** — automatically provided by the JSP container! 🚀