package in.main;

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
        
        // stdService.deleteStdDetailsService(4);
        
        Student std = stdService.getStdDetails(1);
        System.out.println("---------------");
        System.out.println("Name: "+std.getName());
        System.out.println("Roll: "+ std.getRoll());
        System.out.println("Marks: " + std.getMarks());
        
    }
}

// Output:-

/*


Hibernate: select s1_0.std_id,s1_0.std_marks,s1_0.std_name,s1_0.std_roll from std_details s1_0 where s1_0.std_id=?
---------------
Name: Vishal J
Roll: 101
Marks: 98.5
 
*/
