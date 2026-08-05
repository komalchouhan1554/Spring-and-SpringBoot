package demo2;

import java.lang.management.ManagementFactory;
import java.sql.Connection;
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

public class MainApp3 {

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
				Connection con1 = dataSource.getConnection();
				Connection con2 = dataSource.getConnection();
				Connection con3 = dataSource.getConnection();
				Connection con4 = dataSource.getConnection();
				Connection con5 = dataSource.getConnection();
				Connection con6 = dataSource.getConnection();
				Connection con7 = dataSource.getConnection();
				Connection con8 = dataSource.getConnection();
				Connection con9 = dataSource.getConnection();
				Connection con10 = dataSource.getConnection();
				//Connection con11 = dataSource.getConnection();
				
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
Total Connection: 10
Active Connection: 10
Idle Connection: 0

*/
