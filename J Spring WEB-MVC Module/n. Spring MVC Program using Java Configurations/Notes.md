# 🌱 Spring Web App using Java Configuration

## 📝 Overview
- Till now we used **XML files** for Spring configuration 🗂️, but in **modern applications**, we mostly use **Java configurations** ☕.
- We can remove **XML-based Spring configuration files**, even the **`web.xml`** file entirely! 🚫📄

---

## ⚙️ `@Configuration`
- ✅ Used to declare that a class **provides configuration information and bean definitions** for the application context.
- 🧩 When applied to a class, it indicates that the class contains **one or more `@Bean` methods**, which define the beans that make up the application context.
- 🔄 `@Configuration` classes can be used to **replace XML-based configuration**.

## 🖥️ `AnnotationConfigWebApplicationContext`
- 📌 A class used in **web applications** where configuration is done through **annotated classes**, such as those marked with `@Configuration`.

## 🛠️ `WebMvcConfigurer`
- 🔌 An **interface** that provides a way to **customize and extend** the default configuration of the **Spring Web MVC framework**.
- ➕ Allows us to register **additional components**, **view resolvers**, **interceptors**, etc.

## 🚀 `@EnableWebMvc`
- ⚡ Used to enable the **default Spring MVC configurations** provided by the `WebMvcConfigurationSupport` class.
- 📦 Enables a set of default configurations such as essential beans like:
  - 🗺️ `HandlerMapping`
  - 🔧 `HandlerAdaptor`
  - ⚠️ `HandlerExceptionResolver`
- 🖼️ Also registers some **default view resolvers**, **interceptors**, etc.

---

## 🏗️ `WebApplicationInitializer`
- 🔗 An **interface** used to configure context **programmatically**, replacing the traditional `web.xml` 🚫📄.
- 🎬 It initializes **Spring MVC**, sets up the **`DispatcherServlet`**, and defines the **application context** for **Servlet 3.0+ containers**.

## 📋 `ServletRegistration.Dynamic`
- 🔄 Configures the **servlet dynamically**.
- 🧭 In this example, it registers the **"dispatcher" servlet** with the specified mapping **`"/"`** and controls its **initialization**. 🎯

---

## 🧱 `AbstractAnnotationConfigDispatcherServletInitializer`
- 🏛️ An **abstract class** that **simplifies web application configuration**.
- 🔄 It **replaces `web.xml`** by enabling configuration through **Java classes**, particularly suited for **annotation-based configuration** in **Spring MVC** applications. ✨

---

## 🎯 Key Takeaway
Modern Spring applications favor **Java-based configuration** 💻 over XML 🗂️ — cleaner, type-safe, and fully programmatic, eliminating the need for `web.xml` entirely! 🎉