# 🌐 HTTP Notes

## 📡 HTTP (Hyper Text Transfer Protocol)

- 🔧 HTTP is a **protocol** (a set of rules and regulations) that defines how data is **transmitted** and **formatted**, and how web servers and web browsers should **respond** to various commands and requests.
- 💡 In simple terms, HTTP is a protocol that enables us to **request** and **receive** web pages, images, videos, or any other resources when we browse the internet.

---

## ⚙️ HTTP Methods

- 🎯 HTTP methods are the **commands/actions** that indicate the desired action to be performed on a resource identified by a URL. These methods define the operations we want to carry out on a server when making an HTTP request.

- 📋 Some HTTP methods are:
    1. 📥 GET
    2. 📤 POST
    3. 🔄 PUT
    4. 🗑️ DELETE
    5. 🧾 HEAD
    6. ⚙️ OPTIONS
    7. ✏️ PATCH
    8. 🔍 TRACE
    9. ➕ etc.

---

## ⚔️ Difference between GET and POST

### 1️⃣ Purpose
- 📥 **GET** is used to **retrieve** data from the server. It does not perform any change at server side.
- 📤 **POST** is used to **send** data to the server for processing. It performs some changes at server side.

### 2️⃣ How data is transferred
- 🔗 In **GET**, data is transferred to the server through the **URL**.
- 📦 In **POST**, data is transferred to the server using the **request body**.

### 3️⃣ Security
- 🔓 **GET** is **less secure** because data is visible in the URL. Thus, we should not use GET requests for sensitive data like passwords.
- 🔒 **POST** is **more secure** because data is transferred through the request body, which is not visible. Thus, we can use POST requests for sensitive data like passwords.

### 4️⃣ Amount of data
- 🚫 We **cannot** send large amounts of data using **GET** because it transfers data using the URL.
- ✅ We **can** send large amounts of data (images, files, videos, etc.) using **POST** because it transfers data using the request body.

### 5️⃣ Examples
- 📥 **GET:**
    - 🖥️ Fetching web pages
    - 🔎 Performing a search query
    - ➕ etc.
- 📤 **POST:**
    - 📝 Submitting a form
    - 🖼️ Uploading a file, image, or video
    - 💳 Making a payment through a website
    - ➕ etc.

### 6️⃣ Bookmarked
- ⭐ **GET** requests **can** be bookmarked.
- 🚫 **POST** requests **cannot** be bookmarked.

### 7️⃣ Caching
- 💾 **GET** requests **can** be cached by browsers and intermediary systems. This can improve performance in some cases.
- 🚫 **POST** requests **cannot** be cached.

---

![get method](Using%20of%20GET.png)
---

![post method](Using%20of%20POST.png)

---

✅ **Quick Summary Table**

| Feature 🏷️ | GET 📥 | POST 📤 |
|---|---|---|
| Purpose | Retrieve data | Send data / process |
| Data location | URL | Request body |
| Security | Less secure 🔓 | More secure 🔒 |
| Data size | Limited 🚫 | Large ✅ |
| Bookmarkable | Yes ⭐ | No 🚫 |
| Cacheable | Yes 💾 | No 🚫 |