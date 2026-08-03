# 🗄️ Batch Updations in JDBC

## 📌 What is Batch Updation?

> A **batch of updates** grouped together and sent to the database **in one batch** rather than sending them one by one.

---

## ✅ Advantages

| # | Benefit |
|---|---------|
| ⚡ | **Improved Application Performance** — fewer round-trips to the database |
| 🌐 | **Reduced Network Traffic** — all queries travel together in a single request |

---

## ❌ Disadvantages

- 🚫 Can **only** be used for `INSERT`, `UPDATE`, and `DELETE` SQL queries
  - *(Not applicable for `SELECT` queries)*
- ⚠️ If **any single SQL query** throws an error, it will **disturb the flow** of the entire program

---

## 🛠️ How to Achieve Batch Updations?

### 🔧 3 Key Methods

| # | Method | Return Type | Description |
|---|--------|-------------|-------------|
| 1️⃣ | `addBatch(String query)` | `void` | Adds a SQL query to the current batch |
| 2️⃣ | `executeBatch()` | `int[]` | Executes all queries in the batch; returns update counts |
| 3️⃣ | `clearBatch()` | `void` | Clears all queries from the current batch |

---

### 📝 Note

> 💡 These methods are available in both **`Statement`** and **`PreparedStatement`** interfaces.

---

### 💻 Example (PreparedStatement)

```java
Connection con = DriverManager.getConnection(url, user, pass);
con.setAutoCommit(false); // Disable auto-commit

PreparedStatement ps = con.prepareStatement("INSERT INTO students VALUES (?, ?)");

ps.setInt(1, 101);
ps.setString(2, "Alice");
ps.addBatch(); // 1️⃣ Add to batch

ps.setInt(1, 102);
ps.setString(2, "Bob");
ps.addBatch(); // 1️⃣ Add to batch

int[] result = ps.executeBatch(); // 2️⃣ Execute all at once
con.commit();

ps.clearBatch(); // 3️⃣ Clear the batch
```

---

*📚 Topic: JDBC | Batch Processing*