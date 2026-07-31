package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

	// We need to add MySql jar file
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root", "root");
			
		PreparedStatement ps  = con.prepareStatement("INSERT INTO users values (?,?,?,?,?)");
		ps.setString(1, "Sakshi");
		ps.setString(2, "Sakshi@gmail.com");
		ps.setString(3, "S123");
		ps.setString(4, "female");
		ps.setString(5, "puner");
			
		int count = ps.executeUpdate();
			
		if(count > 0)
		{
			System.out.println("Data insered succesfully..");
		}
		else {
			System.out.println("ERROR !!!");
		}
			
		
	}

}

// Output:-

/*

Data insered succesfully..


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
6 rows in set (0.01 sec)



----------After run the program -------


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
| Sakshi | Sakshi@gmail.com    | S123     | female | puner      |
+--------+---------------------+----------+--------+------------+
7 rows in set (0.00 sec)

*/