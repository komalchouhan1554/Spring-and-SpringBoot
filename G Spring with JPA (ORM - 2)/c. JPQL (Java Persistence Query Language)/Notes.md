# 📘 JPQL & JPA Query Interfaces — Study Notes

---

## 🔷 JPQL (Java Persistence Query Language)

> **JPQL** is a query language used for **querying and manipulating Java objects** with a relational database. It allows developers to write queries in an **object-oriented way**, treating database records as objects.

---

### 📝 Common JPQL Queries

#### 1️⃣ SELECT Query
```jpql
-- Basic select
SELECT en FROM EntityName en

-- Select with condition
SELECT en FROM EntityName en WHERE en.attribute = :value
```

#### 2️⃣ UPDATE Query
```jpql
UPDATE EntityName en SET en.attribute = :newValue WHERE en.id = :entityId
```

#### 3️⃣ DELETE Query
```jpql
DELETE FROM EntityName en WHERE en.id = :entityId
```

---

### ⚠️ Important Notes

> 🚫 **No INSERT in JPQL!**
> To insert a new entity into the database, use either:
> - `EntityManager.persist()` method, **or**
> - A **native SQL query**

> 🔍 Many other queries are also supported: `COUNT`, `JOIN`, `GROUP BY`, `ORDER BY`, `DISTINCT`, and more.

> 📌 Each JPQL query should be **specific to a single entity**.

---

### ✅ Why Use JPQL?

| # | Benefit | Description |
|---|---------|-------------|
| 1️⃣ | 🔎 **Advanced Querying** | Supports complex queries like joins and aggregations — beyond what standard CRUD operations can do |
| 2️⃣ | ⚡ **Improved Performance** | Better suited for fetching large datasets or executing complex queries where standard CRUD reduces performance |
| 3️⃣ | 📊 **Aggregations** | Supports aggregation functions like `SUM`, `COUNT`, etc. for reporting and analytics |
| 4️⃣ | 🛡️ **Type Safety** | Provides type-safety, helping catch errors at **compile time** |
| 5️⃣ | 🔧 **Flexibility** | Enables custom queries and advanced filtering for a wider range of use cases |

---

## 🔷 Query Interface

> 📌 `Query` is the **fundamental JPA interface** that represents a database query.

**Key Points:**
- ✅ Used to execute **dynamic queries** — both JPQL and native SQL
- ✅ Supports **parameterization** and **result retrieval**
- ✅ Used for various querying operations

---

## 🔷 TypedQuery Interface

> 📌 `TypedQuery` is a **specialized subtype** of the `Query` interface in JPA.

**Key Points:**
- ✅ Enhances **type safety** by requiring you to specify the **expected result type** when creating a query
- ✅ Query results are **automatically cast** to the specified type — reducing type-related errors
- ✅ Eliminates the need for **explicit casting** when retrieving results from entity-based queries

---

### 🔄 Query vs TypedQuery — Quick Comparison

| Feature | `Query` 🔵 | `TypedQuery` 🟢 |
|---------|-----------|----------------|
| Type Safety | ❌ No | ✅ Yes |
| Explicit Cast Needed | ✅ Yes | ❌ No |
| Supports JPQL | ✅ Yes | ✅ Yes |
| Supports Native SQL | ✅ Yes | ⚠️ Limited |
| Best For | Dynamic / raw queries | Entity-typed queries |

---

### Creating Persistent File

- Create Folder : src/main/resources
- Create Another Folder inside Above "src/main/resources" folder : META-INF
- Now Create file : persistent.xml

- How add Schema to persistent.xml file
    - Search 'persistent.xml file schema' on browser.
    - Click on oracle website then download : persistent_2_2.xsd
    - Open the file and copy the schema & paste it into persistent.xml file

---

*📅 Notes compiled for JPA / Spring Data study purposes.*