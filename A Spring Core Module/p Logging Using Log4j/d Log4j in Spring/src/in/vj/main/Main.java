package in.vj.main;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;

public class Main 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/in/vj/resources/log4j.properties");
		
		Logger logger = Logger.getLogger("Main");
		
		logger.fatal("This is the fatal message");
		logger.warn("This is Warn message");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
		
		Student std = (Student) context.getBean("stdId");
		std.disp();
	}
}

//Output:-

/*
 
 [FATAL] 03/04/2026 06:36:50 18 - This is the fatal message
[WARN ] 03/04/2026 06:36:50 18 - This is Warn message
Name : Vishal

*/
