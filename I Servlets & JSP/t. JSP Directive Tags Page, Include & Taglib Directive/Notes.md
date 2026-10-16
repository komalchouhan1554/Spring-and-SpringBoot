# 📝 JSP Directive Tags

> 📌 JSP directive tags are used to provide **instructions/directives** to the JSP container on how to handle the JSP page during **compilation and execution**.

### 🧩 Syntax
```jsp
<%@ directive attribute="value" %>
```

### 📂 Types of JSP Directive Tags
1. 📄 Page Directive Tag
2. 📥 Include Directive Tag
3. 🏷️ Taglib Directive Tag

---

## 1️⃣ Page Directive Tag 📄

- 🎯 Used to define various **properties and settings** for the current JSP page.

### 🧩 Syntax
```jsp
<%@ page attribute="value" ... %>
```

### ⚙️ Attributes in Page Directive Tag
| # | Attribute |
|---|-----------|
| 1 | `import` 📦 |
| 2 | `extends` 🧬 |
| 3 | `language` 💬 |
| 4 | `contentType` 📄 |
| 5 | `session` 🔐 |
| 6 | `isELIgnored` 🚫 |
| 7 | `errorPage` ⚠️ |
| 8 | `isErrorPage` ❗ |
| ... | etc |

---

## 2️⃣ Include Directive Tag 📥

- 🔗 Used to include the content of **another JSP page** into the current JSP page.

### 🧩 Syntax
```jsp
<%@ include file="otherpage.jsp" %>
```

### ✅ Advantages
1. ♻️ Code Reusability
2. 📖 Improves project readability
3. 🛠️ Maintainability (modifications made easy)

---

## 3️⃣ Taglib Directive Tag 🏷️

- 🧰 Used to make available **user-defined** or **pre-defined tag libraries** in the current JSP page.

### 🧩 Syntax
```jsp
<%@ taglib uri="----" prefix="----" %>
```

### 💡 Example
```jsp
<%@ taglib uri="https://example.com/mytags" prefix="mytag" %>

<mytag:myCustomTag attribute="value" ... %>
```

---

## 🎯 Quick Summary
| Directive | Purpose | Emoji |
|-----------|---------|-------|
| Page | Page-level settings | 📄 |
| Include | Reuse content from other JSP pages | 📥 |
| Taglib | Use custom/predefined tag libraries | 🏷️ |