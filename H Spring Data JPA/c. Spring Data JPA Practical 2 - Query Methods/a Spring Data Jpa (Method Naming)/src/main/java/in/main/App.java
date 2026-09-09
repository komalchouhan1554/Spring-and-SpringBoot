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
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        StudentService stdService = (StudentService) context.getBean("studentService");
        
        Student std= stdService.getStdDetailsByEmail("vishal@email.com");
        
        System.out.println("Id: "+ std.getId());
        System.out.println("Name: "+std.getName());
        System.out.println("Marks: "+ std.getMarks());
        
    }
}

// Output:-

/*

Hibernate: select s1_0.std_id,s1_0.std_email,s1_0.std_marks,s1_0.std_name from std_query_details s1_0 where s1_0.std_email=?

Id: 1
Name: Vishal
Marks: 85.5

 
*/
