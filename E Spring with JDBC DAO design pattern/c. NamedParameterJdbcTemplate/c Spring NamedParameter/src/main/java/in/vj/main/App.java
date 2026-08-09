package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import in.vj.beans.Items;
import in.vj.resources.SpringConfigFile;

public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args )
    {
		Items it = new Items();
		it.setItemId(301);
		it.setItemName("Coat");
		it.setItemPrice(4499);
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(it);

    	
	    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
	    	NamedParameterJdbcTemplate temp = (NamedParameterJdbcTemplate)context.getBean("npjt");
	
	    	String sql_query="insert into items value(:itemId,:itemName, :itemPrice)";
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
|     406 | Trouser   |        799 |
+---------+-----------+------------+
5 rows in set (0.00 sec)

---> After <---

+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | jeans     |        899 |
|     103 | t-shirt   |        599 |
|     105 | Cap       |        249 |
|     801 | shirt     |       1199 |
|     406 | Trouser   |        799 |
|     301 | Coat      |       4499 |
+---------+-----------+------------+
7 rows in set (0.00 sec)

*/
