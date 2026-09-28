# 🔐 Internal Working of Session Management

## 🍪 HttpSession & Cookies

- ⚙️ When we achieve **Session Management** using `HttpSession`, internally **Cookies** (Session Tracking Mechanism) are used.
- ⚠️ **Disadvantage of Cookies**: The client can **disable cookies** in the browser, which breaks this tracking mechanism.

## 🆔 JSESSIONID Mechanism

- 🖥️ In session management, the **Web Container** creates a unique **Session ID** called `JSESSIONID`.
- 🔄 This `JSESSIONID` is transferred from **Client → Server** inside the **Request Header** (as part of the Cookie).
- ✅ The Web Container **matches** this `JSESSIONID` on each request.
- 🧠 Based on the match, the container identifies whether the client is:
  - 🆕 **New Client** → No matching JSESSIONID → New session created
  - 👤 **Old Client** → JSESSIONID matches → Existing session reused

## 📌 Quick Summary

| Step | Description |
|------|-------------|
| 1️⃣ | Client sends first request |
| 2️⃣ | Server creates a session + `JSESSIONID` |
| 3️⃣ | `JSESSIONID` sent back to client (via Cookie) |
| 4️⃣ | Client sends `JSESSIONID` in every future request header |
| 5️⃣ | Server matches ID → identifies client as new/old 🔍 |

> 💡 **Note:** If cookies are disabled, alternate tracking mechanisms like **URL Rewriting** are used to pass `JSESSIONID`.