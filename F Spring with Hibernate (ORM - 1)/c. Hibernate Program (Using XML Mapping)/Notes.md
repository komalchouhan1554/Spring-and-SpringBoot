# 🌿 Hibernate — First Program Notes

---

## 🚀 Steps to Create a Hibernate First Program

---

### 🔧 Step 1 — Download & Install an IDE
- Download and install any IDE, e.g., **Eclipse**

---

### 📁 Step 2 — Create a Project
- Create a **Simple Java Project** or a **Maven Project**

---

### 📦 Step 3 — Add Hibernate JARs / Dependencies
- For **Java Project** → Add Hibernate JARs manually
- For **Maven Project** → Add Hibernate dependencies in `pom.xml`

---

### 🧱 Step 4 — Create a POJO Class
- Create a plain Java class (Plain Old Java Object) representing your entity/table

---

### 🗺️ Step 5 — Create a Hibernate Mapping File
- Maps the POJO class to the corresponding database table (`.hbm.xml` file)

---

### ⚙️ Step 6 — Create a Hibernate Configuration File
- `hibernate.cfg.xml` — contains DB connection details, dialect, mapping references, etc.

---

### 🖥️ Step 7 — Create the Main Class

Write the main class with the following sub-steps:

---

#### 7.1 🛠️ Create a `Configuration` Object

> The `Configuration` class is used to **configure and manage Hibernate settings**.

**How to get a Configuration object:**
```java
Configuration cfg = new Configuration();
```

**Key Method:**

| Method | Description |
|--------|-------------|
| `configure()` | Loads hibernate configuration details from an external file (e.g., `hibernate.cfg.xml`) |

---

#### 7.2 🏭 Create a `SessionFactory` Object

> `SessionFactory` is an **interface** that acts as a factory for creating `Session` objects.

It is responsible for:
- 📂 Loading configuration from the config file
- 🔗 Setting up the connection pool
- 🗄️ Managing database connections

**How to get a SessionFactory object:**
```java
SessionFactory sessionFactory = cfg.buildSessionFactory();
```

> ⚠️ `SessionFactory` is **heavy-weight** and should be created **once** per application lifecycle.

---

#### 7.3 🔑 Create a `Session` Object

> `Session` is an **interface** that represents a **single unit of work**.

It is used to perform **database (CRUD) operations**.

**How to get a Session object:**
```java
Session session = sessionFactory.openSession();
```

**Database Operations via Session:**

| Operation | Methods |
|-----------|---------|
| ➕ **Insert** | `save()`, `persist()` |
| ✏️ **Update** | `update()`, `saveOrUpdate()` |
| ❌ **Delete** | `delete()` |
| 🔍 **Retrieve** | `get()`, `load()` |

> 💡 **`get()` vs `load()`**
> - `get()` — hits the DB immediately; returns `null` if not found
> - `load()` — returns a proxy; throws exception if not found (lazy loading)

---

#### 7.4 💳 Create a `Transaction` Object

> `Transaction` is an **interface** that represents a **database transaction**.

It is used to **control and manage transactions**.

**How to get a Transaction object:**

```java
// Option 1
Transaction transaction = session.getTransaction();
transaction.begin();

// Option 2 (shorthand)
Transaction transaction = session.beginTransaction();
```

**Committing & Rolling Back:**
```java
transaction.commit();    // ✅ Save changes to DB
transaction.rollback();  // ↩️ Undo changes on error
```

---

### 📝 Important Note — AutoCommit Behaviour

| Framework | AutoCommit Default | What to Do |
|-----------|--------------------|------------|
| 🔵 **JDBC** | `true` | Must set `con.setAutoCommit(false);` manually |
| 🟢 **Hibernate** | `false` | No extra setup needed — transaction control is built-in |

> ✅ In Hibernate, you **don't need** to explicitly disable auto-commit. It's `false` by default, ensuring proper transaction management.

---

## 🔄 Complete Flow Summary

```
Configuration ──► buildSessionFactory()
                        │
                   SessionFactory ──► openSession()
                                           │
                                        Session ──► beginTransaction()
                                           │               │
                                     CRUD Operations    Transaction
                                           │               │
                                        commit() / rollback()
```

---

## Dependencies:-

1. Mysql Connector
2. Hibernate Core

---

> 📌 **Tip:** Always close your `Session` and `SessionFactory` after use to release resources!
> ```java
> session.close();
> sessionFactory.close();
> ```