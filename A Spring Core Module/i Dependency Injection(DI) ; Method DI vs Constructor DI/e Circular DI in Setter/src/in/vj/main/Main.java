package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;
import in.vj.beans.Teacher;

public class Main {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
		
		Student std = (Student)context.getBean("stdId");
		std.stdDisp();		
		
		System.out.println("----------------------------------------------");
		
		Teacher tch = (Teacher)context.getBean("tId");
		tch.techDisp();
	}
}


// Output:-

/*

In Student Class: in.vj.beans.Teacher@1a04f701
----------------------------------------------
In Student Class: in.vj.beans.Student@4e91d63f

*/