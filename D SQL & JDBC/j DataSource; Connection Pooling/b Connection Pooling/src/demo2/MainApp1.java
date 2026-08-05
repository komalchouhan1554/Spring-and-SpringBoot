package demo2;

import java.lang.management.ManagementFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.management.AttributeNotFoundException;
import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import javax.management.ReflectionException;

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
			
			//register HikariCP pool as an MBean
			MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
			ObjectName poolObjectName = new ObjectName("com.zaxxer.hikari:type=Pool("+dataSource.getPoolName()+")");
			mBeanServer.registerMBean(dataSource.getHikariPoolMXBean(), poolObjectName);
			
			// Access the pool statistics using JMX Attributes
			int activeConnection = (int) mBeanServer.getAttribute(poolObjectName, "ActiveConnections");
			int idleConnection = (int) mBeanServer.getAttribute(poolObjectName, "IdleConnections");
			int totalCon = activeConnection + idleConnection;
			
			System.out.println("Total Connection: " + totalCon);
			System.out.println("Active Connection: " + activeConnection);
			System.out.println("Idle Connection: " + idleConnection);
			
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
		catch (SQLException | NotCompliantMBeanException  | MalformedObjectNameException | InstanceAlreadyExistsException | MBeanException | AttributeNotFoundException | ReflectionException | InstanceNotFoundException e) 
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
Total Connection: 6
Active Connection: 1
Idle Connection: 5
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
