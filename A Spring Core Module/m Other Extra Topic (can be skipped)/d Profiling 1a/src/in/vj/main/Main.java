package in.vj.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
		
		context.getEnvironment().setActiveProfiles("development");
		context.refresh();	
		Student std1 = (Student) context.getBean("stdId1");
		std1.disp();
		
		
		context.getEnvironment().setActiveProfiles("testing");
		context.refresh();
		Student std2 = (Student) context.getBean("stdId1");
		std2.disp();
		

		context.getEnvironment().setActiveProfiles("production");
		context.refresh();
		Student std3 = (Student) context.getBean("stdId1");
		std3.disp();
	}
}

// Output:-

/*

Name : Vishal : Development Team
Name : Uday : Testing team
Name : Rakesh : Productiion team

*/