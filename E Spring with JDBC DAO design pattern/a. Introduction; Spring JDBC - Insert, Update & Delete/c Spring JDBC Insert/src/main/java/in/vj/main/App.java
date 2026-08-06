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

		int item_id=103;
		String item_name="t-shirt";
		int item_price=399;
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	JdbcTemplate temp =  (JdbcTemplate) context.getBean("jdbcTempBean");
    	//  ------> Way 1 <------
    	/*
    	 
   		String sql_query="insert into items values('"+item_id+"','"+item_name+"','"+item_price+"')";
    	int count=temp.update(sql_query);
    	
    	 */
    	
     //  ------> Way 2 <------
    	/*
    	String sql_query="insert into items value(?,?,?)";
    	int count=temp.update(sql_query, item_id,item_name,item_price);
    	
    	*/
    	
    	//  ------> Way 3 <------
    	String sql_query="insert into items value(?,?,?)";
    	int count=temp.update(sql_query, new Object[]{item_id,item_name,item_price});
    	
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

//Output:-

/*

Success

--> Before <---

mysql> select * from items;
Empty set, 0 rows in set (0.00 sec)

---> After <---

mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | jeans     |        899 |
+---------+-----------+------------+
3 rows in set (0.00 sec)

*/
