package in.vj.main;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;

public class Main
{
	public static void main(String[] args) {
		
		AbstractApplicationContext cnxt = new ClassPathXmlApplicationContext("/in/vj/resource/applicationContext.xml");
		
		Student std = (Student) cnxt.getBean("stdId");
		std.disp();
		
		cnxt.registerShutdownHook();
	}
}
  

// Output:-

/*

Method Invoked...
Name : Vishal J
Roll : 201
Annotation ke sath destruction.

*/