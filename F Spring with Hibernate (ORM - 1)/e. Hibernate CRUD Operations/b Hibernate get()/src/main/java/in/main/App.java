package in.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.beans.Employee;

public class App 
{
    public static void main( String[] args )
    {
 
        Configuration config = new Configuration();
        config.configure("/in/resources/hibernate.cfg.xml");
        
        SessionFactory sf = config.buildSessionFactory();
        
        Session s = sf.openSession();
        
        try 
        {
			Employee emp = s.get(Employee.class, 101);
			
			System.out.println("Employee ID: "+ emp.getEmpId());
			System.out.println("Employee Name: "+ emp.getEmpName());
			System.out.println("Employee Dept: "+ emp.getEmpDept());
			System.out.println("Employee City: "+ emp.getEmpCity());
			System.out.println("---------------------------------");
			
			Employee emp1 = (Employee)s.get("in.beans.Employee", 102);
			
			System.out.println("Employee ID: "+ emp1.getEmpId());
			System.out.println("Employee Name: "+ emp1.getEmpName());
			System.out.println("Employee Dept: "+ emp1.getEmpDept());
			System.out.println("Employee City: "+ emp1.getEmpCity());
			
		} 
        catch (Exception e) 
        {
			System.out.println("Fail !!!");
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
    select
        employee0_.emp_id as emp_id1_0_0_,
        employee0_.emp_city as emp_city2_0_0_,
        employee0_.emp_dept as emp_dept3_0_0_,
        employee0_.emp_name as emp_name4_0_0_ 
    from
        emp_ragister employee0_ 
    where
        employee0_.emp_id=?
        
Employee ID: 101
Employee Name: Vishal
Employee Dept: Java Developer
Employee City: Indore
---------------------------------
Employee ID: 102
Employee Name: Komal
Employee Dept: Java Developer
Employee City: Ujjain

*/
