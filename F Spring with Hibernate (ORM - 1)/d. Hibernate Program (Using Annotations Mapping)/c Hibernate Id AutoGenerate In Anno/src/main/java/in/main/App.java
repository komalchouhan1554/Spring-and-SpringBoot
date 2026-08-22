package in.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.beans.Employee;

public class App 
{
    public static void main( String[] args )
    {
    		Employee emp = new Employee();
    		// emp.setEmpId(101);
    		emp.setEmpName("Vishal");
    		emp.setEmpDept("Java Developer");
    		emp.setEmpCity("Indore");
    	
    		
        Configuration config = new Configuration();
        config.configure("/in/resources/hibernate.cfg.xml");
        
        SessionFactory sf = config.buildSessionFactory();
        
        Session s = sf.openSession();
        
        Transaction trans = s.beginTransaction();
        
        try 
        {
			s.save(emp);
			System.out.println("Data Inserted Succesfully ...");
			trans.commit();
		} 
        catch (Exception e) 
        {
			System.out.println("Fail !!!");
			trans.rollback();
			e.printStackTrace();
		}
        finally{
        		s.close();
        		sf.close();
        }
    }
}

// Output:-

/*
 
Hibernate: 
    insert 
    into
        emp_ragister
        (emp_city, emp_dept, emp_name) 
    values
        (?, ?, ?)
Data Inserted Succesfully ...

---> Before <---

mysql> show tables;
+------------------------+
| Tables_in_hibernate_db |
+------------------------+
| std_ragister           |
+------------------------+
1 row in set (0.01 sec)


---> After <---

mysql> show tables;
+------------------------+
| Tables_in_hibernate_db |
+------------------------+
| emp_ragister           |
| std_ragister           |
+------------------------+
2 rows in set (0.02 sec)

mysql> desc emp_ragister;
+----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| emp_id   | int          | NO   | PRI | NULL    | auto_increment |
| emp_city | varchar(255) | YES  |     | NULL    |                |
| emp_dept | varchar(255) | YES  |     | NULL    |                |
| emp_name | varchar(255) | YES  |     | NULL    |                |
+----------+--------------+------+-----+---------+----------------+
4 rows in set (0.00 sec)

mysql> select * from emp_ragister;
+--------+----------+----------------+----------+
| emp_id | emp_city | emp_ dept      | emp_name |
+--------+----------+----------------+----------+
|    1   | Indore   | Java Developer | Vishal   |
+--------+----------+----------------+----------+
1 row in set (0.01 sec)


---------> On 2nd Time Run <--------

mysql> select * from emp_ragister;
+--------+----------+----------------+----------+
| emp_id | emp_city | emp_ dept      | emp_name |
+--------+----------+----------------+----------+
|    1   | Indore   | Java Developer | Vishal   |
|    2   | Indore   | Java Developer | Vishal   |
+--------+----------+----------------+----------+
1 row in set (0.01 sec)

*/
