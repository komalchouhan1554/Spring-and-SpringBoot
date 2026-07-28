# JDBC Notes

## Steps to Execute SQL Query Using JDBC

1. **Load and Register Driver**
   ```java
   Class.forName("Driver ClassName");
   ```

2. **Establish the Connection** between Java application and database
   ```java
   Connection con = DriverManager.getConnection("url", "username", "password");
   ```

3. **Create Statement / PreparedStatement / CallableStatement object**
   ```java
   Statement st = con.createStatement();
   PreparedStatement ps = con.prepareStatement();
   CallableStatement cs = con.prepareCall();
   ```

4. **Send and Execute SQL Query**
   ```java
   int count = ps.executeUpdate();
   ResultSet rs = ps.executeQuery();
   ```

5. **Process the Result**

6. **Close All the Resources**
   ```java
   ps.close();
   con.close();
   ```

---

## CRUD Operations

| Letter | Operation | SQL Command |
|--------|-----------|-------------|
| C | Create | INSERT |
| R | Retrieve | SELECT |
| U | Update | UPDATE |
| D | Delete | DELETE |

These operations are commonly used when working with a database to manipulate data.