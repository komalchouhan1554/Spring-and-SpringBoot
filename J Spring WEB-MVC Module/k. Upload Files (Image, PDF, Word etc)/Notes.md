# 📂 Upload Files (Images, PDF, Word, XML, etc.) in Spring WEB Module

## 🚀 Steps to Upload File

### 1️⃣ Create form to upload file
- 🖱️ To select file we will use `<input type="file">`
- 📦 We have to provide `enctype="multipart/form-data"` in order to upload any file

```html
<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file" />
    <input type="submit" value="Upload" />
</form>
```

### 2️⃣ Provide dependency
- 📚 Add the **commons-fileupload** dependency (along with `commons-io`)

```xml
<dependency>
    <groupId>commons-fileupload</groupId>
    <artifactId>commons-fileupload</artifactId>
    <version>1.4</version>
</dependency>
```

### 3️⃣ Get the file name & file (in bytes) 📝
- 🔤 Get the file name
- 💾 Get the file content **in bytes**
- 🗂️ Write the file into the folder (on server)

### 4️⃣ Configure `CommonsMultipartResolver` ⚙️
- 🛠️ Configure the `CommonsMultipartResolver` class in the Spring configuration file (`applicationContext.xml` / `spring-servlet.xml`)

```xml
<bean id="multipartResolver"
      class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
    <property name="maxUploadSize" value="10485760"/>
</bean>
```

---

## ❓ What is `enctype`?

- 🔐 It specifies **how form-data should be encoded** before sending it to the server.
- 🚫 It can be used **only with `POST` method**, **not with `GET`** method.

| Enctype Value | Description |
|---|---|
| 🧾 `application/x-www-form-urlencoded` | Default; encodes data as key-value pairs |
| 📎 `multipart/form-data` | Used when a form includes file uploads |
| 📄 `text/plain` | Sends data with no encoding (rarely used) |

---

✅ **Summary:** To upload a file in Spring, create a multipart form → add `commons-fileupload` dependency → read filename & bytes → write to server folder → configure `CommonsMultipartResolver` in Spring config. 🎉