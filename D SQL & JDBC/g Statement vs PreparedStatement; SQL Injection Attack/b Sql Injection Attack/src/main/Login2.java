package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email id: ");
		String myemail = sc.nextLine();
		
		System.out.println("Enter Password: ");
		String mypass = sc.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");

		String sql_query = "SELECT * FROM users WHERE email=?  AND password=?";
		System.out.println(sql_query);
		
		PreparedStatement ps = con.prepareStatement(sql_query);
		ps.setString(1, myemail);
		ps.setString(2, mypass);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
		{
			System.out.println("Welcome "+ rs.getString("name"));
		}else {
			System.out.println("NOT MAtched");
		}
		
		
		sc.close();
		con.close();
		ps.close();
		rs.close();
		
	}

}

// Output:-

/*

-> First run

Enter email id: 
ravi@gmail.com
Enter Password: 
R1
SELECT * FROM users WHERE email=?  AND password=?
Welcome Ravi

-> Second run

Enter email id: 
ravi@gmail.com' OR 'a' = 'a
Enter Password: 
123
SELECT * FROM users WHERE email=?  AND password=?
NOT MAtched



*/
