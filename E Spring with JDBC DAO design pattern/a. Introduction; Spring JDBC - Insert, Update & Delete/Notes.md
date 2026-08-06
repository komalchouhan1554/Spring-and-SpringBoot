# 🌱 Spring JDBC Module

## 📌 Overview

- Spring JDBC provides a **mechanism to connect** the Spring application with a database and **execute SQL queries**.
- 📝 **NOTE:** It internally uses the JDBC API — but **solves the problems of Plain JDBC**.
- Spring provides the following key classes:
  1. `DriverManagerDataSource`
  2. `JdbcTemplate`
  3. `NamedParameterJdbcTemplate`
  - ...and more

---

## 🗄️ DriverManagerDataSource

- It is an **implemented class** of the `DataSource` interface.
- 📦 Package: `org.springframework.jdbc.datasource`
- It is used for:
  1. 🔧 **Database configurations**
  2. 🚗 **Driver loading**
  3. 🔗 **Connection creation**
  - ...and more

---

## ⚙️ JdbcTemplate

- It is the **central class** in Spring JDBC support classes.

### ✅ What it does:

| Feature | Description |
|---|---|
| 🧹 **Simplifies JDBC** | Reduces boilerplate JDBC code, making it readable and concise |
| 🔗 **Connection Management** | Manages connections, reducing the need for manual connection handling |
| ⚠️ **Exception Handling** | Automatically translates DB exceptions into Spring's `DataAccessException` |
| 🔍 **SQL Execution** | Executes SQL queries — INSERT, UPDATE, DELETE, SELECT, etc. |
| 🎯 **Parametrization** | Supports both **positional** and **named** parameters in SQL queries |

---

### 🛠️ Methods of JdbcTemplate

#### 1. 📝 `update(-)`
- Used for **INSERT**, **UPDATE**, and **DELETE** SQL queries.

#### 2. 🔎 Query Methods
- `query(-)`
- `queryForList(-)`
- `queryForMap(-)`
- `queryForObject(-)`
- `queryForRowSet(-)`
- Used for **SELECT** SQL queries.

#### 3. ⚡ `execute(-)`
- Used for **DDL** queries — `CREATE`, `DROP`, `ALTER`, etc.


### Note: 4 jar file used here:-
- 1. Spring-core
- 2. Spring-context
- 3. Spring-Jdbc
- 4. Mysql connector