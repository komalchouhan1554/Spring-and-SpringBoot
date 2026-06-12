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
Roll NO: 201
Subjects & Marks: {OSA=87, Java=96, DBMS=84, Maths=89, CN=74}

*/