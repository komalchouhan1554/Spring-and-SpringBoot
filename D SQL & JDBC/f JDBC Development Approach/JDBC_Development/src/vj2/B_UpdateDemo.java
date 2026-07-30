package in.vj2;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class B_UpdateDemo {

	// We need to add MySql jar file
	public static void main(String[] args) 
	{
		
		try 
		{
			Connection con = DatabaseUtility.getConnection();
			
			PreparedStatement ps  = con.prepareStatement("UPDATE users SET city = ? WHERE email = ?");
			ps.setString(1, "Dewas");
			ps.setString(2, "rajesh@gmail.com");
			
			int count = ps.executeUpdate();
			
			if(count > 0)
			{
				System.out.println("Data insered succesfully..");
			}
			else {
				System.out.println("ERROR !!!");
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

User Updated succesfully..


mysql> select * from users;
+---------+------------------+----------+--------+--------+
| name    | email            | password | gender | city   |
+---------+------------------+----------+--------+--------+
| Vishal  | vishal@gmail.com | v1       | male   | indore |
| Ravi    | Ravi@gmail.com   | R1       | male   | pune   |
| Komal   | Komal@gmail.com  | K1       | female | mumbai |
| Shivani | Shivani@gmail.com| S1       | female | Ujjain |
| Rajesh  | rajesh@gmail.com | R1       | male   | Dhar   |
+---------+------------------+----------+--------+--------+
5 rows in set (0.00 sec)

mysql> select * from users;
+---------+------------------+----------+--------+--------+
| name    | email            | password | gender | city   |
+---------+------------------+----------+--------+--------+
| Vishal  | vishal@gmail.com | v1       | male   | indore |
| Ravi    | Ravi@gmail.com   | R1       | male   | pune   |
| Komal   | Komal@gmail.com  | K1       | female | mumbai |
| Shivani | Shivani@gmail.com| S1       | female | Ujjain |
| Rajesh  | rajesh@gmail.com | R1       | male   | Dewas  |
+---------+------------------+----------+--------+--------+
5 rows in set (0.00 sec)
*/