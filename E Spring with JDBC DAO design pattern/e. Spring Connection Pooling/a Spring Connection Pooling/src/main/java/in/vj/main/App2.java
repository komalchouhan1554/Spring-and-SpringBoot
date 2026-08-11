package in.vj.main;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vj.resources.SpringConfigFile;

public class App2 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) throws Exception
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class); 
        DataSource dataSource =  context.getBean(DataSource.class);
        
        Connection con1 = dataSource.getConnection();  
        Connection con2 = dataSource.getConnection();
        Connection con3 = dataSource.getConnection();
        Connection con4 = dataSource.getConnection();
        Connection con5 = dataSource.getConnection();
        
        Connection con6 = dataSource.getConnection();
        Connection con7 = dataSource.getConnection();
        
        System.out.println("Success");
    }
}


// Output:-

/*

Error Because we set the maximum size is 5 and we are getting 7 connection object from the connection pool.

SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
Exception in thread "main" java.sql.SQLTransientConnectionException: HikariPool-1 - Connection is not available, request timed out after 30001ms (total=5, active=5, idle=0, waiting=0)
	at com.zaxxer.hikari.pool.HikariPool.createTimeoutException(HikariPool.java:714)
	at com.zaxxer.hikari.pool.HikariPool.getConnection(HikariPool.java:184)
	at com.zaxxer.hikari.pool.HikariPool.getConnection(HikariPool.java:142)
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:99)
	at in.vj.main.App.main(App.java:26)

*/