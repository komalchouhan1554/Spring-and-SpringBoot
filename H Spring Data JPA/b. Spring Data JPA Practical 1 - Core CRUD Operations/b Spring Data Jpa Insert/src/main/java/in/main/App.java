package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.entity.Student;
import in.resources.SpringConfigFile;
import in.service.StudentService;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    		Student std = new Student();
    		
    		std.setId(2);
    		std.setName("Komal Chauhan");
    		std.setRoll(102);
    		std.setMarks(99.3f);
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        StudentService stdService = (StudentService) context.getBean("studentService");
        
        boolean status = stdService.insertStdDetailsService(std);
        
        if(status)
        {
        		System.out.println("Data Inserted Successfully 🫡🫡🫡");
        }
        else {
        		System.out.println("Data not Inserted !!!");
        }
    }
}

// Output:-

/*

---> Before <---

mysql> select * from std_details;
+--------+-----------+----------+----------+
| std_id | std_marks | std_name | std_roll |
+--------+-----------+----------+----------+
|      1 |      98.5 | Vishal J |      101 |
+--------+-----------+----------+----------+
1 row in set (0.00 sec)
 
---> After <---

Hibernate: select s1_0.std_id,s1_0.std_marks,s1_0.std_name,s1_0.std_roll from std_details s1_0 where s1_0.std_id=?
Hibernate: insert into std_details (std_marks,std_name,std_roll,std_id) values (?,?,?,?)
Data Inserted Successfully 🫡🫡🫡

mysql> select * from std_details;
+--------+-----------+---------------+----------+
| std_id | std_marks | std_name      | std_roll |
+--------+-----------+---------------+----------+
|      1 |      98.5 | Vishal J      |      101 |
|      2 |      99.3 | Komal Chauhan |      102 |
+--------+-----------+---------------+----------+
2 rows in set (0.00 sec)


 
*/
