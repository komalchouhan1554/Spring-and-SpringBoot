package in.vj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main7 {

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
		
		// It will provide the resultSet cursor after the last row
		rs.afterLast();
		
		// Fetch the data in backward direction
		while(rs.previous())
		{
			String myname = rs.getString("name");
			String myemail = rs.getString("email");
			String mypass = rs.getString("password");
			String mygender = rs.getString("gender");
			String mycity = rs.getString("city");
				
			System.out.println(myname +" - "+myemail +" - "+mypass +" - "+mygender +" - "+mycity);
		}
		
		rs.close();
		ps.close();
		con.close();
	}

}

// Output:-

/*
 
Shivam - shivam123@gmail.com - S1 - male - Chandigarh
Komal - komal@gmail.com - K1 - female - Ujjain
Ravi - ravi@gmail.com - R1 - male - pune
Vishal - vishal@gmail.com - v1 - male - indore
 
*/

