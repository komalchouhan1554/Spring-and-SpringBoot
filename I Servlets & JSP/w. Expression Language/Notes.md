# 📘 Expression Language (EL)

## 🔹 What is EL?
- 📝 It is a **scripting language** used in web development commonly associated with **JSP** and **Java EE** applications.
- 🔗 It is used to **access and manipulate data** stored in Java objects i.e. JavaBeans, request, session, application etc.
- ⚡ It is designed to **simplify the process** of integrating dynamic data into our web page.
- 📅 It was introduced in **JSP 2.0** version.

---

## 🔹 Syntax
```
${expression}
```

---

## 🔹 Elements of EL

### ➕ Operators
`+`, `-`, `*`, `/`, `==`, `!=`, `&&`, `||`, `[]`, `()` etc.

### 🔑 Reserved Words
| Keyword | Meaning |
|---------|---------|
| `true` | Boolean true |
| `false` | Boolean false |
| `null` | Null value |
| `empty` | Checks if empty |
| `eq` | equal |
| `ne` | not equal |
| `lt` | less than |
| `le` | less than or equal to |
| `gt` | greater than |
| `ge` | greater than or equal to |

### 🗂️ Implicit Objects
- 📄 `pageScope`
- 📨 `requestScope`
- 🗓️ `sessionScope`
- 🌐 `applicationScope`
- 🔤 `param`
- 📋 `paramValues`
- ⚙️ `pageContext`
- ... etc

---

✅ **Summary:** EL makes it easy to embed dynamic Java data directly into JSP pages without writing bulky Java code (scriptlets).