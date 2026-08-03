package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainApp2 {

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
			
			PreparedStatement ps =  con.prepareStatement("insert into items values(?,?,?)");
			
			ps.setInt(1, 104);
			ps.setString(2, "Hanky");
			ps.setInt(3, 49);
			ps.addBatch();
			
			ps.setInt(1, 105);
			ps.setString(2, "Cap");
			ps.setInt(3, 249);
			ps.addBatch();
			
			ps.setInt(1, 106);
			ps.setString(2, "Tshirt");
			ps.setInt(3, 449);
			ps.addBatch();
			
			
			int []count = ps.executeBatch();
			
			for (int i : count) {
				
				System.out.println(i + ": Success");
			}
			
			
			con.close();
			ps.close();
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

// Output:-

/*
 
1: Success
1: Success
1: Success

 
mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | jeans     |       1499 |
|     102 | shirt     |        699 |
|     103 | top       |        799 |
+---------+-----------+------------+
3 rows in set (0.00 sec)
 
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

*/
