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

		int item_id=102;
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	JdbcTemplate temp =  (JdbcTemplate) context.getBean("jdbcTempBean");

    	String sql_query="DELETE from items WHERE item_id = ?";
    	int count=temp.update(sql_query,item_id);
    	
    	if(count>0)
    	{
    		System.out.println("success");
    	}
    	else
    	{
    		System.out.println("fail");
    	}
    	
    	
    }
}

// Output:-

/*
 
Success

---> Before <---

mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | jeans     |        899 |
|     102 | shirt     |        499 |
|     103 | t-shirt   |        599 |
+---------+-----------+------------+
3 rows in set (0.00 sec)

---> After <---

mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | jeans     |        899 |
|     103 | t-shirt   |        599 |
+---------+-----------+------------+
2 rows in set (0.00 sec)


*/
