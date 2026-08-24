# 🗄️ Hibernate Methods — Quick Reference Notes

---

## 💾 `save()` vs `persist()`

### 💡 `save()` Method
- ✅ Inserts the record into the database
- 🔑 **Returns** the **primary key** of the saved object
- 📌 Signature:
  ```java
  Serializable save(Object object);
  ```

### 💡 `persist()` Method
- ✅ Inserts the record into the database
- 🚫 **Does NOT return** any value (returns `void`)
- 📌 Signature:
  ```java
  void persist(Object object);
  ```

| Feature | `save()` | `persist()` |
|---|---|---|
| Return type | `Serializable` (primary key) 🔑 | `void` ❌ |
| Inserts record | ✅ Yes | ✅ Yes |

---

## 🔍 `get()` vs `load()`

### 📥 `get()` Method
- 🎯 Retrieves an object from the database by its **primary key**
- ⚡ Uses **Eager Loading** (Early Loading) — fetches and initializes all properties immediately
- 🟢 If object is **found** → returns the **actual object** with all data
- 🔴 If object is **not found** → returns **`null`**

### 📦 `load()` Method
- 🎯 Also retrieves an object by its **primary key**
- 🐢 Uses **Lazy Loading** — fetches data from DB **only when getter methods are called**
- 🟢 If object is **found** → returns a **proxy object** (not the actual object)
- 🔴 If object is **not found** → throws **`ObjectNotFoundException`** ⚠️

| Feature | `get()` | `load()` |
|---|---|---|
| Loading type | Eager / Early ⚡ | Lazy 🐢 |
| Returns | Actual object 📦 | Proxy object 👻 |
| If not found | Returns `null` 🟡 | Throws `ObjectNotFoundException` 🔴 |

---

## 🔄 `update()` vs `saveOrUpdate()`

### ✏️ `update()` Method
- 🔄 Updates the record **if the row exists** in the database
- ⚠️ If the row is **NOT present**, it throws an **exception** ❌

### 🔀 `saveOrUpdate()` Method
- 🔗 Combination of `save()` + `update()`
- 🔍 Checks whether the object exists in the database:
  - ✅ **Exists** → performs an **UPDATE**
  - ➕ **Doesn't exist** → performs an **INSERT**

| Feature | `update()` | `saveOrUpdate()` |
|---|---|---|
| Row exists | Updates ✅ | Updates ✅ |
| Row not found | Throws Exception ❌ | Inserts new record ➕ |
| Smart check | ❌ No | ✅ Yes |

---

> 📝 *These are core Hibernate session methods. Understanding their differences helps in choosing the right one based on use case and expected behavior.*