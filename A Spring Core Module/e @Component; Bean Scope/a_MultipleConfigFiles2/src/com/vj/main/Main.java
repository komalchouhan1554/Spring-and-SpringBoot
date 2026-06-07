package com.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vj.beans.Employee;
import com.vj.beans.Student;
import com.vj.resource.EmpConfigFile;
import com.vj.resource.StdConfigFile;

public class Main 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(
				StdConfigFile.class, 
				EmpConfigFile.class);
		
		Student std = (Student) context.getBean("stdObj");
		std.stdDisp();
		
		System.out.println("---------------------------------");
		Employee emp = (Employee) context.getBean("empObj");
		emp.empDisp();

	}

}

// Output:-

/*

Name is : Aazad Singh
ROll no : 32
---------------------------------
Emp Name : Rupesh
Emp Id : 75578


*/