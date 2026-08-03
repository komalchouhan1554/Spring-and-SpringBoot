package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainApp22 {

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
			
			PreparedStatement ps =  con.prepareStatement("insert into items values(?,?,?)");
			
			ps.setInt(1, 107);
			ps.setString(2, "Kurta");
			ps.setInt(3, 749);
			ps.addBatch();
			
			// Error here
			ps.setInt(1, 108);
			ps.setString(2, "Pajama");
			ps.setString(3, "aaa");
			ps.addBatch();
			
			ps.setInt(1, 109);
			ps.setString(2, "Jackat");
			ps.setInt(3, 1449);
			ps.addBatch();
			
			
			int []count = ps.executeBatch();
			
			for (int i : count) {
				
				System.out.println(i + ": Success");
			}
			
			
			con.close();
			ps.close();
			
		} 
		catch (Exception e) {
			// e.printStackTrace();
			System.out.println("FAIL");
		}
	}
}

// Output:-

/*
 
FAIL

 
mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | jeans     |       1499 |
|     102 | shirt     |        699 |
|     103 | top       |        799 |
|     104 | Hanky     |         49 |
|     105 | Cap       |        249 |
|     106 | Tshirt    |        449 |
+---------+-----------+------------+
6 rows in set (0.00 sec)


mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | jeans     |       1499 |
|     102 | shirt     |        699 |
|     103 | top       |        799 |
|     104 | Hanky     |         49 |
|     105 | Cap       |        249 |
|     106 | Tshirt    |        449 |
|     107 | Kurta     |        749 |
|     109 | Jackat    |       1449 |
+---------+-----------+------------+
8 rows in set (0.00 sec)


*/
