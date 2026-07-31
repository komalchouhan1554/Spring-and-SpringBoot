package main;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	// We need to add MySql jar file
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	
		String myname = "aaa";
		String myemail = "aaa@gmail.com";
		String mypass = "aaa123";
		String mygender = "male";
		String mycity = "Betul";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root", "root");
			
		
		Statement st = con.createStatement();
		
		int count = st.executeUpdate("INSERT INTO users VALUES('"+myname+"' , '"+myemail+"','"+mypass+"','"+mygender+"','"+mycity+"')");
		
			
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
| Sakshi | Sakshi@gmail.com    | S123     | female | puner      |
+--------+---------------------+----------+--------+------------+
7 rows in set (0.00 sec)

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
| aaa    | aaa@gmail.com       | aaa123   | male   | Betul      |
+--------+---------------------+----------+--------+------------+
8 rows in set (0.00 sec) 


*/