package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.vj.resources.SpringConfigFile;

public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {
//		MapSqlParameterSource param = new MapSqlParameterSource();
//		param.addValue("item_id", 406);
//		param.addValue("item_name", "Trouser");
//		param.addValue("item_price", 799);
		
		// Using Method chaining
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("item_id", 406)
					.addValue("item_name", "Trouser")
					.addValue("item_price", 799);

    	
	    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
	    	NamedParameterJdbcTemplate temp = (NamedParameterJdbcTemplate)context.getBean("npjt");
	
	    	String sql_query="insert into items value(:item_id,:item_name, :item_price)";
	    	int count=temp.update(sql_query,param);
	    	
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
|     801 | shirt     |       1199 |
+---------+-----------+------------+
4 rows in set (0.00 sec)

---> After <---

mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | jeans     |        899 |
|     103 | t-shirt   |        599 |
|     105 | Cap       |        249 |
|     801 | shirt     |       1199 |
|     406 | Trouser   |        799 |
+---------+-----------+------------+
5 rows in set (0.00 sec)

*/
