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

	}

}

// Output:-

/*

Name: Vishal
Roll NO: 204
Subjects & Marks: {OSA=85, Java=97, DBMS=96, Maths=91, CN=73}

*/