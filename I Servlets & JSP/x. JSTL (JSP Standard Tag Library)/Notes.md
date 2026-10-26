# 📘 JSTL (JSP Standard Tag Library)

## 🔹 What is JSTL?
- ✅ JSTL is a **standard library for JSP**, developed by the **Java Community Process (JCP)**.
- ✅ It is a **collection of tags** designed to simplify and enhance JSP development.

## 🔹 Types of JSTL Tags
There are **5 types** of JSTL tags:

| # | Tag Type | Prefix |
|---|----------|--------|
| 1️⃣ | Core Tags | `c` |
| 2️⃣ | XML Tags | `x` |
| 3️⃣ | Formatted Tags | `fmt` |
| 4️⃣ | SQL Tags | `sql` |
| 5️⃣ | Function Tags | `fn` |

> ⭐ **NOTE:**
> - 🔥 Most commonly used JSTL tags are **Core Tags**.
> - 📦 To use JSTL tags in a project, we must add one jar file → **`jstl.jar`**
> - 🏷️ To use JSTL tags, we must use the **taglib directive** tag:
> ```jsp
> <%@ taglib uri="----" prefix="----" %>
> ```

---

## 🧩 1. Core Tags
- ⚙️ Commonly used for **control statements, looping, variable manipulation & outputting content**.
- 🏷️ Taglib directive:
```jsp
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
```

### There are approx **14 Core Tags**, grouped as:

#### 📝 a) General Purpose Tags
- `<c:set>` — set a variable 💾
- `<c:out>` — output content 🖨️
- `<c:remove>` — remove a variable 🗑️
- `<c:catch>` — catch exceptions 🐛

#### 🔀 b) Conditional Tags
- `<c:if>` — if condition ❓
- `<c:choose>`, `<c:when>`, `<c:otherwise>` — like a **switch statement** 🔁

#### 🔄 c) Iterative Tags
- `<c:forEach>` — loop through collections 🔂
- `<c:forTokens>` — loop through tokens 🧵

#### 🌐 d) URL Based Tags
- `<c:url>` — build URLs 🔗
- `<c:import>` — import content 📥
- `<c:redirect>` — redirect page ➡️

---

## 🧾 2. XML Tags
- 📄 Used to work with **XML data** within a JSP page.
- 🏷️ Taglib directive:
```jsp
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
```

---

## 🌍 3. Formatted Tags
- 🗓️ Used for **internationalization (i18n) & localization**, including formatting:
  - 📅 Dates
  - 🔢 Numbers
  - 💰 Currencies
- 🏷️ Taglib directive:
```jsp
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
```

---

## 🗄️ 4. SQL Tags
- 💽 Used for **database operations**.
- ⚠️ **Recommendation:** Use other technologies like **JDBC** for database access due to **security concerns**.
- 🏷️ Taglib directive:
```jsp
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
```

---

## 🔧 5. Function Tags
- 🛠️ Used to **call functions** for various tasks in JSTL.
- 🏷️ Taglib directive:
```jsp
<%@ taglib uri="http://java.sun.com/jsp/jstl/function" prefix="fn" %>
```

---

✨ **End of Notes** ✨