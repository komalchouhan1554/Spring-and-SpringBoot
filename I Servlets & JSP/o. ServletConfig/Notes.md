# 📌 ServletConfig

## 🧩 What is it?
`ServletConfig` is an **interface** provided by the Java Servlet API.

## 🧾 Syntax
```java
public interface ServletConfig
{
    // methods
    public String getInitParameter(String name);
    public Enumeration getInitParameterNames();
    public ServletContext getServletContext();
    public String getServletName();
}
```

## 🎯 Purpose
- `ServletConfig` is used to provide **configuration information** to the servlet.
- Any variable that may **change over time** can be provided via the `ServletConfig` object — so we **don't need to recompile** our servlet page. 🔄

---

## 📝 Points to Note

### 🏗️ When is the ServletConfig object created?
> ✅ Created **after Servlet Instantiation** and **just before the Servlet Initialization phase**.

### 💥 When is the ServletConfig object destroyed?
> ❌ Destroyed **just before the Servlet Deinstantiation phase**.

### ⏳ Lifetime of ServletConfig object
> ⏱️ Approximately the **same as the Servlet Object's lifetime**.

![Life Time Of ServletConfig Object](Life%20Time.png)

### 🔭 Scope of ServletConfig object
> 🎯 Scope is limited to **only one particular servlet**.

### 💾 What type of data can be stored?
> 📦 Can store only **parameters data**, **not attributes data**.

---

## 🔑 How to Get the ServletConfig Object

### 1️⃣ Using `getServletConfig()` method of the Servlet interface
```java
ServletConfig config = getServletConfig();
```

### 2️⃣ By overriding the `init(ServletConfig config)` method
```java
public class Test extends HttpServlet
{
    ServletConfig config;

    @Override
    public void init(ServletConfig config)
    {
        this.config = config;
    }
}
```

---

## 💽 How to Store Data in ServletConfig Object

### 1️⃣ Using `web.xml` file 📄
```xml
<web-app>
    <servlet>
        <servlet-name> ---- </servlet-name>
        <servlet-class> ---- </servlet-class>
        <init-param>
            <param-name> ---- </param-name>
            <param-value> ---- </param-value>
        </init-param>
    </servlet>
    <servlet-mapping>
        <servlet-name> ---- </servlet-name>
        <url-pattern> ---- </url-pattern>
    </servlet-mapping>
</web-app>
```

### 2️⃣ Using Annotations 🏷️
```java
@WebInitParam
```

---

## 📥 How to Get Data from ServletConfig Object

Use the following methods:
- ✅ `public String getInitParameter(String name);`
- ✅ `public Enumeration getInitParameterNames();`

---

## Difference in ServletContext and ServletConfig

![Difference](ServletContext%20vs%20ServletConfig.png)