# 📦 Request Object

- 🔄 It is an object that is **transferred from client to server**.
- 📋 It contains **3 types of data**:
  1. 🧾 Header Data
  2. 📝 Parameter Data
  3. 🏷️ Attribute Data

- 🔑 Object data (metadata) is stored in the form of **key-value pairs**, for eg:
  ```
  name : deepak
  ```

---

## 1️⃣ Header Data 🧾

- ℹ️ It contains metadata (information) **about the browser**.
- 🛠️ How to get headers data:
  ```java
  public Enumeration getHeaderNames()
  public String getHeader(String key)
  public String[] getHeaders(String key)
  ```

---

## 2️⃣ Parameter Data 📝

- 👤 The data which is **provided by the user** at the browser form is parameter data.
- 🛠️ How to get parameters data:
  ```java
  public String getParameter(String key)
  public Enumeration getParameterNames()
  public String[] getParameterValues(String key)
  ```

---

## 3️⃣ Attribute Data 🏷️

- 👨‍💻 The data provided **by the programmer** at the backend part (servlets) after creation of the request object.
- 🛠️ How to set and get attribute data:
  ```java
  public void setAttribute(String key, Object value)
  public Object getAttribute(String key)
  public void removeAttribute(String key)
  public Enumeration getAttributeNames()
  ```

---

### Diagram

![Request & Response](Req%20and%20Resp.png)
---

# 🌐 HttpServletRequest

- 🔌 It is an **interface** which is used to interact with **incoming HTTP requests** in a servlet application.
- 📡 It provides methods to get information about an incoming HTTP request like header data, parameter data, etc.

### 🧰 Some commonly used methods:
```java
public Enumeration getHeaderNames()
public String getHeader(String key)
public String getParameter(String key)
public void setAttribute(String key, Object value)
public Object getAttribute(String key)
public void removeAttribute(String key)
getSession()
getCookies()
```

---

# 📤 HttpServletResponse

- 🔌 It is an **interface** which is used to interact with **outgoing HTTP responses** in a servlet application.
- ⚙️ It provides methods to set attributes of an HTTP response such as response content, status code, etc.

### 🧰 Some commonly used methods:
```java
setStatus(int status)
sendRedirect(String location)
getWriter()
getOutputStream()
setContentType(String type)
setContentLength(int len)
```

---

✅ **End of Notes** 🎓