package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.Student;
import in.dao.StudentDao;

// Updating details:

public class App {
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
    		Student std = new Student();
    		std.setStdid(2);
    		std.setName("Vishal");
    		std.setRollno(303);
    		std.setCity("Banglore");
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("in/resources/applicationContext.xml");
        StudentDao stdDao = (StudentDao) context.getBean("stdDaoImplBean");
        
//      stdDao.addStdDetails(std);
        
        stdDao.updateDeatils(std);
    }
}


// Output:-

/*

Jun 06, 2026 5:37:27 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 5.6.15.Final
Jun 06, 2026 5:37:28 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
Jun 06, 2026 5:37:29 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
Jun 06, 2026 5:37:30 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Studet details updated Successfully...
Hibernate: 
    update
        std_ragister 
    set
        std_name=?,
        std_roll=?,
        std_city=? 
    where
        std_id=?


---> Before <---

mysql> select * from student;
+--------+----------+----------+----------+
| std_id | std_name | std_roll | std_city |
+--------+----------+----------+----------+
|      1 | Vishal   |      301 | Indore   |
|      2 | Komal    |      302 | Ujjain   |
+--------+----------+----------+----------+
2 rows in set (0.00 sec)

---> After <---

mysql> select * from std_ragister;
+--------+----------+----------+----------+
| std_id | std_name | std_roll | std_city |
+--------+----------+----------+----------+
|      1 | Komal    |      302 | Ujjain   |
|      2 | Vishal   |      303 | Banglore |
+--------+----------+----------+----------+
2 rows in set (0.00 sec)

*/
