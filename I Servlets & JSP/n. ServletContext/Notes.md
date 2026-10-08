# 📌 ServletContext

## 🧩 What is ServletContext?
- ServletContext is an **interface** provided by the Java Servlet API. 🖥️

### 📝 Syntax
```java
public interface ServletContext
{
    // methods
    public void setAttribute(String name, Object value);
    public Object getAttribute(String name);
    public void removeAttribute(String name);
    public String getInitParameter(String name);
    public Enumeration getInitParameterNames();
    // etc
}
```

## 🎯 Purpose
- 🔗 It is used to **store and share configuration and resource data** among all servlets within the same web application.

## 📍 Points to Note

### 🏗️ When is the ServletContext object created?
> ✅ When we **start the server**, the web container also starts and deploys all the projects. At that time, the `ServletContext` object is created.

### 💥 When is the ServletContext object destroyed?
> ❌ When we **shutdown the server**, the web container stops and all projects get undeployed. At that time, the `ServletContext` object is destroyed.

### ⏳ Lifetime of ServletContext object
> 🔄 The lifetime of the `ServletContext` object is the **same** as the lifetime of the web application.

### 🌍 Scope of ServletContext object
> 🌐 The scope of the `ServletContext` object is accessible to the **whole web application** and to all resources within that particular web application.

### 💾 What type of data can we store?
> 📦 It can store:
> - Parameters data 🔧
> - Attributes data 🏷️

## 🛠️ How to Get ServletContext Object

1. 🅰️ Using `getServletContext()` method of Servlet interface
   ```java
   ServletContext context = getServletContext();
   ```

2. 🅱️ Using `ServletRequest` object
   ```java
   ServletContext context = req.getServletContext();
   ```

3. 🅲️ Using `ServletConfig` object
   ```java
   ServletContext context = config.getServletContext();
   ```

## 📥 How to Store Data in ServletContext Object

1. 🏷️ Using `setAttribute()` method
   ```java
   context.setAttribute("attributeName", attributeValue);
   ```

2. ⚙️ Using Initialization Parameters (`web.xml`)
   ```xml
      <web-app> 
         <context-param>
            <param-name> parameterName </param-name>
            <param-value> parameterValue </param-value>
         </context-param>
      </web-app>
   ```

## 📤 How to Get Data from ServletContext Object

1. 🏷️ Using `getAttribute()` method
   ```java
   Object value = context.getAttribute("attributeName");
   ```

2. ⚙️ Using Initialization Parameters methods
   ```java
   String parameterValue = context.getInitParameter("parameterName");
   ```

---
✨ **Summary:** `ServletContext` = one object 🧠 per web application, alive ⏱️ from server start to shutdown, used to share data 🔄 across all servlets in the app.