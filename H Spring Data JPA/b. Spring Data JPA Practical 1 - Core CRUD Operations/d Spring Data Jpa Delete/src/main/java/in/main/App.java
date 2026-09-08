package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// import in.entity.Student;
import in.resources.SpringConfigFile;
import in.service.StudentService;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	
    		/*
    		Student std = new Student();
    		
    		std.setId(1);
    		std.setName("Vishal J");
    		std.setRoll(101);
    		std.setMarks(98.5f);
    		
    		*/
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        StudentService stdService = (StudentService) context.getBean("studentService");
        
        // stdService.insertStdDetailsService(std);
        
        // stdService.updateStdDetailsService(3, 67.7f);
        
        stdService.deleteStdDetailsService(4);
    }
}

// Output:-

/*

---> Before <---

mysql> select * from std_details;
+--------+-----------+---------------+----------+
| std_id | std_marks | std_name      | std_roll |
+--------+-----------+---------------+----------+
|      1 |      98.5 | Vishal J      |      101 |
|      2 |      99.3 | Komal Chauhan |      102 |
|      3 |      67.7 | Abhishek Pal  |      104 |
|      4 |      78.7 | Ajay Pal      |      103 |
+--------+-----------+---------------+----------+
4 rows in set (0.00 sec)
 
---> After <---

Hibernate: select s1_0.std_id,s1_0.std_marks,s1_0.std_name,s1_0.std_roll from std_details s1_0 where s1_0.std_id=?
Hibernate: delete from std_details where std_id=?
Data Deleted Succesfully 🤖🤖🤖

mysql> select * from std_details;
+--------+-----------+---------------+----------+
| std_id | std_marks | std_name      | std_roll |
+--------+-----------+---------------+----------+
|      1 |      98.5 | Vishal J      |      101 |
|      2 |      99.3 | Komal Chauhan |      102 |
|      3 |      67.7 | Abhishek Pal  |      104 |
+--------+-----------+---------------+----------+
3 rows in set (0.00 sec)
 
*/
