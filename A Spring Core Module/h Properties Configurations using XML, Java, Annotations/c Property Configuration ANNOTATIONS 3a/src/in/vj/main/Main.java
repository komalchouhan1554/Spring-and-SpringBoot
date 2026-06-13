package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vj.beans.Student;
import in.vj.resources.JavaConfigFile;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		//Student std = (Student) context.getBean("stdId"); 
					//OR
		Student std = context.getBean("student",Student.class);
		std.disp();

	}

}

// Output:-

/*

Name: Prafull
Roll NO: 51

*/