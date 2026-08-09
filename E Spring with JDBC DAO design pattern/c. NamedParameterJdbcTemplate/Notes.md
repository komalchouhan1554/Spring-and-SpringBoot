# 🗂️ NamedParameterJdbcTemplate — Notes

---

## 📌 What is it?

- ✅ A **class** provided by the **Spring Framework** as part of the **Spring-JDBC** module
- ✅ Provides a **higher-level abstraction** and a more convenient way to work with SQL queries

> 💡 **Higher-level abstraction** = a more **user-friendly** way to interact with the system, compared to lower-level abstractions

---

## ❓ Why do we need NamedParameterJdbcTemplate?

| 🔴 JdbcTemplate | 🟢 NamedParameterJdbcTemplate |
|---|---|
| Uses **Positional Parameters** (`?`) | Uses **Named Parameters** (`:paramName`) |
| ❌ Not user-friendly with many params | ✅ Clear and readable |
| ❌ Causes confusion in complex queries | ✅ No confusion — each param has a name |

> ⚠️ When there are **lots of positional parameters**, it becomes hard to track which `?` maps to which value.  
> 🧩 **NamedParameterJdbcTemplate** solves this by letting you use meaningful names!

---

## 🛠️ Ways to Provide Named Parameters

### 🔹 1. Using `Map` Interface 🗺️

- You can use **any implementing class** of the `Map` interface
- Most common example: `HashMap`

```java
Map<String, Object> params = new HashMap<>();
params.put("id", 101);
params.put("name", "John");
```

---

### 🔹 2. Using `SqlParameterSource` Interface 📦

There are **2 implementing classes** available:

#### ✅ a. `MapSqlParameterSource`

```java
MapSqlParameterSource params = new MapSqlParameterSource();
params.addValue("id", 101);
params.addValue("name", "John");
```

#### ✅ b. `BeanPropertySqlParameterSource`

```java
// Automatically maps bean properties to named parameters
Employee emp = new Employee(101, "John");
BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(emp);
```

> 🎯 **Tip:** Use `BeanPropertySqlParameterSource` when you already have a model/bean object — it saves you from manually adding each parameter!

---

## 🧠 Quick Summary

```
NamedParameterJdbcTemplate
│
├── 🗺️  Map (Interface) = Implemented class = e.g., HashMap.
│
└── 📦  SqlParameterSource (Interface)
        ├── MapSqlParameterSource (class)
        └── BeanPropertySqlParameterSource (class)
```

---

> 📝 *These notes are part of the Spring-JDBC module study series.*