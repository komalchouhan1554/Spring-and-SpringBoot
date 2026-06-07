package com.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vj.beans.Employee;
import com.vj.beans.Student;

public class Main 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/vj/resource/stdAppContext.xml"
				, "/com/vj/resource/empAppContext.xml");
		
		Student std = (Student) context.getBean("stdObj");
		std.stdDisp();
		
		System.out.println("---------------------------------");
		Employee emp = (Employee) context.getBean("empObj");
		emp.empDisp();

	}

}

// Output:-

/*

Name is : Vishal J
ROll no : 122
---------------------------------
Emp Name : Suraj
Emp Id : 44539

*/