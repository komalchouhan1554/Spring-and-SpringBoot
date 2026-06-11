package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;

public class Main
{
	public static void main(String[] args) {
		
		ApplicationContext cnxt = new ClassPathXmlApplicationContext("/in/vj/resource/applicationContext.xml");
		
		Student std = (Student) cnxt.getBean("stdObj");
		std.disp();
	}
}
  

// Output:-

/*

Name : Vishalj
Roll : 204
Bean Name : stdObj

*/