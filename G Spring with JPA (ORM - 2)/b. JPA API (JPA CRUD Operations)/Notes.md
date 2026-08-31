# ☕ JPA (Java Persistence API) — Complete Notes

---

## 📦 What is JPA?

JPA is an **API** that contains interfaces and classes for object-relational mapping in Java.

---

## 🧩 Key Classes & Interfaces in JPA

| # | Name | Type |
|---|------|------|
| 1️⃣ | `Persistence` | Class |
| 2️⃣ | `EntityManagerFactory` | Interface |
| 3️⃣ | `EntityManager` | Interface |
| 4️⃣ | `EntityTransaction` | Interface |
| 5️⃣ | `Query` | Interface |
| 6️⃣ | `TypedQuery` | Interface |
| 7️⃣ | `CriteriaBuilder` | Interface |
| 8️⃣ | `CriteriaQuery` | Interface |

> 📁 **Package:** All the above are present in the `javax.persistence` package.

---

## 📝 Important Note

> 🔄 The **"Java Persistence API (JPA)"** was renamed/rebranded to **"Jakarta Persistence API (JPA)"** in **2019**.

---

## 🔍 Core Classes & Interfaces — Explained

### 🏭 `Persistence` (Class)
- Provides a **static method** → `createEntityManagerFactory()`
- Used for obtaining `EntityManagerFactory` instances.

---

### 🏗️ `EntityManagerFactory` (Interface)
- Used to **create `EntityManager` instances** for database operations.

---

### 🛠️ `EntityManager` (Interface)
- Manages the **lifecycle of entities**.
- Provides methods for **CRUD operations**.

---

### 🔐 `EntityTransaction` (Interface)
- Used for **transaction management**:
  - ▶️ Starting transactions
  - ✅ Committing transactions
  - ↩️ Rolling back transactions

---

## 🚀 Steps to Create Your First JPA Program

### Step 1️⃣ — Download & Install IDE
- Install any IDE (e.g., **Eclipse**) 🌙

### Step 2️⃣ — Create a Project
- Create a **Simple Java Project** or a **Maven Project** 📂

### Step 3️⃣ — Add JARs / Dependencies
| Dependency | Purpose |
|------------|---------|
| `javax.persistence-api.jar` | JPA API |
| `hibernate-core` | JPA Provider |
| `mysql-connector.jar` | JDBC Driver |

### Step 4️⃣ — Create POJO Class 🧱
- Create a **Plain Old Java Object (POJO)** class to represent your entity.

### Step 5️⃣ — Create Mapping 🗺️
- Use a **mapping file** OR provide **annotations** directly in the POJO class.

### Step 6️⃣ — Configure `persistence.xml` ⚙️
- Create the **Persistence Unit Configuration** file inside the `META-INF` folder.

### Step 7️⃣ — Create Main Class & Execute 💻

```java
// 🏭 Create EntityManagerFactory
EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");

// 🛠️ Create EntityManager
EntityManager em = emf.createEntityManager();

// 🔐 Create EntityTransaction & Begin
EntityTransaction et = em.getTransaction();
et.begin();

// ➕ Insert
em.persist(entity);

// 🔍 Retrieve
Entity obj = em.find(Entity.class, id);

// ✏️ Update
em.merge(entity);

// 🗑️ Delete
em.remove(entity);
```

### Step 8️⃣ — Commit the Transaction ✅
```java
et.commit();
```

### Step 9️⃣ — Close Resources 🔒
```java
em.close();
emf.close();
```

---

## 🔄 CRUD Operations Summary

| Operation | Method | Description |
|-----------|--------|-------------|
| ➕ Insert | `persist()` | Add a new record |
| 🔍 Retrieve | `find()` | Fetch a record by ID |
| ✏️ Update | `merge()` | Update an existing record |
| 🗑️ Delete | `remove()` | Delete a record |

---

## ⚠️ Important Note on CRUD Methods

> 🔢 All the above CRUD methods work with **individual / single records** only.

---

## 📊 Working with Multiple Records

If you want to perform operations on **multiple records** (select, insert, update, delete many records at once), use:

| # | Approach | Description |
|---|----------|-------------|
| 1️⃣ | **JPQL** (Java Persistence Query Language) | SQL-like language for JPA entities |
| 2️⃣ | **Native SQL** | Raw SQL queries |
| 3️⃣ | **JPA Criteria API** | Programmatic query building *(less used)* |

---

## 🗂️ Quick Summary Diagram

```
Persistence (class)
    └── createEntityManagerFactory()
              └── EntityManagerFactory
                        └── createEntityManager()
                                  └── EntityManager
                                            ├── persist()   ➕
                                            ├── find()      🔍
                                            ├── merge()     ✏️
                                            └── remove()    🗑️
                                  └── EntityTransaction
                                            ├── begin()     ▶️
                                            ├── commit()    ✅
                                            └── rollback()  ↩️
```

---

*📅 Notes compiled for JPA / Jakarta Persistence API*