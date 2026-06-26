package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vj.beans.Student;
import in.vj.resources.SpringConfigFile;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std = (Student) context.getBean(Student.class);
		std.disp();

	}
}

// Output:-

/*

Name : Prafull
Roll :45
Address: #745 , Bangluru - 364125

*/