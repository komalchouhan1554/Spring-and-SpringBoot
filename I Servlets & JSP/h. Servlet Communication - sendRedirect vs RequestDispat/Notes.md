# 📡 Servlet Communication

> It is the process by which a servlet communicates with others i.e. browsers, web components (HTML, Servlet, JSP etc.) etc.

## 🧩 Types of Servlet Communication

1. **🌐 Servlet Communication with Browser**
   - ➡️ **Direct communication**: Interacting with the browser directly.

2. **🔗 Servlet Communication with Web Components**
   - ↔️ **Indirect communication**: Facilitating the communication between web components i.e. HTML, Servlet, JSP etc.

---

## 1️⃣ Servlet Communication with Browser

Servlet can communicate with browser in **3 ways**:

1. 📨 Through **request-response objects**.
2. ❌ Through **`sendError()`** method of `HttpServletResponse`.
3. 🔀 **Request redirection**
   - 3.1 🔗 Request redirection by **hyperlinks**.
   - 3.2 🏷️ Request redirection by setting **header methods** (`setStatus()` & `setHeader()`).
   - 3.3 🚀 Request redirection by using **`sendRedirect()`** method of `HttpServletResponse`.

---

## 2️⃣ Servlet Communication with Web Components

Servlet can communicate with web components in **2 ways**:

1. ➡️ Using **`forward()`** method
2. 📋 Using **`include()`** method

> 📝 **NOTE**: `forward()` and `include()` methods are present in the **`RequestDispatcher`** interface.

---

## ⚠️ NOTE

🌍 **Request redirection** is used for **external** application redirection.
🏠 **`forward()`** and **`include()`** are used for **internal** application redirection.

---

## ⚔️ Difference between `sendRedirect()` and `RequestDispatcher`

| # | `sendRedirect()` | `RequestDispatcher` |
|---|-------------------|----------------------|
| 1️⃣ | 🌍 Used for **external** request redirection. | 🏠 Used for **internal** request redirection. |
| 2️⃣ | 🔀 Redirects the request to a **different application or URL**. | 📎 Used to **forward** or **include** the request to the **same application or URL**. |
| 3️⃣ | 📦 Method of `HttpServletResponse`. | 🧰 Has **2 methods** i.e. `forward()` and `include()`. |
| 4️⃣ | 🔄 **Changes** the URL on the browser. | 🚫 Does **not change** the URL on the browser. |

---

✅ **Quick Summary**: Use `sendRedirect()` when leaving the current app/URL, and use `RequestDispatcher` (`forward()`/`include()`) when staying within the same app. 🎯