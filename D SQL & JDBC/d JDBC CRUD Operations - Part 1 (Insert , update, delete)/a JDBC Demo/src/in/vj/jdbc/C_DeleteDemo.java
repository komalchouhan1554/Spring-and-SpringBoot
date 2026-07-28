package in.vj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class C_DeleteDemo {

	// We need to add MySql jar file
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");
		
		PreparedStatement ps  = con.prepareStatement("DELETE from users WHERE name = ?");
		ps.setString(1, "Shivani");
		
		int count = ps.executeUpdate();
		
		if(count > 0)
		{
			System.out.println("User Deleted succesfully..");
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

User Deleted succesfully..


mysql> select * from users;
+---------+------------------+----------+--------+--------+
| name    | email            | password | gender | city   |
+---------+------------------+----------+--------+--------+
| Vishal  | vishal@gmail.com | v1       | male   | indore |
| Ravi    | Ravi@gmail.com   | R1       | male   | pune   |
| Komal   | Komal@gmail.com  | K1       | female | mumbai |
| Rajesh  | rajesh@gmail.com | R1       | male   | Dewas  |
+---------+------------------+----------+--------+--------+
5 rows in set (0.00 sec)
*/