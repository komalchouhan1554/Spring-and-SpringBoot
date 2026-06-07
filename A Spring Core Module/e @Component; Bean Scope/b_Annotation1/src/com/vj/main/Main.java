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
		
		Student std = (Student) context.getBean("student");
		std.disp();
		
		
		System.out.println("--------------------------------");
		
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext();
		context2.register(MyStudent.class);
		context2.refresh();
		
		MyStudent std2 = (MyStudent) context2.getBean("myStudent");
		std2.disp();
	}
}

//Output:-

/*


Name : Ankit
RollNO. : 547
--------------------------------
Name : Amar
RollNO. : 984

*/