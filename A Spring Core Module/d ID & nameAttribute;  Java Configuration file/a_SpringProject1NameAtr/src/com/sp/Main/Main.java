package com.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Student;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext container = new ClassPathXmlApplicationContext("/com/sp/resource/applicationContext.xml");
		
		System.out.println("Using id attribute : ");
		Student std1 = (Student) container.getBean("stdObj1");
		std1.disp();
		
		System.out.println("Using name attribute : ");
		Student std2 = (Student) container.getBean("stdObj2");
		std2.disp();
	}
}


//Output:-

/*

Using id attribute : 
name is : Prafull Jadhav
ROll no : 201
Using name attribute : 
name is : Vishal Jadhav
ROll no : 308


*/