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
		System.out.println(std);
		
		Student std1 = (Student) context.getBean("stdObj");
		System.out.println(std1);
	}
}


//Output:-

/*

com.sp.beans.Student@5e0e82ae
com.sp.beans.Student@6771beb3

*/