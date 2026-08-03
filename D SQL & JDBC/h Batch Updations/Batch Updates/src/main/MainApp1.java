package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainApp1 {

	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_app", "root", "root");
			
			Statement st =  con.createStatement();
			
			st.addBatch("insert into items values(101,'jeans',1499)");
			st.addBatch("insert into items values(102,'shirt',699)");
			st.addBatch("insert into items values(103,'top',799)");
			
			int []count = st.executeBatch();
			
			for (int i : count) {
				
				System.out.println(i + ": Success");
			}
			
			
			con.close();
			st.close();
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
Empty set (0.02 sec)

mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | jeans     |       1499 |
|     102 | shirt     |        699 |
|     103 | top       |        799 |
+---------+-----------+------------+
3 rows in set (0.00 sec)
 
 
*/
