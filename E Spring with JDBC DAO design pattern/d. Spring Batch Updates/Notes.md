# 🗄️ Spring Batch Updates

## 📌 What is Spring Batch Update?

A **batch update** is a group of SQL statements bundled together and sent to the database **all at once** 📦, rather than executing them one by one 🐢.

---

## ✅ Advantages

| Benefit | Description |
|--------|-------------|
| ⚡ **Improved Performance** | Executing multiple statements in one trip significantly boosts application speed |
| 🌐 **Reduced Network Traffic** | Fewer round-trips between the application and the database server |

---

## ❌ Disadvantages

- 🚫 **Limited to DML only** — Can only be used with `INSERT`, `UPDATE`, and `DELETE` queries. **Not** applicable for `SELECT` queries.
- 💥 **Error Sensitivity** — If even a **single SQL query** fails, it can disturb the entire flow of the program.

---

## 🔧 Spring-JDBC Method for Batch Update

In **Spring-JDBC**, batch updates are handled using:

```java
batchUpdate(-)
```

> 📝 This method takes an array of SQL statements (or a `BatchPreparedStatementSetter`) and executes them as a batch against the database.

---

## 🔄 How It Works — Flow Diagram

```
Application
    │
    ▼
[ Collect SQL Queries ] ──► [ Group into Batch ]
                                     │
                                     ▼
                          [ Send to Database in ONE trip ] 🚀
                                     │
                          ┌──────────┴──────────┐
                          ▼                     ▼
                    ✅ Success             ❌ Error on any query
                  (All executed)         (Flow gets disturbed ⚠️)
```

---

## 💡 Quick Tip

> Use **transactions** 🔐 along with batch updates to handle errors gracefully. If any query fails, you can roll back the entire batch to maintain data consistency.

---

![Program : b Spring Batch Updates](b%20Spring%20Batch%20Updates.png)

---

*📚 Notes on Spring-JDBC | Spring Batch Updates*