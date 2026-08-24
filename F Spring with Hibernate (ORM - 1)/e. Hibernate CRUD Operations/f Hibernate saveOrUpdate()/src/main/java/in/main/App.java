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
        Configuration config = new Configuration();
        config.configure("/in/resources/hibernate.cfg.xml");
        
        SessionFactory sf = config.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction trans = session.beginTransaction();
        
        try 
        {
        		Employee emp = session.get(Employee.class, 102);
        		emp.setEmpDept("Spring-Boot Developer");
        		
			session.saveOrUpdate(emp);
			
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
 
Hibernate: 
    select
        employee0_.emp_id as emp_id1_0_0_,
        employee0_.emp_city as emp_city2_0_0_,
        employee0_.emp_dept as emp_dept3_0_0_,
        employee0_.emp_name as emp_name4_0_0_ 
    from
        emp_ragister employee0_ 
    where
        employee0_.emp_id=?
        
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
+--------+-----------+----------------+----------+
| emp_id | emp_city  | emp_dept       | emp_name |
+--------+-----------+----------------+----------+
|    101 | Indore    | Java Developer | Vishal   |
|    102 | Noida     | Java Developer | Komal    |
|    103 | Hydarabad | NULL           | NULL     |
|    104 | Pune      | Tester         | Neeraj   |
+--------+-----------+----------------+----------+
4 rows in set (0.00 sec)

---> After <---

+--------+-----------+-----------------------+----------+
| emp_id | emp_city  | emp_dept              | emp_name |
+--------+-----------+-----------------------+----------+
|    101 | Indore    | Java Developer        | Vishal   |
|    102 | Noida     | Spring-Boot Developer | Komal    |
|    103 | Hydarabad | NULL                  | NULL     |
|    104 | Pune      | Tester                | Neeraj   |
+--------+-----------+-----------------------+----------+
4 rows in set (0.00 sec)

*/
