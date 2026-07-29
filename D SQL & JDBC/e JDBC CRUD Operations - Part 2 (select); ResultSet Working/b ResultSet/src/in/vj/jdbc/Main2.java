package in.vj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");
		
		PreparedStatement ps = con.prepareStatement("select * from users");
		ResultSet rs = ps.executeQuery();
		
		// It will move the resultSet cursor to first row and then next row(second row)
		rs.next();
		rs.next();
		
		String myname = rs.getString("name");
		String myemail = rs.getString("email");
		String mypass = rs.getString("password");
		String mygender = rs.getString("gender");
		String mycity = rs.getString("city");
			
		System.out.println(myname +" - "+myemail +" - "+mypass +" - "+mygender +" - "+mycity);
		
		rs.close();
		ps.close();
		con.close();
	}

}

// Output:-

/*
 
Ravi - ravi@gmail.com - R1 - male - pune
 
*/

