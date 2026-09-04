# 🗄️ Native SQL Queries in JPA

---

## 📖 What are Native SQL Queries?

> **Native SQL Queries** refer to SQL queries that are **specific to a particular database** like MySQL, Oracle, PostgreSQL, etc.

- 🏷️ They are written in the **raw SQL syntax** of the underlying database engine.
- 🔗 Unlike JPQL, native SQL queries interact **directly with the database tables and columns**, not with JPA entity objects.

---

## ⚖️ Native SQL vs JPQL

| Feature | 🗄️ Native SQL Queries | 📦 JPQL |
|--------|----------------------|---------|
| 🌐 Database Dependency | ❌ Database-Dependent | ✅ Database-Independent |
| 🔧 Flexibility | ✅ Very Flexible | 🔶 Moderate |
| 🧩 Complex Queries | ✅ Easily Expressible | ❌ Limited |
| 🏷️ Works On | Tables & Columns | Entities & Fields |
| 🔄 Portability | ❌ Low | ✅ High |

---

## 🌟 Key Characteristics

### 🔒 Database-Dependent
- Native SQL queries are **tied to a specific database** (MySQL, Oracle, etc.).
- Switching databases may require **rewriting** the queries.
- In contrast, JPQL is **database-independent** and works across all JPA-supported databases.

### 🔧 High Flexibility
- Native SQL queries are **very flexible** and allow us to write **complex queries** that may not be easily expressible in JPQL.
- Useful for **database-specific features** like stored procedures, window functions, full-text search, etc.

---

## ⚠️ Important Note — `Query` vs `TypedQuery`

> 🔑 In case of Native SQL Queries, we use the **`Query`** interface rather than the **`TypedQuery`** interface.

### 🤔 Why `Query` and not `TypedQuery`?

Because native SQL queries **don't return managed JPA entities** — they return raw data directly from the database. Therefore, there is **no entity type to specify** as the result type.

```java
// ✅ CORRECT — Use Query for Native SQL
Query query = em.createNativeQuery("SELECT * FROM student");

// ❌ WRONG — TypedQuery is for JPQL with entity types
TypedQuery<Student> query = em.createNamedQuery("...", Student.class);
```

---

## ✍️ Syntax

### 🔹 Basic Native Query

```java
Query query = em.createNativeQuery("SELECT * FROM student");
List results = query.getResultList();
```

### 🔹 Native Query with Parameters

```java
Query query = em.createNativeQuery("SELECT * FROM student WHERE name = ?");
query.setParameter(1, "John");
List results = query.getResultList();
```

### 🔹 Native Query Mapped to an Entity

```java
Query query = em.createNativeQuery("SELECT * FROM student", Student.class);
List<Student> students = query.getResultList();
```

### 🔹 Native Query for a Single Result

```java
Query query = em.createNativeQuery("SELECT * FROM student WHERE id = 1", Student.class);
Student student = (Student) query.getSingleResult();
```

---

## 🗂️ Quick Summary

| 🔑 Feature | 📋 Details |
|-----------|-----------|
| 📖 Definition | SQL specific to a particular database |
| 🌐 Dependency | Database-Dependent |
| 🔧 Flexibility | Very High |
| 🧩 Complex Queries | ✅ Supported |
| 🏷️ Interface Used | `Query` (NOT `TypedQuery`) |
| 🔄 Portability | Low (DB-specific syntax) |

---

## 💡 When to Use Native SQL Queries?

- 🧩 When the query is **too complex** to express in JPQL.
- ⚡ When you need **database-specific features** (e.g., MySQL's `FULLTEXT`, Oracle's `ROWNUM`).
- 🛠️ When working with **legacy databases** or **non-entity result sets**.
- 📊 When performing **bulk operations** or using **stored procedures**.

---

> 🧠 **Pro Tip:** Use Native SQL Queries **sparingly** — they reduce portability. Prefer JPQL for standard operations and fall back to Native SQL only when JPQL can't handle the complexity!