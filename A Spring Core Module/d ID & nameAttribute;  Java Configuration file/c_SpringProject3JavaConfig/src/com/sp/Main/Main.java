package com.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sp.beans.Student;
import com.sp.resource.SpringConfigFile;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std = (Student) context.getBean("stdObj");
		
		std.disp();
		
		System.out.println("--------------------------------------");
		
		Student std1 = (Student) context.getBean("stdObj1");
		
		std1.disp();
	}
}


//Output:-

/*

name is : Vishal
ROll no : 78
--------------------------------------
name is : Vijay
ROll no : 45

*/