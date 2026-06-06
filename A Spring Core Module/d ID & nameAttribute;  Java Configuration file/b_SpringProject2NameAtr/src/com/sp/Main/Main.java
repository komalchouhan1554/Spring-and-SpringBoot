package com.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.beans.Student;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext container = new ClassPathXmlApplicationContext("/com/sp/resource/applicationContext.xml");
		
		System.out.println("Using name attribute : ");
		Student std1 = (Student) container.getBean("stdObj1");
		std1.disp();
		
		System.out.println("-------------------- ");
		Student std2 = (Student) container.getBean("stdObj2");
		std2.disp();
		
		System.out.println("-------------------- ");
		Student std3 = (Student) container.getBean("stdObj3");
		std3.disp();
		
		System.out.println("-------------------- ");
		Student std4 = (Student) container.getBean("stdObj4");
		std4.disp();
		
		System.out.println("-------------------- ");
		Student std5 = (Student) container.getBean("stdObj5");
		std5.disp();
		
		System.out.println("-------------------- ");
		Student std6 = (Student) container.getBean("stdObj6");
		std6.disp();
	}
}


//Output:-

/*

Using name attribute : 
name is : Prafull Jadhav
ROll no : 201
-------------------- 
name is : Prafull Jadhav
ROll no : 201
-------------------- 
name is : Komal Chauhan
ROll no : 201
-------------------- 
name is : Komal Chauhan
ROll no : 201
-------------------- 
name is : Shivam Mishra
ROll no : 201
-------------------- 
name is : Shivam Mishra
ROll no : 201


*/