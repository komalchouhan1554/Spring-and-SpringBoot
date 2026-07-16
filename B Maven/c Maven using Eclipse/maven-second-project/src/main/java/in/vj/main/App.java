package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;

/**
 * Hello world!
 */
public class App {
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
        
        Student std = context.getBean("stdObj", Student.class);
        
        std.disp();
    }
}

// Output:-

/*

Name: Vishal
Roll: 63

*/