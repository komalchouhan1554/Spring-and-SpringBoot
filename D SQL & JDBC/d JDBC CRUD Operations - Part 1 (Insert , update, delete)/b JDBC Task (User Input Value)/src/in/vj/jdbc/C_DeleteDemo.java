package in.vj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class C_DeleteDemo {

	// We need to add MySql jar file
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Name: ");
		String name = sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");
		
		PreparedStatement ps  = con.prepareStatement("DELETE from users WHERE name = ?");
		ps.setString(1, name);
		
		int count = ps.executeUpdate();
		
		if(count > 0)
		{
			System.out.println("User Deleted succesfully..");
		}
		else {
			System.out.println("ERROR !!!");
		}
		
		sc.close();
		ps.close();
		con.close();
		
	}

}

// Output:-

/*

Enter your Name: Rajesh
User Deleted succesfully..


mysql> select * from users;
+--------+---------------------+----------+--------+------------+
| name   | email               | password | gender | city       |
+--------+---------------------+----------+--------+------------+
| Vishal | vishal@gmail.com    | v1       | male   | indore     |
| Ravi   | Ravi@gmail.com      | R1       | male   | pune       |
| Komal  | Komal@gmail.com     | K1       | female | Ujjain     |
| Shivam | shivam123@gmail.com | S1       | male   | Chandigarh |
+--------+---------------------+----------+--------+------------+

*/