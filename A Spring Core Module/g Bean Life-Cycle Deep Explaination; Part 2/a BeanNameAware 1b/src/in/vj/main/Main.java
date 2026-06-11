package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;

public class Main
{
	public static void main(String[] args) {
		
		ApplicationContext cnxt = new ClassPathXmlApplicationContext("/in/vj/resource/applicationContext.xml");
		
		Student std = (Student) cnxt.getBean("student");
		std.disp();
	}
}
  

// Output:-

/*

BeanNameAware Method is invoked!
Name : Vishalj
Roll : 204
Bean Name : student

*/