package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vj.beans.Student;
import in.vj.resources.SpringConfigFIle;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		ApplicationContext cn = new AnnotationConfigApplicationContext(SpringConfigFIle.class);
		
		Student std = (Student)cn.getBean("stdId");
		std.disp();
	}

}


// Output:-

/*

Name: Rohan
ROll: 544
Marks: 57.0
Address: #12345 , Bengluru - 245786

*/