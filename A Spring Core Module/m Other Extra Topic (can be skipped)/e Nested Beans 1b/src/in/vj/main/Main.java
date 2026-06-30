package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Address;
import in.vj.beans.Student;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
		
		Student std = (Student) context.getBean(Student.class);
		std.disp();
		
		System.out.println("-----------------------");
		
		Address adr = (Address) context.getBean("addId");
	    adr.dispAdd();

	}
}

// Output:-

/*

Name : Vishal
Roll :36
Address: #568 , Bhopal - 557268
-----------------------
#568 , Bhopal - 557268

*/