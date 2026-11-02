# 🌱 Spring WEB-MVC Application — Notes

---

## 🅰️ Steps to Create Spring WEB-MVC Application 1 (Old Approach) 🕰️

### 1️⃣ Provide Dependencies 📦
Include the necessary Spring MVC dependencies in the `pom.xml` file:
- `spring-core`
- `spring-context`
- `spring-expression`
- `spring-webmvc`

### 2️⃣ Create `index.jsp` Page 📄
Create an `index.jsp` page that contains a hyperlink 🔗 to trigger the request.

### 3️⃣ Configure DispatcherServlet in `web.xml` ⚙️
Define a servlet mapping in the `web.xml` file to map incoming requests to the `DispatcherServlet`.

### 4️⃣ Create Spring Configuration XML File 🛠️
Create an XML file (e.g., `myds-servlet.xml`) and configure the Spring WEB-MVC Application as follows:

- **4.1 Define Handler Mapping** 🗺️
  - Specify a `BeanNameUrlHandlerMapping` to map the URL pattern to the specific controller.
- **4.2 Configure URL with Controller** 🔀
  - Map the URL pattern to a specific controller bean.
- **4.3 Configure View Resolver** 👁️
  - Use `InternalResourceViewResolver` to resolve view names to actual JSP pages.

### 5️⃣ Create Controller 🎮
Implement the `Controller` interface to handle the incoming requests and prepare the data for the view.

### 6️⃣ Create JSP Page for Response 📃
Create a JSP page (e.g., `hello.jsp`) to display the data prepared by the controller.

---

## 🅱️ Steps to Create Spring WEB-MVC Application 2 (New Approach) 🚀

### 1️⃣ Provide Dependencies 📦
Include the necessary Spring MVC dependencies in the `pom.xml` file:
- `spring-core`
- `spring-context`
- `spring-expression`
- `spring-webmvc`

### 2️⃣ Create `index.jsp` Page 📄
Create an `index.jsp` page that contains a hyperlink 🔗 to trigger the request.

### 3️⃣ Configure DispatcherServlet in `web.xml` ⚙️
Define a servlet mapping in the `web.xml` file to map incoming requests to the `DispatcherServlet`.

### 4️⃣ Create Spring Configuration XML File 🛠️
Create an XML file (e.g., `myds-servlet.xml`) and configure the Spring WEB-MVC Application as follows:

- **4.1 Define Handler Mapping** 🗺️
  - Specify a `RequestMappingHandlerMapping` to map the URL pattern to the specific controller.
- **4.2 Configure View Resolver** 👁️
  - Use `InternalResourceViewResolver` to resolve view names to actual JSP pages.

### 5️⃣ Create Controller 🎮
Create a controller to handle incoming requests and prepare data for the view with the following steps:

- **5.1** Annotate the class with `@Controller` 🏷️
- **5.2** Define handler methods annotated with `@RequestMapping` to handle the specific URL pattern 🎯
- **5.3** The handler method can return a `ModelAndView` object to specify the view name and data to be passed to the view 📦➡️👁️

### 6️⃣ Create JSP Page for Response 📃
Create a JSP page (e.g., `hello.jsp`) to display the data prepared by the controller.

---

## ⚖️ Difference Between Old and New Approach

| # | Aspect | 🕰️ Old Approach | 🚀 New Approach |
|---|--------|------------------|------------------|
| 1️⃣ | **Handler Mapping** | `BeanNameUrlHandlerMapping` | `RequestMappingHandlerMapping` |
| 2️⃣ | **Controller Definition** | Separate controller beans in Spring Configuration XML File | Methods annotated with `@RequestMapping` |
| 3️⃣ | **Flexibility** | ❌ Less Flexible | ✅ More Flexible |
| 4️⃣ | **Ease of Use** | 😓 Less easy to use | 😃 More easy to use |

---

✅ **Summary:** The New Approach (annotation-based) is the modern, preferred way of building Spring WEB-MVC applications — it's more flexible, cleaner, and easier to maintain than the old XML/interface-based approach. 🌟