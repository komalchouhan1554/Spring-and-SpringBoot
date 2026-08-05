package demo1;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class MainApp1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/shopping_app");
		config.setUsername("root");
		config.setPassword("root");
		config.setMaximumPoolSize(10);
		
		HikariDataSource dataSource = new HikariDataSource(config);
		
		try (
				Connection con = dataSource.getConnection();
				PreparedStatement ps = con.prepareStatement("insert into items values (?,?,?)");
				
			)
		{
			ps.setInt(1, 502);
			ps.setString(2, "Shirt");
			ps.setInt(3, 999);
			
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

//Output:-

/*

SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
The data inserted Successfully

mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     501 | Trouser   |        799 |
+---------+-----------+------------+
1 row in set (0.00 sec)


mysql> select  * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     501 | Trouser   |        799 |
|     502 | Shirt     |        999 |
+---------+-----------+------------+
2 rows in set (0.00 sec)

*/
