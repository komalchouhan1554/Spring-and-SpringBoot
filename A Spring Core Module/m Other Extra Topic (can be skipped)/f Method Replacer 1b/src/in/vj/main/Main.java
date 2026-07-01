package in.vj.main;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Calculations;
public class Main{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
		
		Calculations c = (Calculations) context.getBean("calc");
		c.add(10, 56);

	}
}

// Output:-

/*

Addition is: 166

*/