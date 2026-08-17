package in.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.beans.Student;
import in.resources.SpringConfigFile;
import in.service.StudentService;
import in.service.StudentServiceImpl;


// Using JdbcDaoSupport class
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    		Scanner sc = new Scanner(System.in);
    		Student std = new Student();
    		
    		System.out.print("Enter Your Name: ");
    		String stdName = sc.nextLine();
    		System.out.print("Enter Your Eamil: ");
    		String stdEmail = sc.nextLine();
    		System.out.print("Enter Your Password: ");
    		String stdPassword = sc.nextLine();
    		System.out.print("Enter Your Gender: ");
    		String stdGender = sc.nextLine();
    		System.out.print("Enter Your City: ");
    		String stdCity = sc.nextLine();
    		
    		std.setName(stdName);
    		std.setEmail(stdEmail);
    		std.setPassword(stdPassword);
    		std.setGender(stdGender);
    		std.setCity(stdCity);
    		
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        // Student std = context.getBean(Student.class);
        
        StudentService stdService = (StudentService) context.getBean(StudentServiceImpl.class);
        
        boolean status = stdService.addStdDetailsService(std);
        
        if(status)
        {
        	    System.out.println("Data Inserted Succes Fully...");
        }
        else
        {
        		System.out.println("Not Inserted !!!");
        }
        
    }
}

// Output:-

/*

Enter Your Name: aaa
Enter Your Eamil: aaal@gmail.com
Enter Your Password: 76757
Enter Your Gender: Male
Enter Your City: Nagpur
Data Inserted Succes Fully...

---> Before <---

mysql> select * from register;
+--------+------------------+----------+--------+--------+
| name   | email            | password | gender | city   |
+--------+------------------+----------+--------+--------+
| Vishal | vishal@gmail.com | 12345    | Male   | Indore |
| Komal  | komal@gmail.com  | 56789    | Female | Ujjain |
+--------+------------------+----------+--------+--------+
2 rows in set (0.00 sec)

---> After <---

mysql> select * from register;
+--------+------------------+----------+--------+--------+
| name   | email            | password | gender | city   |
+--------+------------------+----------+--------+--------+
| Vishal | vishal@gmail.com | 12345    | Male   | Indore |
| Komal  | komal@gmail.com  | 56789    | Female | Ujjain |
| aaa    | aaa@gmail.com    | 76757    | Male   | Nagpur |
+--------+------------------+----------+--------+--------+
3 rows in set (0.00 sec)

*/
