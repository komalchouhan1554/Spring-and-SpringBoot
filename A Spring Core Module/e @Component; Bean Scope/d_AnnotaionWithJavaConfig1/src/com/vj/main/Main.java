package com.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vj.beans.Student;
import com.vj.resource.JavaConfigFile;

public class Main
{

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);

		Student std = (Student) context.getBean("student");
		std.stdDisp();

	}

}

// Output:-

/*

Name is : Vishal J
ROll no : 453

*/