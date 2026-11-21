# 🌍 Internationalization (I18N)

- 🏗️ Internationalization means **designing and creating** the application (web or software) in such a way that makes it easy to adapt for people of **different countries or cultures**.
- 🧱 It's like making the **foundation** that can later be customized to fit the preferences and languages of different countries.

---

## ⚙️ How Our Application Works

1. 🛑 The **`LocaleChangeInterceptor`** intercepts the requests that include a parameter named `language` to change the locale.
2. 🗺️ The **`HandlerMapping`** determines the appropriate handler method based on the request.
3. 📄 The **`ViewResolver`** resolves the name to an actual JSP file path based on the configured prefix and suffix.

### 🔧 Other Beans Utilized in This Process
- 💬 **`MessageSource`** → helps resolve internationalized messages.
- 🌐 **`LocaleResolver`** → helps determine the locale to be used.

---

## 🧩 Bean Configurations

### 📦 `ResourceBundleMessageSource` Bean
- ✅ Responsible for resolving messages from resource bundles.
- 📁 Configured to look up messages from `/in/sp/resources/message` location.

### 🔐 `SessionLocaleResolver` Bean
- ✅ Used to resolve the user locale by checking the **session**.
- 🇬🇧 Set with the default locale value i.e. `en` (English).

### 🖱️ `LocaleChangeInterceptor` Bean
- ✅ Intercepts requests to change the locale based on the parameter named `language`.

### 🧭 `RequestMappingHandlerMapping` Bean
- ✅ Maps the incoming requests to the appropriate handler method.
- 🔌 Configured with interceptors (in this case, `LocaleChangeInterceptor`).

### 🖼️ `InternalResourceViewResolver` Bean
- ✅ Resolves the view names to actual JSP pages.
- 📂 Configured to look for JSP pages in the `/WEB-INF/views` directory.