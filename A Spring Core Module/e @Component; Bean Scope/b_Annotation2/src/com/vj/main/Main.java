package com.vj.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vj.beans.MyStudent;
import com.vj.beans.Student;

public class Main 
{
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(Student.class);
		context.refresh();
		
		Student std = (Student) context.getBean("stdObj");
		std.disp();
		
	}
}

//Output:-

/*

Name : Ankit
RollNO. : 547

*/