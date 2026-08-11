package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import in.vj.resources.SpringConfigFile;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) throws Exception
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class); 
       
        JdbcTemplate jt = context.getBean(JdbcTemplate.class);
        
        String sql_query = "insert into items values(?,?,?)";
        Object[] param1 = {801,"Top",649};
        Object[] param2 = {802,"Hand-glubs",299};
        
        int count1 = jt.update(sql_query,param1);
        int count2 = jt.update(sql_query,param2);
        
        if(count1 > 0 && count2 > 0)
        {
        		System.out.println("Success");
        }
        else
        {
        		System.out.println("FAIL");
        }
    }
}


// Output:-

/*


SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
Success

mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | Shirt     |        699 |
|     102 | T-Shirt   |        349 |
|     103 | Jeans     |        999 |
|     201 | Coat      |       3599 |
|     202 | Pant      |       1299 |
|     203 | Cap       |        249 |
+---------+-----------+------------+
6 rows in set (0.01 sec)

mysql> select * from items;
+---------+------------+------------+
| item_id | item_name  | item_price |
+---------+------------+------------+
|     101 | Shirt      |        699 |
|     102 | T-Shirt    |        349 |
|     103 | Jeans      |        999 |
|     201 | Coat       |       3599 |
|     202 | Pant       |       1299 |
|     203 | Cap        |        249 |
|     801 | Top        |        649 |
|     802 | Hand-glubs |        299 |
+---------+------------+------------+
8 rows in set (0.00 sec)

*/