package in.vj.beans;

public class Student 
{
	
//	Student(int a)  // we cannot create a parameterized constructor in Bean class.
//	{
//		System.out.println("Constructor Invoked...");
//	}
	
	Student()
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
}
