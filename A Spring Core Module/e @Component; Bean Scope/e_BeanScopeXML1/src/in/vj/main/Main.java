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
		System.out.println(std);
		
		Student std2 = (Student)context.getBean("stdObj");
		System.out.println(std);

	}

}

// Output:-

/*

in.vj.beans.Student@1622f1b
in.vj.beans.Student@1622f1b
in.vj.beans.Student@1622f1b

*/