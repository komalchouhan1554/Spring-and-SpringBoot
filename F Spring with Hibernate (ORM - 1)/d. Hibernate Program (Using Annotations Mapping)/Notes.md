# 🐘 Hibernate Annotations — Complete Notes

---

## 📌 What are Hibernate Annotations?

Hibernate annotations are **metadata** added directly to Java classes and fields to define how they map to database tables and columns — no XML configuration needed!

---

## 🏷️ `@Entity`

- ✅ Marks a Java class as a **persistent entity**
- 🗺️ Indicates that instances of this class will be **mapped to rows** in a database table
- 🔧 Hibernate recognizes it and allows **CRUD operations** on its instances
- 📍 Used at the **class level**

```java
@Entity
class ClassName {
    // class members
}
```

---

## 📋 `@Table`

- ✅ Maps the **entity class** to a specific **database table**
- 🏷️ Use when the table name differs from the class name
- 📍 Used at the **class level**

```java
@Entity
@Table(name = "table_name")
class ClassName {
    // class members
}
```

---

## 🔑 `@Id`

- ✅ Specifies the **primary key** of an entity class
- 🪪 Marks a field as the **unique identifier** for entity instances
- 🗄️ Maps the Java object's primary key to the **database primary key**
- 📍 Used at the **field (attribute) level**

```java
@Entity
@Table(name = "table_name")
class ClassName {
    @Id
    private int empid;
}
```

---

## 🏛️ `@Column`

- ✅ Maps a **field/attribute** to a specific **table column**
- 🏷️ Use when the column name differs from the field name
- 📍 Used at the **field (attribute) level** within the entity class

```java
@Entity
@Table(name = "table_name")
class ClassName {
    @Column(name = "column_name")
    private String propertyName;
}
```

---

## ⚙️ Auto ID Generation — `@GeneratedValue`

Hibernate provides two ways to auto-generate primary keys:

### 🗂️ Using XML (Old Style)

```xml
<id name="stdid" column="std_id">
    <generator class="identity" />
</id>
```

### ✨ Using Annotations (Modern Style)

```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
```

### 📊 Generation Strategies

| 🏷️ Strategy | 📝 Description |
|---|---|
| `GenerationType.IDENTITY` | Uses DB auto-increment column |
| `GenerationType.SEQUENCE` | Uses a DB sequence object |
| `GenerationType.TABLE` | Uses a separate table to track IDs |
| `GenerationType.AUTO` | Hibernate picks the best strategy |

---

## 🧩 Full Example — Putting It All Together

```java
import jakarta.persistence.*;

@Entity                          // 🏷️ Mark as entity
@Table(name = "employees")       // 📋 Map to "employees" table
public class Employee {

    @Id                                                      // 🔑 Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)      // ⚙️ Auto-generate ID
    @Column(name = "emp_id")                                 // 🏛️ Map to "emp_id" column
    private int empId;

    @Column(name = "emp_name")   // 🏛️ Map to "emp_name" column
    private String empName;

    @Column(name = "emp_salary") // 🏛️ Map to "emp_salary" column
    private double empSalary;

    // Getters & Setters...
}
```

---

## 🗺️ Quick Reference Cheat Sheet

| 🏷️ Annotation | 📍 Level | 🎯 Purpose |
|---|---|---|
| `@Entity` | Class | Marks class as a Hibernate entity |
| `@Table` | Class | Maps class to a specific DB table |
| `@Id` | Field | Marks the primary key field |
| `@Column` | Field | Maps field to a specific DB column |
| `@GeneratedValue` | Field | Auto-generates the primary key value |

---

> 💡 **Pro Tip:** When the class name matches the table name and the field names match the column names, `@Table` and `@Column` are **optional** — Hibernate uses the names by default!

---

*📚 Notes prepared for Hibernate ORM with JPA Annotations*