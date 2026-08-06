package in.vj.main;

import java.sql.Connection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.vj.resources.SpringConfigFile;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	/*
    	Not Best way : Given configuration we can provide using XML or java configuration file
    	 
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
        datasource.setUsername("root");
        datasource.setPassword("root");
        
        JdbcTemplate temp = new JdbcTemplate();
        temp.setDataSource(datasource);
        
        */
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	JdbcTemplate temp =  (JdbcTemplate) context.getBean("jdbcTempBean");
    	
    	
        try {
        	Connection con = temp.getDataSource().getConnection();
        	
        	if(con != null)
        	{
        		System.out.println("Success");
        	}
        	else 
        	{
        		System.out.println("Fail");
        	}
			
		} 
        catch (Exception e) {
			e.printStackTrace();
		}
    }
}

// Output:-

/*
 
Success

*/
