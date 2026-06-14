package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
		//Student std = (Student) context.getBean("stdId"); 
					//OR
		Student std = context.getBean("stdId",Student.class);
		std.disp();

		System.out.println("------------------------");
		Student std1 = (Student)context.getBean("stdId1");
		std1.disp();
	}

}

// Output:-

/*

Name: Vishal
Roll NO: 65
Marks: 97.5
------------------------
Name: Prfaul
Roll NO: 65
Marks: 0.0

*/