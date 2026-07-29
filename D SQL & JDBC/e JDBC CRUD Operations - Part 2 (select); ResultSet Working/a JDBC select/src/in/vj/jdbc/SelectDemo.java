package in.vj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");
		
		PreparedStatement ps = con.prepareStatement("select * from users");
		ResultSet rs = ps.executeQuery();
		
		// It will move the resultSet cursor one by one
		while(rs.next())
		{
			String myname = rs.getString("name");
			String myemail = rs.getString("email");
			String mypass = rs.getString("password");
			String mygender = rs.getString("gender");
			String mycity = rs.getString("city");
			
			System.out.println(myname +" - "+myemail +" - "+mypass +" - "+mygender +" - "+mycity);
			
		}
		
		rs.close();
		con.close();
		ps.close();

	}

}

// Output:-

/*
 
Vishal  - vishal@gmail.com    - v1 - male - indore
Ravi 	- ravi@gmail.com 	  - R1 - male - pune
Komal 	- komal@gmail.com 	  - K1 - female - Ujjain
Shivam  - shivam123@gmail.com  - S1 - male - Chandigarh 
 
*/

