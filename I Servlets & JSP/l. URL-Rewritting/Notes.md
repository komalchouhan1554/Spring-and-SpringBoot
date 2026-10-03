# 🔗 URL-Rewriting

**URL-Rewriting** is the technique which is used to modify or enhance URL's by adding query parameters or any other information to them.

✅ This technique allows web developers to pass data between web pages and maintain state across multiple HTTP requests.

### 🎯 Uses of URL-Rewriting
1. 🔐 Session Tracking Mechanism
2. 📦 Passing Query Parameters

---

## 🍪 Session Tracking Mechanism

- 🖥️ For session tracking mechanism, web containers make use of cookies (**JSESSIONID**). If the client disables cookies at the browser, then `HttpSession` and cookies will not work.
- 🔁 In that case, we have to use the **URL-Rewriting** session tracking mechanism.
- ✏️ In URL-Rewriting, we modify the provided URL by attaching `JSESSIONID` at the end of the URL.

### 🛠️ For this, `HttpServletResponse` interface has provided methods:

1. **`public String encodeURL(String url)`**
   - 📎 This method will attach `JSESSIONID` at the end of the specified URL.
   - 🍪 If cookies are enabled, then it will return the URL unchanged.

2. **`public String encodeRedirectURL(String url)`**
   - 📎 This method will work the same as the above method, i.e., it will also attach `JSESSIONID` at the end of the provided URL.
   - ↪️ This method works with the `sendRedirect()` method.

### 📝 NOTE:
1. ⚙️ By default, the web container will try to use the cookie session tracking mechanism, but if cookies are disabled at the client side (browser), then automatically the URL-Rewriting session tracking mechanism will come into play.
2. 🌐 Mostly, we can use URL-Rewriting in the case of dynamic web pages (Servlets, JSP, etc.) and **not** for static web pages (HTML).
3. 🤖 URL-Rewriting is automatically handled by the web container; we only need to encode the URL.
4. 🔢 `JSESSIONID` is automatically added in the URL, but we can add the `JSESSIONID` manually by passing query parameters.

---

## 📦 Passing Query Parameters

- 🔄 URL-Rewriting is also used to pass query parameters and data within the URLs.
- 📨 This is used to transfer information or data from one page to another.

### ✍️ Syntax:
```
URL ? parameter1=value1 & parameter2=value2 & ...
```

### ⚠️ NOTE:
> 🚫 Do **not** send sensitive data using query parameters.