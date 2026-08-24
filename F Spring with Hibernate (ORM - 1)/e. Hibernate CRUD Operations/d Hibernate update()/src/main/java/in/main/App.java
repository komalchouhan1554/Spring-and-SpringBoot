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
    		// Not Correct way, it will set null values to other columns.
    		Employee emp = new Employee();
    		emp.setEmpId(103);
    		emp.setEmpCity("Hydarabad");
    	
    		
        Configuration config = new Configuration();
        config.configure("/in/resources/hibernate.cfg.xml");
        
        SessionFactory sf = config.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction trans = session.beginTransaction();
        
        try 
        {
			session.update(emp);
			System.out.println("Data Updated Succesfully ...");
			trans.commit();
		} 
        catch (Exception e) 
        {
			System.out.println("Fail !!!");
			trans.rollback();
			e.printStackTrace();
		}
        finally{
        		session.close();
        		sf.close();
        }
    }
}

// Output:-

/*
 
Data Updated Succesfully ...
Hibernate: 
    update
        emp_ragister 
    set
        emp_city=?,
        emp_dept=?,
        emp_name=? 
    where
        emp_id=?

---> Before <---

mysql> select * from emp_ragister;
+--------+----------+----------------+----------+
| emp_id | emp_city | emp_dept       | emp_name |
+--------+----------+----------------+----------+
|    101 | Indore   | Java Developer | Vishal   |
|    102 | Ujjain   | Java Developer | Komal    |
|    103 | Indore   | Python Dev     | Ashok    |
|    104 | Pune     | Tester         | Neeraj   |
+--------+----------+----------------+----------+
4 rows in set (0.00 sec)

---> After <---

mysql> select * from emp_ragister;
+--------+-----------+----------------+----------+
| emp_id | emp_city  | emp_dept       | emp_name |
+--------+-----------+----------------+----------+
|    101 | Indore    | Java Developer | Vishal   |
|    102 | Ujjain    | Java Developer | Komal    |
|    103 | Hydarabad | NULL           | NULL     |
|    104 | Pune      | Tester         | Neeraj   |
+--------+-----------+----------------+----------+
4 rows in set (0.00 sec)

*/
