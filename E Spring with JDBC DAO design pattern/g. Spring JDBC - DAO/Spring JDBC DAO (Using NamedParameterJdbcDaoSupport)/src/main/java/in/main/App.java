package in.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.resources.SpringConfigFile;
import in.service.StudentService;
import in.service.StudentServiceImpl;


// Using NamedParameterJdbcDaoSupport class
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    		Scanner sc = new Scanner(System.in);
    		Map<String,Object> map = new HashMap<String, Object>();
    		
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
    		
    		map.put("key_name", stdName);
    		map.put("key_email", stdEmail);
    		map.put("key_pass", stdPassword);
    		map.put("key_gender", stdGender);
    		map.put("key_city", stdCity);
    		
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        // Student std = context.getBean(Student.class);
        
        StudentService stdService = (StudentService) context.getBean(StudentServiceImpl.class);
        
        boolean status = stdService.addStdDetailsService(map);
        
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

Enter Your Name: zzz
Enter Your Eamil: zzz@gmail.com
Enter Your Password: z12345
Enter Your Gender: Female
Enter Your City: Dhar
Data Inserted Succes Fully...


---> Before <---

mysql> select * from register;
+--------+------------------+----------+--------+--------+
| name   | email            | password | gender | city   |
+--------+------------------+----------+--------+--------+
| Vishal | vishal@gmail.com | 12345    | Male   | Indore |
| Komal  | komal@gmail.com  | 56789    | Female | Ujjain |
| aaa    | aaa@gmail.com    | 76757    | Male   | Nagpur |
+--------+------------------+----------+--------+--------+
3 rows in set (0.00 sec)

---> After <---

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

*/
