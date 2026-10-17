# 🚀 JSP Action Tags

## 📌 Overview
- 🎯 The main purpose of JSP Action tags is to **reduce Java code** from the JSP page.
- 🔄 They are often used to perform **dynamic actions** i.e. making decisions, iterating over collections, etc. without embedding Java code directly into the JSP page.

### 📝 Notes
> - 🔁 JSP Action Tags are mostly used **in place of "Scriptlet Tag"**.
> - 🏗️ They help **separate the business layer from the presentation layer** in a JSP page, improving code organization and readability.

### ✍️ Syntax
```jsp
<jsp:actionName ---- >
```

### 🗂️ Types of Action Tags
1. 🧩 Standard Action Tag
2. 🛠️ Custom Action Tag

---

## 1️⃣ Standard Action Tag 🧩
- 📦 These are **built-in** JSP action tags provided by JSP specifications.
- ⚙️ These tags are used to perform common tasks **without writing Java code** directly in our JSP page.

### 💡 Examples

**🫘 Bean related tags**

1. `<jsp:useBean>`
2. `<jsp:setProperty>`
3. `<jsp:getProperty>`

**🔀 Control flow tags**

4. `<jsp:include>`
5. `<jsp:forward>`
6. `<jsp:param>`

**📜 Scripting elements/tags**

7. `<jsp:declaration>`
8. `<jsp:scriptlet>`
9. `<jsp:expression>`

**🧷 Applet related tags**

10. `<jsp:plugin>`
11. `<jsp:fallback>`
12. `<jsp:params>`

---

## 2️⃣ Custom Action Tag 🛠️
- 🆕 Many standard action tags already exist, but sometimes we need to create our **own action tags** — for this we use a Custom Action Tag.

### ✅ Advantages of Custom Action Tag
1. 🚫 Eliminates the need of scriptlet tag.
2. 🏗️ Separates the business layer from the presentation layer.
3. ♻️ Increases reusability of code.

### ✍️ Syntax
```jsp
<prefix:tagname attribute="value" ... />
```
**OR**
```jsp
<prefix:tagname attribute="value" ... >
    <!-- body -->
</prefix:tagname>
```

---

## ⚖️ Include Directive Tag vs `<jsp:include>` Action Tag

| # | 📎 Include Directive Tag | 🔄 Action Include Tag (`<jsp:include>`) |
|---|---------------------------|------------------------------------------|
| 1 | 🧊 Used for **static** pages | 🌊 Used for **dynamic** pages |
| 2 | 📄 Includes the **content** of the target resource | 📨 Includes the target **response** in the present JSP page |
| 3 | ⏱️ Evaluated at **translation time** | ⏳ Evaluated at **request processing time** |

---

✨ **End of Notes** ✨