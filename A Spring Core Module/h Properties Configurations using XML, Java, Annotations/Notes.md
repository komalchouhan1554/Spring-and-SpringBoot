# ⚙️ Spring Framework — Property & Spring Configurations

---

## 🏗️ Property Configurations

> **Property Configuration** is the process by which we **set the values in the bean properties**.

- 📝 We can set property values from:
  - 📄 **XML File**  

            1. Property Tag
            2. Constructor args
  - ☕ **Java (Annotations / Java Config)**
  - 📋 **Properties File**

---

## 🌱 Spring Configurations

> **Spring Configuration** is the process of providing configurations that define **how our Spring application will work**.

- 🔧 It tells the Spring container how to wire, initialize, and manage beans
- 🗂️ Can be done via XML, Java-based config (`@Configuration`), or annotations

---

## 📋 What is a Properties File?

> A **properties file** is a simple text file commonly used to store **configuration data in key-value pairs**.

```properties
# Example: application.properties
server.port=8080
app.name=MySpringApp
db.url=jdbc:mysql://localhost:3306/mydb
db.username=root
db.password=secret
```

---

## ✅ Advantages of Properties File

| # | Advantage | Description |
|---|-----------|-------------|
| 1️⃣ | 🛠️ **Easy to Update** | Configurations can be modified without touching the source code |
| 2️⃣ | 🔄 **No Restart Needed** | Changes to configurations don't require restarting the application |
| 3️⃣ | 🧪 **Easy to Test** | Separate config files make it simple to switch between environments |

---

## 🔗 How They Connect

```
📋 application.properties
        ↓
  Key-Value Pairs
        ↓
  @Value / @ConfigurationProperties
        ↓
  🏷️ Bean Properties Set ✅
```

---

## 📝 Quick Summary

| Concept | Description |
|---|---|
| ⚙️ Property Configuration | Setting values into bean properties |
| 🌱 Spring Configuration | Defining how the Spring app behaves |
| 📋 Properties File | Text file storing config as key-value pairs |

---

*📚 Spring Framework Notes*