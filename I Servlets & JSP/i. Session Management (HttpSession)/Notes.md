# 📝 HTTP & Session Management Notes

---

## 🌐 HTTP (Hypertext Transfer Protocol)

- ⚡ It is the **fundamental protocol** for communication over a network.
- 🔄 It enables **data exchange** between **client** and **server**.

### 📌 NOTE:
- 📄 HTTP is a **text-based protocol** and operates over the **TCP/IP** network.
- 🚫 HTTP is a **stateless protocol** — the server **cannot tell** whether a request is coming from a single client or multiple clients.

---

## ⏳ Session

- 🕒 A **period** during which a client interacts with the server.
- 📊 It keeps track of the user's **action, state, and data** during this time.

---

## 🧩 What is "State" and "Data"?

### 🔹 State
> Ability to maintain information about a client's interaction with the server across **multiple HTTP requests**. Helps remember client identity and track actions across pages/requests.

| # | Example | Description |
|---|---------|-------------|
| 1️⃣ | 🔐 User Authentication State | Whether the user is logged in or logged out |
| 2️⃣ | 🛒 Shopping Cart State | Whether items were added to cart or not |
| 3️⃣ | 📋 Form Progress State | Current step & entered data in a multi-step form (resume where left off) |
| 4️⃣ | 🎮 Game Progress State | Level/stage reached by a player |
| 5️⃣ | 🎥 Video Playback State | Progress/bookmarks in a video |

### 🔹 Data
> Refers to the **user's information** that has been tracked.

| # | Example | Description |
|---|---------|-------------|
| 1️⃣ | 👤 User Profile Data | Name, email, profile picture, etc. |
| 2️⃣ | 🛍️ Shopping Cart Data | Item name, price, quantity |
| 3️⃣ | 📜 Session History Data | Browsing history, search queries, viewed products |
| 4️⃣ | ✍️ Form Input Data | Data entered in a web form during session |
| 5️⃣ | ⚙️ User Preferences Data | Saved address, saved payment modes, etc. |

---

## 🛠️ Session Management

- 🔧 The process of **maintaining state and data** for individual users during their interaction with the server (web application).
- ✅ Achieved using **`HttpSession` Objects**, in conjunction with session tracking mechanisms like:
    - 🍪 Cookies
    - 🔗 URL Rewriting
    - 📎 Hidden Form Fields

---

## 🎯 Session Tracking Mechanism

> Technique by which the server tracks whether a request is coming from the **same client** or not.

- 🍪 **Cookies**
- 🔗 **URL Rewriting**
- 📎 **Hidden Form Fields**
- ➕ *etc.*

---

## 🧷 HttpSession

- 📦 `HttpSession` is an **interface** provided in the **Java Servlet API**.
- 🏗️ Its implementation is provided by **web containers** (e.g., 🐱 Apache Tomcat).
- 💡 Though it's an interface, it's used to represent an object that provides **session management** in servlet-based applications.

### 🏭 Creating / Getting HttpSession Object
Present in the `HttpServletRequest` interface:
```java
1. public HttpSession getSession()
2. public HttpSession getSession(boolean b)
```

### 📥 Handling Data in HttpSession Object
```java
1. public void setAttribute(String name, Object value)
2. public Object getAttribute(String name)
3. public Enumeration getAttributeNames()
4. public void removeAttributes(String name)
```

### 💥 Destroying the HttpSession Object
```java
1. public void invalidate()
2. public void setMaxInactiveInterval(int time)
```

---

✅ **End of Notes** — Happy Learning! 🚀