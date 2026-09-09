
# 📘 Spring Data JPA — Query Methods Notes

## 🔍 What are Query Methods?

- 🛠️ Query methods let you define database queries **just by declaring method signatures** in repository interfaces — no need to write SQL by hand.
- 📂 They are defined inside **repository interfaces**.
- ⚡ Spring Data JPA automatically generates SQL based on the **method name** and **parameters**.

### 🧩 Three ways to define Query Methods
1. 🏷️ Method naming conventions
2. 📝 Custom JPQL queries
3. 🗃️ Custom SQL (native) queries

### ✨ Example
```java
findByEmail(String email)
```
```sql
SELECT * FROM table_name WHERE email = ?;
```

---

## 🏷️ Method Naming Convention Syntax

### 🔎 Basic Find Queries

| # | Method | Example | Generated SQL |
|---|--------|---------|----------------|
| 1️⃣ | `findBy{Property}` | `findByEmail(String email)` | `WHERE std_email = ?` |
| 2️⃣ | `findBy{Property}IgnoreCase` | `findByEmailIgnoreCase(String email)` | `WHERE LOWER(std_email) = LOWER(?)` |
| 3️⃣ | `findBy{P1}And{P2}` | `findByNameAndEmail(...)` | `WHERE std_name = ? AND std_email = ?` |
| 4️⃣ | `findBy{P1}Or{P2}` | `findByNameOrEmail(...)` | `WHERE std_name = ? OR std_email = ?` |

### 📊 Comparison Queries

| # | Method | Example | Generated SQL |
|---|--------|---------|----------------|
| 5️⃣ | `findBy{Property}GreaterThan` | `findByMarksGreaterThan(float marks)` | `WHERE std_marks > ?` |
| 6️⃣ | `findBy{Property}LessThan` | `findByMarksLessThan(float marks)` | `WHERE std_marks < ?` |
| 7️⃣ | `findBy{Property}GreaterThanEqual` | `findByMarksGreaterThanEqual(float marks)` | `WHERE std_marks >= ?` |
| 8️⃣ | `findBy{Property}LessThanEqual` | `findByMarksLessThanEqual(float marks)` | `WHERE std_marks <= ?` |
| 9️⃣ | `findBy{Property}Between` | `findByMarksBetween(min, max)` | `WHERE std_marks BETWEEN ? AND ?` |
| 🔟 | `findBy{Property}Not` | `findByMarksNot(float marks)` | `WHERE std_marks <> ?` |

### 🔤 String Matching Queries

| # | Method | Example | Generated SQL |
|---|--------|---------|----------------|
| 1️⃣1️⃣ | `findBy{Property}Like` | `findByNameLike(String name)` | `WHERE std_name LIKE ?` |
| 1️⃣2️⃣ | `findBy{Property}StartingWith` | `findByNameStartingWith(prefix)` | `WHERE std_name LIKE ?` |
| 1️⃣3️⃣ | `findBy{Property}EndingWith` | `findByNameEndingWith(suffix)` | `WHERE std_name LIKE ?` |
| 1️⃣4️⃣ | `findBy{Property}Containing` | `findByNameContaining(keyword)` | `WHERE std_name LIKE ?` |

### 🥇 Ordering & Top/First Queries

| # | Method | Example | Generated SQL |
|---|--------|---------|----------------|
| 1️⃣5️⃣ | `findFirstByOrderBy{Property}Asc` | `findFirstByOrderByMarksAsc()` | `ORDER BY std_marks ASC LIMIT 1` |
| 1️⃣6️⃣ | `findFirstByOrderBy{Property}Desc` | `findFirstByOrderByMarksDesc()` | `ORDER BY std_marks DESC LIMIT 1` |
| 1️⃣7️⃣ | `findTop{N}ByOrderBy{Property}Desc` | `findTop5ByOrderByMarksDesc()` | `ORDER BY std_marks DESC LIMIT 5` |
| 1️⃣8️⃣ | `findTop{N}ByOrderBy{Property}Desc` | `findTop10ByOrderByMarksDesc()` | `ORDER BY std_marks DESC LIMIT 10` |

### 📋 List / Null Checks

