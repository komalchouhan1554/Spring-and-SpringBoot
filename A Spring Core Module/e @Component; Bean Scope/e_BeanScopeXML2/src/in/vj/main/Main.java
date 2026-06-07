package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resource/applicationContext.xml");
		
		Student std = (Student)context.getBean("stdObj");
		System.out.println(std);
		
		Student std1 = (Student)context.getBean("stdObj");
		System.out.println(std1);
		
		Student std2 = (Student)context.getBean("stdObj");
		System.out.println(std2);

	}

}

// Output:-

/*

in.vj.beans.Student@3ba9ad43
in.vj.beans.Student@49d904ec
in.vj.beans.Student@48e4374

*/