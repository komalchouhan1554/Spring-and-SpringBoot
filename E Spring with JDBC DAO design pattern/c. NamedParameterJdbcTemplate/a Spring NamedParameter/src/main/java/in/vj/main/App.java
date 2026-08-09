package in.vj.main;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.vj.resources.SpringConfigFile;

public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {

		Map<String,Object> map = new HashMap<String, Object>();
		map.put("item_id", 801);
		map.put("item_name", "shirt");
		map.put("item_price", 1199);
    	
	    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
	    	NamedParameterJdbcTemplate temp = (NamedParameterJdbcTemplate)context.getBean("npjt");
	
	    	String sql_query="insert into items value(:item_id,:item_name, :item_price)";
	    	int count=temp.update(sql_query,map);
	    	
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
|     103 | t-shirt   |        599 |
|     105 | Cap       |        249 |
+---------+-----------+------------+
3 rows in set (0.03 sec)

---> After <---

mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | jeans     |        899 |
|     103 | t-shirt   |        599 |
|     105 | Cap       |        249 |
|     801 | shirt     |       1199 |
+---------+-----------+------------+
4 rows in set (0.00 sec)


*/
