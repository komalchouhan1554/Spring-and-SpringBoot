package in.vj.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	// We need to add MySql jar file
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		// Load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Establish the connection between java & database
		DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app","root","root");
		
		System.out.println("Success");

	}

}

// Output:-

/*

Success

*/