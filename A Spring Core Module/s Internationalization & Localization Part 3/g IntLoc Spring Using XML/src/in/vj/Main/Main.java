package in.vj.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("in/vj/resources/applicationContext.xml");
		Student std =  (Student) context.getBean("stdObj");
		
		std.disp();

	}

}

// Output:-

/*
 
 नमस्ते, आप कैसे हैं?
 
*/
