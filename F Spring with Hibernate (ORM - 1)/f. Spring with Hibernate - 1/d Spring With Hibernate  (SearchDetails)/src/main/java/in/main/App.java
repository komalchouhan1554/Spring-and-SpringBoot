package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.Student;
import in.dao.StudentDao;

// Retrieving/Searching details:

public class App {
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
    		Student std = new Student();
    		std.setStdid(1);
    		std.setName("Vishal");
    		std.setRollno(301);
    		std.setCity("Indore");
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("in/resources/applicationContext.xml");
        StudentDao stdDao = (StudentDao) context.getBean("stdDaoImplBean");
        
        // stdDao.addStdDetails(std);
        
        stdDao.searchStdDetails(1);
    }
}


// Output:-

/*

Jun 06, 2026 5:46:28 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 5.6.15.Final
Jun 06, 2026 5:46:30 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
Jun 06, 2026 5:46:31 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
Jun 06, 2026 5:46:31 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Hibernate: 
    select
        student0_.std_id as std_id1_0_0_,
        student0_.std_name as std_name2_0_0_,
        student0_.std_roll as std_roll3_0_0_,
        student0_.std_city as std_city4_0_0_ 
    from
        std_ragister student0_ 
    where
        student0_.std_id=?
        
Studet details retrive Successfully...

Name: Komal
Roll No: 302
City: Ujjain

*/
