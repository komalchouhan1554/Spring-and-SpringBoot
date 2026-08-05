package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.MysqlDataSource;

public class MainApp1 {

	public static void main(String[] args) 
	{
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/shopping_app");
		dataSource.setUser("root");
		dataSource.setPassword("root");
	
		try (
				Connection con = dataSource.getConnection();
				PreparedStatement ps = con.prepareStatement("insert into items values (?,?,?)");
			)
		{
			ps.setInt(1, 501);
			ps.setString(2, "Trouser");
			ps.setInt(3, 799);
			
			int count = ps.executeUpdate();
			
			if(count > 0)
			{
				System.out.println("The data inserted Successfully");
			}
			else {
				System.out.println("Failed !!!");
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}

// Output:-

/*
 
The data inserted Successfully

mysql> select * from items;
Empty set (0.01 sec)

mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     501 | Trouser   |        799 |
+---------+-----------+------------+
1 row in set (0.00 sec)
 
*/
