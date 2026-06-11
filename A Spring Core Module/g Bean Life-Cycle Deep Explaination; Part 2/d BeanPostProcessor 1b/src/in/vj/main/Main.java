package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Employee;
import in.vj.beans.Student;

public class Main
{
	public static void main(String[] args) {
		
		ApplicationContext cnxt = new ClassPathXmlApplicationContext("/in/vj/resource/applicationContext.xml");
		
		Student std = (Student) cnxt.getBean("student");
		std.disp();
		
		System.out.println("--------------------------------");
		
		Employee emp = (Employee) cnxt.getBean("emp");
		emp.disp();
	}
}
  

// Output:-

/*

Hello Vishal, How are You ???
--------------------------------
Name :Sanjay
Phone no. +91-6548241640

*/