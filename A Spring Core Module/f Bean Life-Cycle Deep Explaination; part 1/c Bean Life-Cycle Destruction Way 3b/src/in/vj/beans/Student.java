package in.vj.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean
{
	
	private String name;
	private int roll;
	
	// Getter and Setter : No need to create 
	
	public void disp() {
		System.out.println("Method Invoked...");
		System.out.println("Name : " + name);
		System.out.println("Roll : " + roll);
	}

	
	// Using afterPropertiesSet() method of InitializingBean callback interface
	@Override
	public void afterPropertiesSet() throws Exception 
	{
		name = "Vishal";
		roll = 65;	
	}


	@Override
	public void destroy() throws Exception 
	{
		System.out.println("destroy method is invoked.");
		name = "";
		roll = 0;
		
	}
	
	
}
