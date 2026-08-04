package main2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainApp2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");
			
			
			try 
			{
				con.setAutoCommit(false);
				
				PreparedStatement ps1 = con.prepareStatement("INSERT INTO items VALUES(101,'jeans',2999)");
				PreparedStatement ps2 = con.prepareStatement("INSERT INTO items VALUES(102,'shirt',499)");
				PreparedStatement ps3 = con.prepareStatement("INSERT INTO items VALUES(103,'Tshirt','bbb')");
			
				int count1 = ps1.executeUpdate();
				int count2 = ps2.executeUpdate();
				int count3 = ps3.executeUpdate();
				
				if(count1 > 0 && count2 > 0 && count3 > 0)
				{
					con.commit();
					System.out.println("Success");
				}
				else {
					con.rollback();
					System.out.println("Fail");
				}
			} 
			catch (Exception e) 
			{
				try 
				{
					con.rollback();
					System.out.println("fail");
				} 
				catch (Exception e2) 
				{
					e2.printStackTrace();
				}
			}
			
		
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		
	}

}


// Output:-
// fail

// If any one query has any error the data is not permanently int the database.
