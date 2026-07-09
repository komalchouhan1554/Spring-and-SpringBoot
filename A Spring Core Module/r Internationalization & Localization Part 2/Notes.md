# 🌍 Java Internationalization — ResourceBundle Notes

---

## 📦 ResourceBundle

### 🔹 What is it?
- `ResourceBundle` is an **abstract class** present in the `java.util` package
- It is used to achieve **Internationalization (i18n)** with respect to:
  - 📝 Messages (Strings)
  - 🖼️ Images
  - 🔤 Other locale-sensitive content

### ⚠️ Important Note
> 📌 We **must** use a **`.properties` file** to work with `ResourceBundle`

---

## 📄 Naming Convention of Properties File

### 🏷️ Format:
```
basename_languageCode_countryCode_systemVariant.properties
```

| 🔑 Part           | 📖 Description                              |
|-------------------|---------------------------------------------|
| `basename`        | Base name of the bundle (e.g., `MessageBundle`) |
| `languageCode`    | ISO 639 language code (e.g., `en`, `hi`)   |
| `countryCode`     | ISO 3166 country code (e.g., `US`, `IN`)   |
| `systemVariant`   | Optional variant (e.g., dialect, platform)  |

---

## 🌐 Examples

```
MessageBundle_en_US.properties   ➡️  English (United States) 🇺🇸
MessageBundle_hi_IN.properties   ➡️  Hindi (India) 🇮🇳
```

---

## 🛠️ How It Works — Quick Overview

```java
import java.util.ResourceBundle;
import java.util.Locale;

// 🌍 Load the bundle for a specific Locale
Locale locale = new Locale("hi", "IN");
ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle", locale);

// 📩 Fetch a message
String greeting = bundle.getString("greeting");
System.out.println(greeting);
```

### 📁 File: `MessageBundle_hi_IN.properties`
```properties
greeting = नमस्ते! 🙏
farewell = अलविदा! 👋
```

### 📁 File: `MessageBundle_en_US.properties`
```properties
greeting = Hello! 👋
farewell = Goodbye! 🤝
```

---

## 🔄 Fallback Mechanism

ResourceBundle uses a **fallback chain** 🔗 to find the best matching file:

```
1️⃣  basename_language_country_variant.properties
2️⃣  basename_language_country.properties
3️⃣  basename_language.properties
4️⃣  basename.properties   ← (default fallback)
```

> 💡 If no matching file is found, a `MissingResourceException` is thrown! ❌

---

## ✅ Key Takeaways

| ✅ Point | 📝 Detail |
|---------|-----------|
| 📦 Package | `java.util` |
| 🧩 Type | Abstract Class |
| 🎯 Purpose | Internationalization (i18n) |
| 📄 File Type | `.properties` |
| 🏷️ Naming | `basename_lang_country.properties` |
| 🔄 Fallback | Yes, automatic fallback chain |

---

> 🌟 **Pro Tip:** Internationalization = **i18n** (because there are 18 letters between 'i' and 'n' in "internationalization"!) 🤓