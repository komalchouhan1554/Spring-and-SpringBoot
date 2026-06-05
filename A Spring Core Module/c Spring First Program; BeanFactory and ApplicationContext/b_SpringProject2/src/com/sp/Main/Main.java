package com.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Student;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext container = new ClassPathXmlApplicationContext("/com/sp/resource/applicationContext.xml");
		
		Student std = (Student) container.getBean("stdObj");
		
		std.disp();
	}
}


//Output:-

/*

name : Setter method is called in backend autoamatically.
rollNO : Setter method is called in backend autoamatically.
name is : Prafull Jadhav
ROll no : 201


*/