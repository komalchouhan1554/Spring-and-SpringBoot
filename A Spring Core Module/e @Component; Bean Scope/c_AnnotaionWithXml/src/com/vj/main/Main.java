package com.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vj.beans.Student;

public class Main
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/vj/resource/applicationContext.xml");

		Student std = (Student) context.getBean("student");
		std.stdDisp();

	}

}

// Output:-

/*

Name is : komal
ROll no : 133

*/