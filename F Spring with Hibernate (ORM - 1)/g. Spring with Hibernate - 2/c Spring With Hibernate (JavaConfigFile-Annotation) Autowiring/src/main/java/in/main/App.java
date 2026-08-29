package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.beans.Student;
import in.dao.StudentDao;
import in.resources.SpringConfigFile;

// Adding details:

public class App {
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
    		Student std = new Student();
    		std.setStdid(6);
    		std.setName("Shubham");
    		std.setRollno(306);
    		std.setCity("Noida");
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        StudentDao stdDao = (StudentDao) context.getBean("stdDaoImplBean");
        
        stdDao.addStdDetails(std);
        
        // stdDao.searchStdDetails(1);
    }
}


// Output:-

/*

Jun 07, 2026 10:42:25 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 5.6.15.Final
Jun 07, 2026 10:42:26 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
Jun 07, 2026 10:42:27 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
Jun 07, 2026 10:42:27 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Studet details added Successfully...
Hibernate: 
    insert 
    into
        std_ragister
        (std_city, std_name, std_roll, std_id) 
    values
        (?, ?, ?, ?)
        
---> Before <---

mysql> select * from std_ragister;
+--------+----------+----------+----------+
| std_id | std_name | std_roll | std_city |
+--------+----------+----------+----------+
|      1 | Komal    |      302 | Ujjain   |
|      3 | Prafull  |      303 | Delhi    |
|      4 | Vishal   |      301 | Indore   |
|      5 | Amit     |      305 | Hydrabad |
+--------+----------+----------+----------+
4 rows in set (0.00 sec)

---> After <---
 
mysql> select * from std_ragister;
+--------+----------+----------+----------+
| std_id | std_name | std_roll | std_city |
+--------+----------+----------+----------+
|      1 | Komal    |      302 | Ujjain   |
|      3 | Prafull  |      303 | Delhi    |
|      4 | Vishal   |      301 | Indore   |
|      5 | Amit     |      305 | Hydrabad |
|      6 | Shubham  |      306 | Noida    |
+--------+----------+----------+----------+
5 rows in set (0.00 sec)

*/
