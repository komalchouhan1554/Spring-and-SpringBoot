# 📘 Plain-JDBC vs Spring-JDBC — Key Differences

---

## 🔌 1. Connection Object

- **Plain-JDBC** → You must manually obtain the connection object.
- **Spring-JDBC** → Connection object is **automatically provided** by the `JdbcTemplate` class. ✅

---

## 🛠️ 2. Boilerplate Code

**Plain-JDBC** requires the following steps every single time:

```java
// i. Load and register driver
Class.forName("----");

// ii. Create connection object
Connection con = DriverManager.getConnection("url", "username", "password");

// iii. Create Statement object
Statement st = con.createStatement();

// iv. Write and execute SQL query  ← (Only this step changes!)
st.executeQuery("-----sql query----");

// v. Close the resources
st.close();
con.close();
```

> ⚠️ **NOTE:** Steps 1, 2, 3 & 5 are always the same — only Step 4 varies.
> These repeated steps (1, 2, 3, 5) are called **Boilerplate Code**.

- **Spring-JDBC** → ❌ No boilerplate code needed! `JdbcTemplate` handles it all internally.

---

## ⚠️ 3. Exception Handling

- **Plain-JDBC** → Must handle **checked (compile-time) exceptions** using `try-catch` or `throws`. 😓
- **Spring-JDBC** → Automatically converts **compile-time exceptions → runtime exceptions**, so no mandatory handling required. 😊

---

## 📦 4. Result Storage

- **Plain-JDBC** → `SELECT` query results are stored in a **`ResultSet`** object.
- **Spring-JDBC** → `SELECT` query results can be stored directly as:
  - `List` 📋
  - `Map` 🗺️
  - **Bean object** 🫘

---

## 🌐 5. Network Transfer

- **Plain-JDBC** → `ResultSet` is **non-synchronized** ❌ → Cannot be transferred over the network.
- **Spring-JDBC** → Results stored in **Collections or Bean objects** are **synchronized** ✅ → Can be transferred over the network easily.

---

## 🗂️ 6. Storing Results in Bean / Collection

- **Plain-JDBC** → You must **write the mapping code manually** to store results in a bean or collection. ✍️
- **Spring-JDBC** → Provides **pre-defined methods** and the **`RowMapper` interface** to do this effortlessly. 🚀

---

## 🔄 7. Transaction Management

- **Plain-JDBC** → Provides **limited/less support** for transaction management. 😕
- **Spring-JDBC** → Provides **robust and comprehensive support** for transaction management. 💪

---

## 🏁 Quick Comparison Table

| # | Feature | Plain-JDBC | Spring-JDBC |
|---|---------|-----------|-------------|
| 1 | Connection Object | Manual 🔧 | Auto via `JdbcTemplate` ✅ |
| 2 | Boilerplate Code | Required 😓 | Not Required 🎉 |
| 3 | Exception Handling | Mandatory (checked) ⚠️ | Optional (runtime) 😊 |
| 4 | Result Storage | `ResultSet` only | `List`, `Map`, Bean 📦 |
| 5 | Network Transfer | Not possible ❌ | Possible ✅ |
| 6 | Bean/Collection Mapping | Manual code ✍️ | `RowMapper` / built-in 🚀 |
| 7 | Transaction Management | Limited 😕 | Excellent 💪 |

---

> 💡 **Conclusion:** Spring-JDBC is a powerful abstraction over Plain-JDBC that eliminates boilerplate,
> simplifies exception handling, and makes result mapping and transaction management much easier!