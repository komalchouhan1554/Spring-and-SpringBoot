package in.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        Student std = new Student();
        std.setName("Vishal");
        std.setStdId(1);
        std.setRoll(101);
        std.setEmail("vishal@gamil.com");
        std.setGender("male");
        std.setCity("Indore");
        
        
        //-----------------------------------
        
        
        Configuration configuration = new Configuration();
        configuration.configure("/in/resources/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
       
        Transaction trans = session.beginTransaction();
        
        try
        {
        	session.save(std);
        	System.out.println("Success 👍👍👍");
        	
        	trans.commit();
		} 
        catch (Exception e) 
        {
			System.out.println("Fail ⚔️⚔️⚔️");
			trans.rollback();
			
			e.printStackTrace();
		}
        finally 
        {
			session.close();
			sessionFactory.close();
		}
    }
}


// Output:-


/*
 
Success 👍👍👍

---> Before <---

mysql> show tables;
Empty set (0.01 sec)


---> After <---

mysql> show tables;
+------------------------+
| Tables_in_hibernate_db |
+------------------------+
| std_register           |
+------------------------+
1 row in set (0.00 sec)

mysql> desc std_register;
+------------+--------------+------+-----+---------+-------+
| Field      | Type         | Null | Key | Default | Extra |
+------------+--------------+------+-----+---------+-------+
| std_id     | int          | NO   | PRI | NULL    |       |
| std_name   | varchar(255) | YES  |     | NULL    |       |
| std_roll   | int          | YES  |     | NULL    |       |
| std_email  | varchar(255) | YES  |     | NULL    |       |
| std_gender | varchar(255) | YES  |     | NULL    |       |
| std_city   | varchar(255) | YES  |     | NULL    |       |
+------------+--------------+------+-----+---------+-------+
6 rows in set (0.01 sec)

mysql> select * from std_register;
+--------+----------+----------+------------------+------------+----------+
| std_id | std_name | std_roll | std_email        | std_gender | std_city |
+--------+----------+----------+------------------+------------+----------+
|      1 | Vishal   |      101 | vishal@gamil.com | male       | Indore   |
+--------+----------+----------+------------------+------------+----------+
1 row in set (0.00 sec)
 
*/
