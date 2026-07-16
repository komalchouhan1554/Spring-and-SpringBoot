package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vj.beans.Student;
import in.vj.resources.SpringConfigFile;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    		
    		Student st = (Student) context.getBean("createStdBean");
    		
    		st.disp();
    }
}

// Output:-

/*
 
Name: Vishal
Roll: 87
 
 */
