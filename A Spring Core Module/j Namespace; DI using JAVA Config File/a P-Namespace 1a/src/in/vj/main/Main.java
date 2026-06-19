package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		ApplicationContext cn = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
		
		Student std = (Student)cn.getBean("stdId");
		std.disp();
	}

}


// Output:-

/*

Name: Vishal
ROll: 568
Marks: 97.8

*/