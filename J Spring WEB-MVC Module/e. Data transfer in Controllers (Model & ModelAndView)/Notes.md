# 📝 Spring MVC Notes

## 📦 Model

- 🧩 `Model` is an **interface** that is used to store data that is rendered by a **view**.
- 🗺️ It is a **Map-like object** that stores **key-value pairs**, where:
  - 🔑 **Key** → the name of the attribute
  - 💾 **Value** → the attribute value

---

## 🔄 ModelAndView

- 🏗️ `ModelAndView` is a **class** that is used to return data from a **controller** to a **view**.
- 📊 It can store **any type of data**, such as:
  - 📦 Model data
  - 📚 Collection data
  - ➕ etc.
- 🚀 This data is then transferred to the **view**.

---

## ⚡ Quick Comparison

| Feature | 📦 Model | 🔄 ModelAndView |
|---|---|---|
| Type | Interface | Class |
| Structure | Map-like (key-value) | Can hold data + view info |
| Purpose | Store attributes for view | Return data & view together |