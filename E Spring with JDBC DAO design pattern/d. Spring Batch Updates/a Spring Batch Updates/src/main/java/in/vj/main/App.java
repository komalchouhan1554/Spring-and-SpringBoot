package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import in.vj.resources.SpringConfigFile;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        
        
        // ---------------------  1 -----------------------------------
        /*
        String query1 = "insert into items values(101,'Shirt',699)";
        String query2 = "insert into items values(102,'T-Shirt',349)";
        String query3 = "insert into items values(103,'Jeans',999)";
        
        int[] count =  jdbcTemplate.batchUpdate(query1, query2, query3);
        
        for (int i : count) 
        {
			System.out.println(i + " Success");
		}
		*/
        
     // --------------------- 2 -----------------------------------
        String query1 = "insert into items values(101,'Shirt',699)";
        String query2 = "insert into items values(102,'T-Shirt',349)";
        String query3 = "insert into items values(103,'Jeans',999)";
        
        String[] queries = {query1, query2, query3};
        
        int[] count =  jdbcTemplate.batchUpdate(queries);
        
        for (int i : count) 
        {
			System.out.println(i + " Success");
		}
    }
}

// Output:-

/*
 
1 Success
1 Success
1 Success
 
-----> Before <-----

mysql> select * from items;
Empty set (0.00 sec)

-----> After <-----

mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | Shirt     |        699 |
|     102 | T-Shirt   |        349 |
|     103 | Jeans     |        999 |
+---------+-----------+------------+
3 rows in set (0.00 sec)

*/
