package in.vj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main5 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");
		
		// PreparedStatement ps = con.prepareStatement("select * from users");
		PreparedStatement ps = con.prepareStatement(
			    "select * from users",
			    ResultSet.TYPE_SCROLL_INSENSITIVE,
			    ResultSet.CONCUR_READ_ONLY
			);
		ResultSet rs = ps.executeQuery();
		
		// RessultSet cursor is before the first row & It will not move the resultSet cursor and 
		// we are trying to fetch the values from resultSet so it will provide an Exception.
		
		String myname = rs.getString("name");
		String myemail = rs.getString("email");
		String mypass = rs.getString("password");
		String mygender = rs.getString("gender");
		String mycity = rs.getString("city");
			
		System.out.println(myname +" - "+myemail +" - "+mypass +" - "+mygender +" - "+mycity);
	}

}

// Output:-

/*
 
Exception in thread "main" java.sql.SQLException: Before start of result set
 
*/

