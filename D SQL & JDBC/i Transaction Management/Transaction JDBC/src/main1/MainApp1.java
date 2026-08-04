package main1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainApp1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");

		PreparedStatement ps1 = con.prepareStatement("update---------------");
		PreparedStatement ps2 = con.prepareStatement("update---------------");
		PreparedStatement ps3 = con.prepareStatement("insert---------------");
		PreparedStatement ps4 = con.prepareStatement("insert---------------");
		
		int count1 = ps1.executeUpdate();
		int count2 = ps2.executeUpdate();
		int count3 = ps3.executeUpdate();
		int count4 = ps4.executeUpdate();
		
		if(count1 > 0 && count2 > 0 && count3 > 0 && count4 > 0)
		{
			System.out.println("Success");
		}
		else {
			System.out.println("Fail");
		}
	}

}
