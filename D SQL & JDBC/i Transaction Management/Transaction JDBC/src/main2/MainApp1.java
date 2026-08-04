package main2;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");
			
			
			try 
			{
				con.setAutoCommit(false);
				
				Statement st1 = con.createStatement();
				
				int count1 = st1.executeUpdate("INSERT INTO items VALUES(101,'jeans',2999)");
				int count2 = st1.executeUpdate("INSERT INTO items VALUES(102,'shirt','aaa')");
				int count3 = st1.executeUpdate("INSERT INTO items VALUES(103,'Tshirt',799)");
				
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
