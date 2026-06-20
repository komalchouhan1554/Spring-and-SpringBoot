package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
		
		Student std = (Student) context.getBean("stdId");
		std.disp();

	}

}

// Output:-

/*

Name: Vishal
Roll: 64
Address: #186 , Delhi - 965487
Subjects: [C, C++, JAVA, PYTHON]

*/