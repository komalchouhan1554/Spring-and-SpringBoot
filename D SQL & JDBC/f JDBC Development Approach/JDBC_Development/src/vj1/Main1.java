package in.vj1;

// Using try-catch-finally block

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main1 {
	
	public static void main(String[] args) 
	{
		
		Connection con = null;
		PreparedStatement ps = null;
		
		String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/shopping_app";
		String USERNAME = "root";
		String PASSWORD = "root";
		
		try 
		{
			Class.forName(DRIVER_CLASS);
			con = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
			String sql_query = "Insert into users values(?,?,?,?,?)";
			ps = con.prepareStatement(sql_query);
			
			ps.setString(1, "Sumit");
			ps.setString(2, "Sumit@gmail.com");
			ps.setString(3, "Sumit123");
			ps.setString(4, "male");
			ps.setString(5, "Banglore");
			
			int count = ps.executeUpdate();
			
			if(count > 0)
			{
				System.out.println("Data inserted Successfull...");
			}
			else {
				System.out.println("ERROR!!!");
			}
			
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally {
			
			try {
				if(con != null)
				{
					con.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			
			try {
				if(ps != null)
				{
					con.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

	}
}

// Output:-

/*
 
Data inserted Successfull...
 
*/
