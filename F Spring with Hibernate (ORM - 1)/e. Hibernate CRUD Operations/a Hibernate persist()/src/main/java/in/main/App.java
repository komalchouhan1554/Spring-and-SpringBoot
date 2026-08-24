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
    		emp.setEmpId(102);
    		emp.setEmpName("Komal");
    		emp.setEmpDept("Java Developer");
    		emp.setEmpCity("Ujjain");
    	
    		
        Configuration config = new Configuration();
        config.configure("/in/resources/hibernate.cfg.xml");
        
        SessionFactory sf = config.buildSessionFactory();
        
        Session s = sf.openSession();
        
        Transaction trans = s.beginTransaction();
        
        try 
        {
			 // int id = (int) s.save(emp); // It returns the primary key.
			 // System.out.println("ID : "+ id);
			
			s.persist(emp); // Return type is void
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
 
ID : 102
Data Inserted Succesfully ...
Hibernate: 
    insert 
    into
        emp_ragister
        (emp_city, emp_dept, emp_name, emp_id) 
    values
        (?, ?, ?, ?)

---> Before <---

mysql> show tables;
Empty set (0.00 sec)


---> After <---


mysql> show tables;
+------------------------+
| Tables_in_hibernate_db |
+------------------------+
| emp_ragister           |
+------------------------+
1 row in set (0.00 sec)

mysql> select * from emp_ragister;
+--------+----------+----------------+----------+
| emp_id | emp_city | emp_dept       | emp_name |
+--------+----------+----------------+----------+
|    101 | Indore   | Java Developer | Vishal   |
|    102 | Ujjain   | Java Developer | Komal    |
+--------+----------+----------------+----------+
2 rows in set (0.00 sec)

*/
