package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.beans.Student;
import in.resources.SpringConfigFile;
import in.service.StudentService;
import in.service.StudentServiceImpl;


// This program is for static values
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        Student std = context.getBean(Student.class);
        
        StudentService stdService = (StudentService) context.getBean(StudentServiceImpl.class);
        
        boolean status = stdService.addStdDetailsService(std);
        
        if(status)
        {
        	    System.out.println("Success");
        }
        else
        {
        		System.out.println("Fail");
        }
        
    }
}

// Output:-

/*

Success

---> Before <---

mysql> select * from register;
Empty set (0.03 sec)

---> After <---

mysql> select * from register;
+--------+------------------+----------+--------+--------+
| name   | email            | password | gender | city   |
+--------+------------------+----------+--------+--------+
| Vishal | vishal@gmail.com | 12345    | Male   | Indore |
+--------+------------------+----------+--------+--------+
1 row in set (0.00 sec)

*/
