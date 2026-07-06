# 📋 Log4j API — Java Logging Framework

---

## 📌 What is Log4j?

| 🏷️ Property     | 📄 Details                                              |
|----------------|--------------------------------------------------------|
| 📦 Type         | Open-source **Logging API** for Java                   |
| 📅 Introduced   | **2001**                                               |
| ⚡ Features     | Fast, Reliable, and Flexible                           |
| 🎯 Purpose      | Store log details for tracking errors, messages, instructions, etc. |

> 💡 **NOTE:** To use Log4j, you must download the JAR file → `log4j.xxx.jar`

---

## 🧩 Components of Log4j

```
        ┌──────────────────────────────┐
        │         Log4j API            │
        └──────────┬───────────────────┘
                   │
        ┌──────────▼──────────────┐
        │   i. 📝 Logger          │  ← Generates log messages
        │   ii. 📤 Appender       │  ← Determines where logs go
        └─────────────────────────┘
```

---

## 📝 i. Logger

> **Logger** is an object/component that **generates** the log messages.

### 🔐 Security Levels of Logger

> Levels are arranged from **HIGHEST** to **LOWEST** priority:

```
  🔴  OFF     ◄── Highest Value (turns off all logging)
       │
  🔴  FATAL   ──►  fatal()
       │
  🔴  ERROR   ──►  error()
       │
  🟡  WARN    ──►  warn()
       │
  🟢  INFO    ──►  info()
       │
  🔵  DEBUG   ──►  debug()
       │
  🔵  TRACE   ◄── Lowest Value (most detailed)
                ──►  trace()
```

| 🔢 Priority | 🏷️ Level    | ⚙️ Method     | 📖 Description                          |
|------------|------------|--------------|----------------------------------------|
| 1 (High)   | 🔴 `OFF`   | —            | Turns off all logging                  |
| 2          | 🔴 `FATAL` | `fatal()`    | Severe errors causing app to abort     |
| 3          | 🔴 `ERROR` | `error()`    | Runtime errors or unexpected conditions|
| 4          | 🟡 `WARN`  | `warn()`     | Potentially harmful situations         |
| 5          | 🟢 `INFO`  | `info()`     | General informational messages         |
| 6          | 🔵 `DEBUG` | `debug()`    | Detailed debug information             |
| 7 (Low)    | 🔵 `TRACE` | `trace()`    | Most fine-grained informational events |

> ⚠️ **Rule:** If a level is set, all levels **above** it are also logged.
> Example: Setting `WARN` → logs `WARN`, `ERROR`, and `FATAL`

---

## 📤 ii. Appender

> **Appender** is an object/component that determines **where** the log messages are sent for storage or display.

### 📋 Types of Appenders

| 🔢 # | 📤 Appender          | 📖 Description                                  |
|-----|---------------------|------------------------------------------------|
| 1   | 🖥️ `ConsoleAppender` | Outputs logs to the **console** (stdout/stderr)|
| 2   | 📁 `FileAppender`    | Writes logs to a **file**                      |
| 3   | ✍️ `WriterAppender`  | Writes logs to a **Writer** object             |
| 4   | 🗄️ `JDBCAppender`    | Stores logs in a **database** via JDBC         |
| 5   | 🔌 `SocketAppender`  | Sends logs to a **remote socket server**       |
| 6   | 📡 `TelnetAppender`  | Delivers logs via **Telnet**                   |
| 7   | 📧 `SMTPAppender`    | Sends logs via **Email (SMTP)**                |
| 8   | 🖧 `SyslogAppender`  | Sends logs to a **Syslog daemon**              |

---

## 🎨 Conversion Patterns

> Conversion patterns define the **format/layout** of log messages.

### 🔣 Pattern Symbols Reference

| 🔣 Symbol      | 📖 Meaning                                     |
|---------------|-----------------------------------------------|
| `%p`          | 🏷️ Log **level/priority** (e.g., FATAL, ERROR) |
| `%d`          | 📅 **Date and time** (default format)          |
| `%d{pattern}` | 📅 **Date and time** with custom format        |
| `%m`          | 💬 **Log message** content                    |
| `%n`          | ↩️ **New line** character                      |
| `%-8p`        | 🏷️ Log level, **left-aligned**, padded to 8 chars |

---

### 📐 Pattern Examples

#### 1️⃣ Pattern 1 — Basic
```
%p    %d    %m%n
```
**Output:**
```
FATAL    2023-08-08 08:53:37,995    This is fatal message
```

---

#### 2️⃣ Pattern 2 — With Brackets & Full Date
```
[%p]    %d{dd MMM yyyy HH:mm:ss,SSS}  -  %m%n
```
**Output:**
```
[FATAL]    08 Aug 2023 08:57:59,976    -  This is fatal message
```

---

#### 3️⃣ Pattern 3 — With 12-Hour Clock & AM/PM
```
[%p]    %d{dd/MM/yyyy hh:mm:ss aa}  -  %m%n
```
**Output:**
```
[FATAL]    08/08/2023 08:59:20 am    -  This is fatal message
```

---

#### 4️⃣ Pattern 4 — Left-Aligned & Padded Level
```
[%-8p]    %d{dd/MM/yyyy hh:mm:ss aa}  -  %m%n
```
**Output:**
```
[FATAL   ]    08/08/2023 09:02:44 am    -  This is fatal message
```

> 💡 `%-8p` → left-aligns the level name and **pads it to 8 characters** (notice the spaces after `FATAL`)

---

### 📅 Date Format Tokens

| 🔣 Token | 📖 Meaning              | 📌 Example   |
|---------|------------------------|-------------|
| `dd`    | Day (2 digits)         | `08`        |
| `MM`    | Month (2 digits)       | `08`        |
| `MMM`   | Month (short name)     | `Aug`       |
| `yyyy`  | Year (4 digits)        | `2023`      |
| `HH`    | Hour (24-hour)         | `08` – `23` |
| `hh`    | Hour (12-hour)         | `08` – `12` |
| `mm`    | Minutes                | `53`        |
| `ss`    | Seconds                | `37`        |
| `SSS`   | Milliseconds           | `995`       |
| `aa`    | AM / PM indicator      | `am` / `pm` |

---

## 🗂️ Summary

```
📋 Log4j
 ├── 📝 Logger        → Generates log messages
 │    └── Levels: OFF > FATAL > ERROR > WARN > INFO > DEBUG > TRACE
 │
 └── 📤 Appender      → Sends logs to a destination
      ├── 🖥️  Console
      ├── 📁  File
      ├── 🗄️  Database (JDBC)
      ├── 🔌  Socket
      ├── 📧  Email (SMTP)
      └── ...more
```

> 🚀 **Best Practice:** Use `DEBUG` or `TRACE` during development, and `WARN` or `ERROR` in production to keep logs clean and performant!