| # | Method | Example | Generated SQL |
|---|--------|---------|----------------|
| 1️⃣9️⃣ | `findBy{Property}In` | `findByEmailIn(List<String> emails)` | `WHERE std_email IN (?)` |
| 2️⃣0️⃣ | `findBy{Property}IsNull` | `findByEmailIsNull()` | `WHERE std_email IS NULL` |
| 2️⃣1️⃣ | `findBy{Property}IsNotNull` | `findByEmailIsNotNull()` | `WHERE std_email IS NOT NULL` |

### 🔀 Combined Between + Order By

| # | Method | Example | Generated SQL |
|---|--------|---------|----------------|
| 2️⃣2️⃣ | `findBy{P1}BetweenOrderBy{P2}Asc` | `findByMarksBetweenOrderByMarksAsc(min, max)` | `WHERE std_marks BETWEEN ? AND ? ORDER BY std_marks ASC` |
| 2️⃣3️⃣ | `findBy{P1}BetweenOrderBy{P2}Desc` | `findByMarksBetweenOrderByMarksDesc(min, max)` | `WHERE std_marks BETWEEN ? AND ? ORDER BY std_marks DESC` |

### 🧬 Distinct & Custom Entity Queries

| # | Method | Example | Generated SQL |
|---|--------|---------|----------------|
| 2️⃣4️⃣ | `findDistinctBy{Property}` | `findDistinctByName(String name)` | `SELECT DISTINCT * ... WHERE std_name = ?` |
| 2️⃣5️⃣ | `find{EntityName}By{Property}` | `findStudentByAgeGreaterThan(int age)` | Custom query based on method name |
| 2️⃣6️⃣ | `queryBy{Property}` | `queryByAgeGreaterThan(int age)` | Custom query based on method name |

### 🔢 Count Queries

| # | Method | Example | Generated SQL |
|---|--------|---------|----------------|
| 2️⃣7️⃣ | `countDistinctBy{Property}` | `countDistinctByCity(String city)` | `SELECT COUNT(DISTINCT city) ... WHERE city = ?` |
| 2️⃣8️⃣ | `countBy{Property}` | `countByActive(boolean active)` | `SELECT COUNT(*) ... WHERE active = ?` |

### 🗑️ Delete / Remove Queries

| # | Method | Example | Generated SQL |
|---|--------|---------|----------------|
| 2️⃣9️⃣ | `deleteDistinctBy{Property}` | `deleteDistinctByStatus(String status)` | `DELETE DISTINCT ... WHERE status = ?` |
| 3️⃣0️⃣ | `deleteBy{Property}` | `deleteByStatus(String status)` | `DELETE ... WHERE status = ?` |
| 3️⃣1️⃣ | `deleteBy{P1}And{P2}` | `deleteByStatusAndCategory(...)` | `DELETE ... WHERE status = ? AND category = ?` |
| 3️⃣2️⃣ | `removeBy{Property}` | `removeByLastLoginBefore(Date date)` | `DELETE ... WHERE last_login < ?` |
| 3️⃣3️⃣ | `removeBy{P1}Or{P2}` | `removeByStartDateAfterOrEndDateBefore(...)` | `DELETE ... WHERE start_date > ? OR end_date < ?` |
| 3️⃣4️⃣ | `removeBy{Property}Like` | `removeByDescriptionLike(keyword)` | `DELETE ... WHERE description LIKE '%keyword%'` |

---

## 📝 Custom JPQL Query Syntax

```java
@Query("----JPQL Query----")
ReturnType methodName(parameters);
```
> 💡 JPQL works with **entity objects & fields**, not raw table/column names.

---

## 🗃️ Custom Native SQL Query Syntax

```java
@Query(value = "----SQL Query----", nativeQuery = true)
ReturnType methodName(parameters);
```
> ⚠️ `nativeQuery = true` means you write **actual SQL** tied to your database schema.

---

## ✅ Quick Recap

- 🏷️ **Naming convention** → fastest for simple queries
- 📝 **JPQL** → flexible, entity-based custom queries
- 🗃️ **Native SQL** → full raw SQL power when needed
- 🚀 All reduce boilerplate — Spring Data JPA does the heavy lifting!