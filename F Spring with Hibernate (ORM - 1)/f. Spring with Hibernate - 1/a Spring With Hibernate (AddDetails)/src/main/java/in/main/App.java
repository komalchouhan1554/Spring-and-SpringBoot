package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.Student;
import in.dao.StudentDao;

// Creating table and adding details:

public class App {
    @SuppressWarnings("resource")
	public static void main(String[] args)
    {
    		Student std = new Student();
    		std.setStdid(2);
    		std.setName("Vishal");
    		std.setRollno(301);
    		std.setCity("Indore");
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("in/resources/applicationContext.xml");
        StudentDao stdDao = (StudentDao) context.getBean("stdDaoImplBean");
        
        stdDao.addStdDetails(std);
    }
}


// Output:-

/*

Jun 06, 2026 5:17:57 PM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 5.6.15.Final
Jun 06, 2026 5:17:58 PM org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
INFO: HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
Jun 06, 2026 5:17:59 PM org.hibernate.dialect.Dialect <init>
INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
Hibernate: 
    
    create table std_ragister (
       std_id integer not null auto_increment,
        std_name varchar(255),
        std_roll integer,
        std_city varchar(255),
        primary key (std_id)
    ) engine=InnoDB
Jun 06, 2026 5:18:00 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
Hibernate: 
    insert 
    into
        std_ragister
        (std_name, std_roll, std_city) 
    values
        (?, ?, ?)
Studet details added Successfully...


---> Before <---

mysql> select * from student;
+--------+----------+----------+----------+
| std_id | std_name | std_roll | std_city |
+--------+----------+----------+----------+
|      1 | Vishal   |      301 | Indore   |
+--------+----------+----------+----------+
1 row in set (0.00 sec)

---> After <---

mysql> select * from student;
+--------+----------+----------+----------+
| std_id | std_name | std_roll | std_city |
+--------+----------+----------+----------+
|      1 | Vishal   |      301 | Indore   |
|      2 | Komal    |      302 | Ujjain   |
+--------+----------+----------+----------+
2 rows in set (0.00 sec)

*/
