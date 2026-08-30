# ☕ Java Persistence & ORM — Study Notes

---

## 📦 Java Persistence API (JPA)

- 🗓️ **Released:** May 2006, as part of **JavaEE-5** (Enterprise Edition)
- 📋 **What it is:** A **specification** that simplifies the interaction between Java **Objects** and **Relational Databases**

### ⚠️ Important Notes

> 🔔 JPA is **only a specification** — its implementation is provided by ORM vendors:
>
> | 🏢 Vendor | 🛠️ Implementation |
> |---|---|
> | JBoss | Hibernate |
> | Apache Software Foundation | OpenJPA |
> | Eclipse Foundation | EclipseLink |

> 💡 To use JPA, you must use at least one ORM tool (e.g., Hibernate, EclipseLink)

---

### ✅ Advantages of JPA

1. **🧱 Abstraction over Database**
   - Provides a higher-level, object-oriented way to interact with databases
   - Developers work with Java objects instead of raw SQL queries and database-specific code

2. **⚡ Improves Productivity**
   - Developers can focus on **business logic** rather than database interaction
   - Leads to faster development and reduced code complexity

3. **🔗 ORM (Object-Relational Mapping)**
   - Maps Java Objects ↔ Database automatically
   - Eliminates the need to write low-level SQL queries
   - Allows switching between different ORM vendors easily

4. **🌍 Database Portability**
   - Abstracts away database-specific details
   - Makes it easy to switch between different databases (MySQL, PostgreSQL, Oracle, etc.)

5. **📈 Scalability**
   - Manages database connections, pooling, and performance optimization
   - Enables development of scalable applications

---

## 🔌 JDBC (Java Database Connectivity)

- 🛠️ An **API** used to store data in a database
- 📋 Only a **specification** — implementation is provided by **database vendors**:
  - MySQL, Oracle, PostgreSQL, etc.

---

## 🗺️ ORM (Object-Relational Mapping)

- 🧩 A **programming approach/functionality** that provides the relationship between:
  - **Objects** (Java) ↔ **Relational Database**
- Uses **XML mapping files** or **Annotations** to define the mapping

---

## 🐻 Hibernate

- 🛠️ An **ORM tool** used to store data/objects in a database
- ✅ Follows the **ORM approach**
- 🏢 Developed by **JBoss**

---

## 📊 Quick Comparison

| Feature | JDBC | JPA | Hibernate |
|---|---|---|---|
| 📌 Type | API | Specification | ORM Tool |
| 🧑‍💻 Approach | SQL-based | ORM-based | ORM-based |
| 🏭 Implementation by | DB Vendors | ORM Vendors | JBoss |
| 🔁 Abstraction Level | Low | High | High |

---

## 📝 What is a Specification?

> 📖 A **specification** is a **formal document** that defines:
> - A set of **rules**, **behaviours**, and **interfaces** that software applications implement
> - In simpler words: it's a **guideline or blueprint** for how a particular technology or API should work

---

## 💾 Persisting an Entity

| Term | Meaning |
|---|---|
| 💾 **Persistence** | "Store permanently" |
| 🧩 **Entity** | "Objects" (Java objects) |

> 🔑 **Persisting an Entity** = **Storing a Java object in the database permanently**

---

*📚 Notes compiled for JPA & ORM study — JavaEE fundamentals*