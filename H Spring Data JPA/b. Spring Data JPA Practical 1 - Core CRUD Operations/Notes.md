# 🌱 Spring Data JPA Notes

## 🔧 Core CRUD Operation Methods in Spring Data JPA Repository Interfaces

### ➕ Insert (Create) Operations
- 💾 `save(S entity)`
- 💾📦 `saveAll(Iterable<S> entity)`

### ✏️ Update Operations
- 💾 `save(S entity)`

> 📝 **Note:** Spring Data JPA uses the same `save()` method for both **Insert** and **Update**. If the entity's ID is `null` or doesn't exist in the DB, it performs an **INSERT**; if the ID already exists, it performs an **UPDATE**.

### 🗑️ Delete Operations
- ❌ `delete(S entity)`
- ❌📦 `deleteAll(Iterable<? extends S> entities)`
- 🧹 `deleteAll()`
- 🔑❌ `deleteById(Id id)`

### 🔍 Read (Retrieve) Operations
- 🔑🔍 `findById(ID id)`
- 📋 `findAll()`
- 📋🔑 `findAllById(Iterable<ID> ids)`
- 🔢 `count()`
- ❓✅ `existsById(ID id)`

---

## 🏗️ Steps to Create a Spring Data JPA Program

### 1️⃣ Create Maven Project
- 🧰 Set up a new Maven project structure to manage dependencies and build the application.

### 2️⃣ Provide Dependencies 📦
- 🌱 **Spring Data JPA Dependency**
- 📜 **javax.persistence-api Dependency**
- 🐻 **Hibernate Core Dependency**
- 🐬 **Mysql-connector-j Dependency**

### 3️⃣ Create Entity Class 🧾
- 📄 `Student.java`
- 🏷️ Annotate with `@Entity`, `@Id`, `@Table`, etc.

### 4️⃣ Create Custom Repository Interface 🗂️
- 📄 `StudentRepository.java`
- 🔗 Extend `JpaRepository<Student, ID>` (or `CrudRepository`)

### 5️⃣ Create Service Class ⚙️
- 📄 `StudentService.java`
- 🧩 Contains business logic and calls repository methods

### 6️⃣ Create Spring Configuration File 🛠️
- 📄 `SpringConfigFile.java`

Configure the following beans:
- 🔌 **DriverManagerDataSource** (DataSource) — handles DB connection details
- 🏭 **LocalContainerEntityManagerFactoryBean** — creates `EntityManagerFactory`
- 🔄 **JpaTransactionManager** — manages transactions

### 7️⃣ Create Main Class & Execute 🚀
- ▶️ Load `ApplicationContext`
- ▶️ Fetch beans and invoke service/repository methods
- ✅ Run the program and verify CRUD operations

---

## 🎯 Quick Summary Flow
```
Maven Project 🧰 → Dependencies 📦 → Entity 🧾 → Repository 🗂️ → Service ⚙️ → Config 🛠️ → Main Class 🚀
```