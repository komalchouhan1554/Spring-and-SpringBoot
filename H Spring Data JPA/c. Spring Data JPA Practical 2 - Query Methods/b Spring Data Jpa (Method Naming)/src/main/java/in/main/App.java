package in.main;

import java.util.List;

// import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.entity.Student;
// import in.entity.Student;
import in.resources.SpringConfigFile;
import in.service.StudentService;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        StudentService stdService = (StudentService) context.getBean("studentService");
        
        List<Student> std_list = stdService.getStdDeatilsByMarksGreatorThan(80.5f);
        
        for (Student std : std_list) {
			System.out.println("------------------");
			System.out.println("Id: " +std.getId());
			System.out.println("Name: " +std.getName());
			System.out.println("Email: " +std.getEmail());
			System.out.println("Marks: " +std.getMarks());
			System.out.println("------------------");
		}
      
    }
}

// Output:-

/*

Hibernate: select s1_0.std_id,s1_0.std_email,s1_0.std_marks,s1_0.std_name from std_query_details s1_0 where s1_0.std_marks>?
------------------
Id: 1
Name: Vishal
Email: vishal@email.com
Marks: 85.5
------------------
------------------
Id: 2
Name: Komal
Email: komal@email.com
Marks: 92.0
------------------
------------------
Id: 4
Name: Diya Reddy
Email: diya.reddy@email.com
Marks: 95.0
------------------
------------------
Id: 5
Name: Arjun Singh
Email: arjun.singh@email.com
Marks: 88.5
------------------
 
*/
