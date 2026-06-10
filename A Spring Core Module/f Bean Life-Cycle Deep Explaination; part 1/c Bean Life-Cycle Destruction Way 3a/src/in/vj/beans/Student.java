package in.vj.beans;

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
	
	// Custom init() method created by user
	public void initializeObj() {
		
		System.out.println("Custom init() method invoked.");
		name = "Rahul";
		roll = 54;
	}
	
	
	// Custom destroy() method to destroy bean object : created by user
	public void destroyObj()
	{
		System.out.println("Custom destroy() method invoked.");
		name= "";
		roll=0;
	}
}
