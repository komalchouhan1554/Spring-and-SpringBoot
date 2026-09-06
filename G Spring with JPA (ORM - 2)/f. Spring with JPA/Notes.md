# 🌱 Spring with JPA

- 🔗 Spring with JPA combines the power of the **Spring Framework** with **JPA** to build robust and maintainable Java applications.
- ⚙️ It simplifies configurations, enhances transaction management, and reduces boilerplate code for managing database interactions.

## 🔑 Key Components for Spring with JPA

1. 🏭 `LocalContainerEntityManagerFactoryBean`
2. 🔄 `JpaTransactionManager`
3. 💉 `@PersistenceContext`

---

## 🏭 LocalContainerEntityManagerFactoryBean

- 🧩 It is a class which is responsible for creating and configuring the `EntityManagerFactory`, which is the central interface for working with JPA.
- 🔌 It allows for easy setup of JPA providers like **Hibernate**, **EclipseLink**, etc.

## 🔄 JpaTransactionManager

- 💳 It is a class which is used for managing transactions in a Spring-managed JPA environment.
- 🤝 It coordinates transactions across one or more `EntityManager` instances.

## 💉 @PersistenceContext

- 📌 It is a JPA-specific annotation used to inject `EntityManager` into a Spring-managed bean or component.

---

## 🛠️ Steps to Create a Spring with JPA Program

1. 📦 Create a **Maven project** and provide dependencies.
2. 🧱 Create an **entity class** in `in.sp.entity` package.
3. 📄 Create a **Spring configuration file (XML)** in `in.sp.resources` package.
   - 🗄️ `DataSource` → `DriverManagerDataSource`
   - 🏭 `LocalContainerEntityManagerFactoryBean`
     - `dataSource`
     - 📂 package to scan the entity class
     - 🛠️ JPA vendor properties
4. 🗂️ Create a **DAO interface** in `in.sp.dao` package.
5. 🗂️✅ Create a **DAO implementation class** in `in.sp.dao` package.
6. ▶️ Create the **main class** and execute the application.