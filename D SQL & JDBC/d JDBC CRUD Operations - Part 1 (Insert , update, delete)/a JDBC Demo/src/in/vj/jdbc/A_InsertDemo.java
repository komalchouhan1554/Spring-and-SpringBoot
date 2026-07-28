package in.vj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A_InsertDemo {

	// We need to add MySql jar file
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// Load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish the connection between java & database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");
		
		// PreparedStatement ps  = con.prepareStatement("INSERT INTO users values ('Shivani', 'Shivani@123', 'S1','female','Ujjain')");

		PreparedStatement ps  = con.prepareStatement("INSERT INTO users values (?,?,?,?,?)");
		ps.setString(1, "Rajesh");
		ps.setString(2, "rajesh@gmail.com");
		ps.setString(3, "R1");
		ps.setString(4, "male");
		ps.setString(5, "Dhar");
		
		int count = ps.executeUpdate();
		
		if(count > 0)
		{
			System.out.println("Data insered succesfully..");
		}
		else {
			System.out.println("ERROR !!!");
		}
		
		ps.close();
		con.close();
		
	}

}

// Output:-

/*

Data insered succesfully..


mysql> select * from users;
+---------+------------------+----------+--------+--------+
| name    | email            | password | gender | city   |
+---------+------------------+----------+--------+--------+
| Vishal  | vishal@gmail.com | v1       | male   | indore |
| Ravi    | Ravi@gmail.com   | R1       | male   | pune   |
| Komal   | Komal@gmail.com  | K1       | female | mumbai |
| Shivani | Shivani@gmail.com| S1       | female | Ujjain |
| Rajesh  | rajesh@gmail.com | R1       | male   | Dhar   |
+---------+------------------+----------+--------+--------+
5 rows in set (0.00 sec)

*/