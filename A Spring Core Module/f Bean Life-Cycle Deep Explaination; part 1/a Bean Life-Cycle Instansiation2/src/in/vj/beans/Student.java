package in.vj.beans;

public class Student 
{
	
	Student(int a)
	{
		System.out.println("Constructor Invoked...");
	}
	private String name;
	private int roll;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public void disp() {
		System.out.println("Method Invoked...");
	}
	
	// Factory method to create object using parametrized constrctor.
	public static Student createObj()
	{
		System.out.println("Static Factory Method: CreateObj Method....");
		return new Student(10);
	}
	
}
