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
    	
    		Student std = new Student();
    		std.setName("Prashant");
    		std.setEmail("Pra@gamil.com");
    		std.setPassword("PPP");
    		std.setGender("Male");
    		std.setCity("Agra");
    		
    		
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
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
+--------+------------------+----------+--------+--------+
| name   | email            | password | gender | city   |
+--------+------------------+----------+--------+--------+
| Vishal | vishal@gmail.com | 12345    | Male   | Indore |
| Komal  | komal@gmail.com  | 56789    | Female | Ujjain |
| aaa    | aaa@gmail.com    | 76757    | Male   | Nagpur |
| zzz    | zzz@gmail.com    | z12345   | Female | Dhar   |
+--------+------------------+----------+--------+--------+
4 rows in set (0.00 sec)

---> After <---

mysql> select * from register;
+----------+------------------+----------+--------+--------+
| name     | email            | password | gender | city   |
+----------+------------------+----------+--------+--------+
| Vishal   | vishal@gmail.com | 12345    | Male   | Indore |
| Komal    | komal@gmail.com  | 56789    | Female | Ujjain |
| aaa      | aaa@gmail.com    | 76757    | Male   | Nagpur |
| zzz      | zzz@gmail.com    | z12345   | Female | Dhar   |
| Prashant | Pra@gamil.com    | PPP      | Male   | Agra   |
+----------+------------------+----------+--------+--------+
5 rows in set (0.00 sec)

*/
