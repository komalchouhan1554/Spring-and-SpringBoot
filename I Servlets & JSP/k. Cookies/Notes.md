# 🍪 Cookies in Servlet

## 📌 What is a Cookie?

- 🔹 A **Cookie** is a small piece of data (object) that is stored on the **client side** (browser) and sent back to the **server** with each subsequent request.
- 🔹 Cookie stores data in **name-value** pairs, for example:

| Name | Value |
|------|-------|
| Expires | Sat, 01 Jan 2025 00:00:00 GMT |
| Secure | true |
| HttpOnly | true |

---

## 🍪 Types of Cookies

### 1️⃣ Temporary Cookie (Session Cookie) ⏳
- Available only for the duration of the user's browser session.
- ❌ Deleted when the user **closes the browser**.
- 💾 Stored in the browser's **memory (RAM)**.

### 2️⃣ Permanent Cookie (Persistent Cookie) 📅
- Available till their **expiration date**, even when the browser is closed.
- 💽 Stored in a **file on the user's computer** (hard disk).

---

## 🛠️ Uses of Cookies

1. 🔐 Session Management
2. 🙋 Remember Me / Login Credentials
3. 🛒 Add to Cart in shopping application
4. 🌐 Language preferences
5. ➕ etc.

---

## ✅ Advantages of Cookies

1. ⚡ Simplest way to achieve session tracking mechanism
2. 💻 Managed at the client side

## ⚠️ Disadvantages of Cookies

1. 🚫 If cookies are disabled on client side, session tracking won't work
2. 🔓 Cookies are not very secure
3. 📝 Can store only **textual information**

---
---

# ⚙️ Implementing Cookies in Servlet

To implement cookies in a servlet, we use the **`Cookie`** class. 🧩

## 📦 Cookie Class

- 🔹 Present in package:
  - `javax.servlet.http` (old version)
  - `jakarta.servlet.http` (newer version) 🆕

- 🔹 **Constructor**:
  ```java
  Cookie(String name, String value)
  ```

### ➕ Adding a Cookie to Response Object
```java
public void addCookie(Cookie c)
```
📍 Present in `HttpServletResponse` interface

### 📥 Getting Cookies from Request Object
```java
public Cookie[] getCookies()
```
📍 Present in `HttpServletRequest` interface

---

## 🧰 Methods of Cookie Class

### 1️⃣ Get Name & Value 🏷️
```java
public String getName()
public String getValue()
```

### 2️⃣ Cookie Age / Expiry ⏰
```java
public void setMaxAge(int sec)
public int getMaxAge()
```

### 3️⃣ Comments related to Cookies 💬
```java
public void setComment(String comment)
public String getComment()
```

### 4️⃣ Version Number 🔢
```java
public void setVersion(int version_no)
public int getVersion()
```

### 5️⃣ Domain Name related 🌍
```java
public void setDomain(String domain_name)
public String getDomain()
```

### 6️⃣ Path Information 🛤️
```java
public void setPath(String path)
public String getPath()
```

---

✨ *End of Notes* ✨