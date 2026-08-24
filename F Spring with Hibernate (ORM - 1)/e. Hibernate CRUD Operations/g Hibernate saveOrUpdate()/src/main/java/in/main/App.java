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
        		Employee emp = new Employee();
        		emp.setEmpId(108);
        		emp.setEmpName("Chetan");
        		emp.setEmpDept("MERN");
        		emp.setEmpCity("Dewas");
        		
			session.saveOrUpdate(emp); // This method will save the data in database
			
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
        employee_.emp_id,
        employee_.emp_city as emp_city2_0_,
        employee_.emp_dept as emp_dept3_0_,
        employee_.emp_name as emp_name4_0_ 
    from
        emp_ragister employee_ 
    where
        employee_.emp_id=?
        
Data Updated Succesfully ...

Hibernate: 
    insert 
    into
        emp_ragister
        (emp_city, emp_dept, emp_name, emp_id) 
    values
        (?, ?, ?, ?)

---> Before <---

+--------+-----------+-----------------------+----------+
| emp_id | emp_city  | emp_dept              | emp_name |
+--------+-----------+-----------------------+----------+
|    101 | Indore    | Java Developer        | Vishal   |
|    102 | Noida     | Spring-Boot Developer | Komal    |
|    103 | Hydarabad | NULL                  | NULL     |
|    104 | Pune      | Tester                | Neeraj   |
+--------+-----------+-----------------------+----------+
4 rows in set (0.00 sec)

---> After <---

mysql> select * from emp_ragister;
+--------+-----------+-----------------------+----------+
| emp_id | emp_city  | emp_dept              | emp_name |
+--------+-----------+-----------------------+----------+
|    101 | Indore    | Java Developer        | Vishal   |
|    102 | Noida     | Spring-Boot Developer | Komal    |
|    103 | Hydarabad | NULL                  | NULL     |
|    104 | Pune      | Tester                | Neeraj   |
|    108 | Dewas     | MERN                  | Chetan   |
+--------+-----------+-----------------------+----------+
5 rows in set (0.00 sec)

*/
