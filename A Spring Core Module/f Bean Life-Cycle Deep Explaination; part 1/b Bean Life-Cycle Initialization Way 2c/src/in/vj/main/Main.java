package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;

public class Main
{
	public static void main(String[] args) {
		
		ApplicationContext cnxt = new ClassPathXmlApplicationContext("/in/vj/resource/applicationContext.xml");
		
		Student std = (Student) cnxt.getBean("stdId");
		std.disp();
	}
}
  

// Output:-

/*

Method Invoked...
Name : Vishal J
Roll : 201

*/