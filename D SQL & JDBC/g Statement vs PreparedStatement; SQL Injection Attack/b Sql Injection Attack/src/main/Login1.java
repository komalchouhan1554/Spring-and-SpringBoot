package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email id: ");
		String myemail = sc.nextLine();
		
		System.out.println("Enter Password: ");
		String mypass = sc.nextLine();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");

		String sql_query = "SELECT * FROM users WHERE email = '"+ myemail + "' AND password = '"+mypass +"' ";
		System.out.println(sql_query);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql_query);
		
		if(rs.next())
		{
			System.out.println("Welcome "+ rs.getString("name"));
		}else {
			System.out.println("NOT MAtched");
		}
		
		
		sc.close();
		con.close();
		st.close();
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
Welcome Ravi

-> Second run

Enter email id: 
ravi@gmail.com' OR 'a' = 'a
Enter Password: 
123
SELECT * FROM users WHERE email = 'ravi@gmail.com' OR 'a' = 'a' AND password = '123' 
Welcome Ravi



*/
