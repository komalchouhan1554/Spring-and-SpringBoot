package in.vj.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student
{
	
	private String name;
	private int roll;
	
	// Getter and Setter : No need to create 
	
	public void disp() {
		System.out.println("Method Invoked...");
		System.out.println("Name : " + name);
		System.out.println("Roll : " + roll);
	}

	@PostConstruct
	public void initializeStdObj()
	{
		name = "Vishal J";
		roll = 201;
	}
	
	@PreDestroy
	public void destroyStdBean() 
	{
		System.out.println("Annotation ke sath destruction.");
		name="";
		roll = 0;
	}
	
	
}
