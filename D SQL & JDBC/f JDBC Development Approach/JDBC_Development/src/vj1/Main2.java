package in.vj1;

// Using try with resources

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main2 {
	
	public static void main(String[] args) 
	{
		
		String sql_query = "Insert into users values(?,?,?,?,?)";
		
		String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/shopping_app";
		String USERNAME = "root";
		String PASSWORD = "root";
		
		try 
		{
			Class.forName(DRIVER_CLASS);
			try(
					Connection con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
					PreparedStatement ps = con.prepareStatement(sql_query);
				)
			{
				ps.setString(1, "Ritik");
				ps.setString(2, "Ritik@gmail.com");
				ps.setString(3, "Ritik123");
				ps.setString(4, "male");
				ps.setString(5, "Banglore");
				
				int count = ps.executeUpdate();
				
				if(count > 0)
				{
					System.out.println("Data inserted Successfull...");
				}
				else {
					System.out.println("ERROR!!!");
				}
			}	
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}

// Output:-

/*
 
Data inserted Successfull...

mysql> select * from users;
+--------+---------------------+----------+--------+------------+
| name   | email               | password | gender | city       |
+--------+---------------------+----------+--------+------------+
| Vishal | vishal@gmail.com    | v1       | male   | indore     |
| Ravi   | ravi@gmail.com      | R1       | male   | pune       |
| Komal  | komal@gmail.com     | K1       | female | Ujjain     |
| Shivam | shivam123@gmail.com | S1       | male   | Chandigarh |
| Sumit  | Sumit@gmail.com     | Sumit123 | male   | Banglore   |
+--------+---------------------+----------+--------+------------+
5 rows in set (0.01 sec)


mysql> select * from users;
+--------+---------------------+----------+--------+------------+
| name   | email               | password | gender | city       |
+--------+---------------------+----------+--------+------------+
| Vishal | vishal@gmail.com    | v1       | male   | indore     |
| Ravi   | ravi@gmail.com      | R1       | male   | pune       |
| Komal  | komal@gmail.com     | K1       | female | Ujjain     |
| Shivam | shivam123@gmail.com | S1       | male   | Chandigarh |
| Sumit  | Sumit@gmail.com     | Sumit123 | male   | Banglore   |
| Ritik  | Ritik@gmail.com     | Ritik123 | male   | Banglore   |
+--------+---------------------+----------+--------+------------+
6 rows in set (0.00 sec)
 
*/
