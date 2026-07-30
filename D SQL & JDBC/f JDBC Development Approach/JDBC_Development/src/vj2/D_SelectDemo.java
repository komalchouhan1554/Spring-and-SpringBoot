package in.vj2;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class D_SelectDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		try 
		{
			Connection con = DatabaseUtility.getConnection();
			
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
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			DatabaseUtility.closeConnection();
		}
		

	}

}

// Output:-

/*
 
Vishal  - vishal@gmail.com    - v1 - male - indore
Ravi 	- ravi@gmail.com 	  - R1 - male - pune
Komal 	- komal@gmail.com 	  - K1 - female - Ujjain
Shivam  - shivam123@gmail.com  - S1 - male - Chandigarh 
 
*/

