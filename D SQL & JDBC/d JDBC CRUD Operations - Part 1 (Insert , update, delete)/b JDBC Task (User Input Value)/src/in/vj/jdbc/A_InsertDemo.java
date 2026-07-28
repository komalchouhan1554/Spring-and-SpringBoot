package in.vj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class A_InsertDemo {

	// We need to add MySql jar file
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Name: ");
		String name = sc.next();
		System.out.print("Enter your Email: ");
		String email = sc.next();
		System.out.print("Enter your Password: ");
		String pass = sc.next();
		System.out.print("Enter your Gender: ");
		String gender = sc.next();
		System.out.print("Enter your City: ");
		String city = sc.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");
		
		PreparedStatement ps  = con.prepareStatement("INSERT INTO users values (?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, pass);
		ps.setString(4, gender);
		ps.setString(5, city);
		
		int count = ps.executeUpdate();
		
		if(count > 0)
		{
			System.out.println("Data insered succesfully..");
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

Enter your Name: Shivam
Enter your Email: shivam123@gmail.com
Enter your Password: S1
Enter your Gender: male
Enter your City: Chandigarh
Data insered succesfully..


mysql> show tables;
+------------------------+
| Tables_in_shopping_app |
+------------------------+
| users                  |
+------------------------+
1 row in set (0.00 sec)

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

*/