# 📥 Download File (Images, PDF, Word, XML, etc.) in Spring Web Module

Notes on how to implement file download functionality in a Spring Web MVC application.

---

## 🪜 Steps to Download a File

### 1️⃣ Create a Form to Upload File
- 🖱️ Use `<input type="file">` in the HTML form to allow file selection.
- 📎 Set `enctype="multipart/form-data"` on the `<form>` tag — this is **mandatory** for uploading any file (without it, only the filename is sent, not the actual file content).

```html
<form action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/>
    <button type="submit">Upload</button>
</form>
```

---

### 2️⃣ Add the Required Dependency
- 📦 Add the **`commons-fileupload`** dependency to handle multipart requests on the server side.

```xml
<dependency>
    <groupId>commons-fileupload</groupId>
    <artifactId>commons-fileupload</artifactId>
    <version>1.4</version>
</dependency>
```

---

### 3️⃣ Set Response Object Properties
Before writing the file to the response, configure these settings so the browser knows it's receiving a downloadable file:

| ⚙️ Setting | 💡 Purpose |
|---|---|
| `response.setContentType("application/octet-stream");` | 📄 Tells the browser this is binary/generic file data |
| `response.setHeader("content-disposition", "attachment;filename=\"" + file_name + "\"");` | 💾 Forces "Save As" dialog and sets the downloaded file's name |
| `response.setContentLength((int) file.length());` | 📏 Sets the total size of the file being sent |

```java
response.setContentType("application/octet-stream");
response.setHeader("content-disposition", "attachment;filename=\"" + file_name + "\"");
response.setContentLength((int) file.length());
```

---

### 4️⃣ Copy File from InputStream to OutputStream
- 🔄 Read the file using an `InputStream` and write it to the `OutputStream` of the response so it streams down to the client's browser.

```java
InputStream inputStream = new FileInputStream(file);
OutputStream outputStream = response.getOutputStream();

byte[] buffer = new byte[1024];
int bytesRead;
while ((bytesRead = inputStream.read(buffer)) != -1) {
    outputStream.write(buffer, 0, bytesRead);
}

inputStream.close();
outputStream.close();
```

---

## ✅ Quick Summary
1. 📝 **Form** → `<input type="file">` + `enctype="multipart/form-data"`
2. 📦 **Dependency** → `commons-fileupload`
3. ⚙️ **Response Config** → Content type, content-disposition, content length
4. 🔄 **Stream Copy** → InputStream ➡️ OutputStream

> 💡 **Tip:** `application/octet-stream` works generically for any file type (images 🖼️, PDFs 📄, Word docs 📃, XML 🗂️), since it just tells the browser "download this, don't try to render it."