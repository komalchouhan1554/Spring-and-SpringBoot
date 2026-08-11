package in.vj.main;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vj.resources.SpringConfigFile;

public class App 
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
        
        con1.close();
        con2.close();
        
        Connection con6 = dataSource.getConnection();
        Connection con7 = dataSource.getConnection();
        
        System.out.println("Success");
    }
}


// Output:-

/*

SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
Success

*/