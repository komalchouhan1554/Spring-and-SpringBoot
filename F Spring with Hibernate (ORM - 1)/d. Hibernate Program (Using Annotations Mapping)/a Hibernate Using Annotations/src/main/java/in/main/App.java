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
    		emp.setEmpId(101);
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
    
    create table emp_ragister (
       emp_id integer not null,
        emp_city varchar(255),
        emp_ddept varchar(255),
        emp_name varchar(255),
        primary key (emp_id)
    ) engine=InnoDB
May 19, 2026 11:21:29 AM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]

Data Inserted Succesfully ...
Hibernate: 
    insert 
    into
        emp_ragister
        (emp_city, emp_ddept, emp_name, emp_id) 
    values
        (?, ?, ?, ?)

---> Before <---

mysql> show tables;
+------------------------+
| Tables_in_hibernate_db |
+------------------------+
| std_register           |
+------------------------+
1 row in set (0.01 sec)


---> After <---

mysql> show tables;
+------------------------+
| Tables_in_hibernate_db |
+------------------------+
| emp_ragister           |
| std_register           |
+------------------------+
2 rows in set (0.02 sec)

mysql> desc emp_ragister;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| emp_id    | int          | NO   | PRI | NULL    |       |
| emp_city  | varchar(255) | YES  |     | NULL    |       |
| emp_ddept | varchar(255) | YES  |     | NULL    |       |
| emp_name  | varchar(255) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
4 rows in set (0.01 sec)

mysql> select * from emp_ragister;
+--------+----------+----------------+----------+
| emp_id | emp_city | emp_ddept      | emp_name |
+--------+----------+----------------+----------+
|    101 | Indore   | Java Developer | Vishal   |
+--------+----------+----------------+----------+
1 row in set (0.01 sec)

*/
