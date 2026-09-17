# 📄 web.xml File

## 🔍 What is web.xml?

➡️ To access any servlet from the browser, we have to tell the **servlet container** which servlet it has to deploy, and according to the provided URL, which servlet it has to invoke.
For this purpose, we use the **`web.xml`** file. 🗂️

➡️ The `web.xml` file is also known as the **"Deployment Descriptor File"**. 📜

---

## ⚙️ Responsibilities of web.xml File

| # | Configuration |
|---|---------------|
| 1️⃣ | Servlet configurations |
| 2️⃣ | JSP file configurations |
| 3️⃣ | Filters configurations |
| 4️⃣ | Listeners configurations |
| 5️⃣ | Initialization parameters configurations |
| 6️⃣ | Context parameters configurations |
| 7️⃣ | Session timeout configurations |
| 8️⃣ | Welcome file configurations |
| 9️⃣ | Error page configurations |
| 🔟 | Servlet load-on-startup configurations |
| ➕ | etc. |

---

## 🧩 Syntax

```xml
<web-app>

    <servlet>
        <servlet-name>ms</servlet-name>
        <servlet-class>package_name.MyServlet</servlet-class>
    </servlet>

    <servlet-mapping>
        <servlet-name>ms</servlet-name>
        <url-pattern>/myser</url-pattern>
    </servlet-mapping>

</web-app>
```

---

## 📝 NOTE

- 📁 We create the `web.xml` file inside the **`WEB-INF`** folder.
- 🏷️ In the latest applications, we normally use **annotations**.
- 🏚️ In **legacy projects** or in case of **complex configurations**, we use the `web.xml` file.

---

✅ **Summary:** `web.xml` acts as the bridge 🌉 between the browser request and the correct servlet, while also handling several other app-level configurations.