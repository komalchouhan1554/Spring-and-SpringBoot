# 💳 Transaction Management Notes

---

## 📌 What is a Transaction?

> A **transaction** is a group of several SQL operations treated as a **single unit**, executed on the principle of **either all or none**.

---

## 🧪 ACID Properties

Transactions follow the **ACID** properties:

| Property | Symbol | Description |
|----------|--------|-------------|
| **Atomicity** | ⚛️ A | Either perform **all** operations or **none** |
| **Consistency** | ✅ C | The database state must be **stable** |
| **Isolation** | 🔒 I | All transactions must execute **independently** — one transaction must not affect another |
| **Durability** | 💾 D | Changes of a successful transaction **persist** even if a system/database failure occurs |

---

## 🐬 Transaction in MySQL Database

| Command | Description |
|---------|-------------|
| `SELECT @@AUTOCOMMIT;` | 🔍 Check autocommit status — `1` = stores data **permanently**, `0` = stores data **temporarily** |
| `SET AUTOCOMMIT=0;` | ⚙️ Change autocommit value to `0` (temporary mode) |
| `COMMIT;` | ✅ Store temporary data **permanently** |
| `ROLLBACK;` | ↩️ **Rollback** (remove) the temporary data |

---

## ☕ Transaction Management in JDBC

### 🔧 3 Key Methods in `Connection` Interface

1. `setAutoCommit(boolean)` ⚙️
2. `commit()` ✅
3. `rollback()` ↩️

> 📝 **NOTE:** All three methods are present in the **`Connection`** interface.

---

### 📋 Syntax / Template

```java
Connection con = ------

try {
    con.setAutoCommit(false);  // ⚙️ Disable auto-commit

    // 🔷 SQL Operation 1
    // 🔷 SQL Operation 2
    // 🔷 SQL Operation 3
    // 🔷 SQL Operation 4

    if (condition == true) {
        con.commit();    // ✅ Commit if all operations succeed
    } else {
        con.rollback();  // ↩️ Rollback if condition fails
    }

} catch (Exception e) {
    con.rollback();      // ↩️ Rollback on exception
    e.printStackTrace(); // 🐛 Print error details
}
```

---

## 🔄 Transaction Flow Diagram

```
START TRANSACTION
       |
       ▼
  SQL Operation 1
  SQL Operation 2
  SQL Operation 3
       |
  ┌────┴────┐
  │ Success?│
  └────┬────┘
       |
   ✅ YES          ❌ NO / Exception
    COMMIT  ◄──────────► ROLLBACK
       |                     |
  Data Saved 💾        Data Removed ↩️
```

---

## 💡 Quick Recap

- 🔑 Transactions ensure **data integrity** during multi-step operations
- 🛑 `setAutoCommit(false)` is the **first step** — always set before operations
- ✅ Use `commit()` only when **all** operations succeed
- ↩️ Use `rollback()` in **catch block** and **else condition** to undo changes
- 🔒 ACID properties guarantee **reliable** and **safe** transactions

---

*📚 Notes by — Transaction Management | JDBC*