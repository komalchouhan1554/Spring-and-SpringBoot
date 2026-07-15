# ☕ Maven Notes

---

## 📥 How to Download and Install Maven

1. 🌐 Download the zip file from : https://maven.apache.org/download.cgi
2. 📂 Extract the downloaded file.
3. 💻 Open CMD and check maven version:
   ```
   mvn -version
   ```
4. ⚠️ If it gives an error:
   > `mvn is not recognized as an internal or external command`
   
   → You need to **set the PATH** in environment variables.

5. 🛠️ Set the path in **Environment Variables**:
   ```
   D:\Softwares\Maven\apache-maven-3.9.4-bin\apache-maven-3.9.4\bin
   ```

6. ✅ Then again check the maven version:
   ```
   mvn -version
   ```

---

## 🏗️ How to Create a Maven Project in CMD

1. 📝 Run the command:
   ```
   mvn archetype:generate
   ```
2. 🔢 Choose archetype: **2071** (quickstart)
   > ⚠️ **NOTE:** This number can change according to version.

3. 🔢 Choose the version number: **5** (1.0 version)

4. 📋 Provide project details:
   | Field | Value |
   |-------|-------|
   | `groupId` | `in.vishaljadhav` *(organization domain in reverse order)* |
   | `artifactId` | `FirstMavenProject` |
   | `version` | `1.0` |
   | `package` | `in.vishaljadhav.main` |

5. ✅ Press **Y** to confirm.

---

## ⚡ How to Create a Maven Project Using a Single Command

### 🚀 Quickstart Project
```bash
mvn archetype:generate \
  -DgroupId=in.smartprogramming \
  -DartifactId=SecondMavenProject \
  -Dversion=1.0 \
  -Dpackage=in.smartprogramming.main \
  -DarchetypeArtifactId=maven-archetype-quickstart
```

### 🌐 Web Application Project
```bash
mvn archetype:generate \
  -DgroupId=in.smartprogramming \
  -DartifactId=ThirdMavenProject \
  -Dversion=1.0 \
  -Dpackage=in.smartprogramming.main \
  -DarchetypeArtifactId=maven-archetype-webapp
```

---

## ▶️ How to Compile and Run a Maven Project

1. 📁 Navigate to the project location:
   ```
   D:\Maven Projects\FirstMavenProject>
   ```

2. 🔨 Compile the project:
   ```
   mvn compile
   ```

3. 🚀 Run the project:
   ```
   mvn exec:java -Dexec.mainClass="in.vishaljadhav.main.App"
   ```

---

## 📦 How to Create a Maven Package (JAR / WAR / EAR) and Execute It

1. 📦 Package the project:
   ```
   mvn package
   ```

2. 🛤️ Set the classpath to the JAR file location:
   ```
   set classpath=D:\Maven Projects\SecondMavenProject\target\SecondMavenProject-1.0.jar
   ```

3. ▶️ Execute the main class:
   ```
   java in.vishaljadhav.main.App
   ```
   > 💡 **Format:** `java fully_qualified_package_name.MainClassName`

---

> 🎯 *Building with Maven!* ☕🔧