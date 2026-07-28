package in.vj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class B_UpdateDemo {

	// We need to add MySql jar file
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Email: ");
		String email = sc.next();
		System.out.print("Enter your City: ");
		String city = sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");
		
		PreparedStatement ps  = con.prepareStatement("UPDATE users SET city = ? WHERE email = ?");
		ps.setString(1, city);
		ps.setString(2, email);
		
		int count = ps.executeUpdate();
		
		if(count > 0)
		{
			System.out.println("Users Updated succesfully..");
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

Enter your Email:  Komal@123
Enter your City: Ujjain
Users Updated succesfully..


mysql> select * from users;
+--------+---------------------+----------+--------+------------+
| name   | email               | password | gender | city       |
+--------+---------------------+----------+--------+------------+
| Vishal | vishal@gmail.com    | v1       | male   | indore     |
| Ravi   | Ravi@gmail.com      | R1       | male   | pune       |
| Komal  | Komal@gmail.com     | K1       | female | mumbai     |
| Rajesh | rajesh@gmail.com    | R1       | male   | Dewas      |
| Shivam | shivam123@gmail.com | S1       | male   | Chandigarh |
+--------+---------------------+----------+--------+------------+
5 rows in set (0.00 sec)

mysql> select * from users;
+--------+---------------------+----------+--------+------------+
| name   | email               | password | gender | city       |
+--------+---------------------+----------+--------+------------+
| Vishal | vishal@gmail.com    | v1       | male   | indore     |
| Ravi   | Ravi@gmail.com      | R1       | male   | pune       |
| Komal  | Komal@gmail.com     | K1       | female | Ujjain     |
| Rajesh | rajesh@gmail.com    | R1       | male   | Dewas      |
| Shivam | shivam123@gmail.com | S1       | male   | Chandigarh |
+--------+---------------------+----------+--------+------------+
5 rows in set (0.00 sec)
*/