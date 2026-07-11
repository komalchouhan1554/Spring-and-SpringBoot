package in.vj.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vj.beans.Student;
import in.vj.resources.SpringConfigFile;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std =  (Student) context.getBean("stdObj");
		
		std.disp();

	}

}

// Output:-

/*
 
नमस्कार Aakash, India की ओर से।
 
*/
