package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vj.beans.Student;
import in.vj.resources.StudentConfigFile;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfigFile.class);
		//Student std = (Student) context.getBean("stdId"); 
					//OR
		Student std = context.getBean("stdId",Student.class);
		std.disp();

	}

}

// Output:-

/*

Name: Vishal
Roll NO: 61

*/