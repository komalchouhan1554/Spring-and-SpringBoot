package in.vj.main;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import in.vj.beans.Items;
import in.vj.resources.SpringConfigFile;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {

    		Items item1 = new Items();
    		item1.setItemId(201);
    		item1.setItemName("Coat");
    		item1.setItemPrice(3599);
    		
    		Items item2 = new Items();
    		item2.setItemId(202);
    		item2.setItemName("Pant");
    		item2.setItemPrice(1299);
    		
    		Items item3 = new Items();
    		item3.setItemId(203);
    		item3.setItemName("Cap");
    		item3.setItemPrice(249);
    		
    		final List<Items> item_list = new ArrayList<Items>();
    		item_list.add(item1);
    		item_list.add(item2);
    		item_list.add(item3);
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        
        
        String query = "insert into items values(?,?,?)";
        int[] count = jdbcTemplate.batchUpdate(query, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException // Callback method
			{
				Items it = item_list.get(index);
				
				ps.setInt(1, it.getItemId());
				ps.setString(2, it.getItemName());
				ps.setInt(3, it.getItemPrice());
				
			}
			
			@Override
			public int getBatchSize() 
			{
				return item_list.size();
			}
		});
        
        for (int i : count) {
			System.out.println(i+" : Success");
		}
       
    }
}

// Output:-

/*
 
1 : Success
1 : Success
1 : Success


-----> Before <-----

mysql> select * from items;
+---------+-----------+------------+
| item_id | item_name | item_price |
+---------+-----------+------------+
|     101 | Shirt     |        699 |
|     102 | T-Shirt   |        349 |
|     103 | Jeans     |        999 |
+---------+-----------+------------+
3 rows in set (0.00 sec)


-----> After <-----

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
6 rows in set (0.00 sec)

*/
