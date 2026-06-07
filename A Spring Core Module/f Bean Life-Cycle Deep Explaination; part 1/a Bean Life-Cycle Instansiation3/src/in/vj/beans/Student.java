package in.vj.beans;

public class Student 
{
	
	public Student(int a)
	{
		System.out.println("Constructor Invoked...");
	}
	private String name;
	private int roll;
	
	public String getName() {
		System.out.println("Getter method of name");
		return name;
	}
	public void setName(String name) {
		System.out.println("Setter method of name");
		this.name = name;
	}
	public int getRoll() {
		System.out.println("Getter method of roll");
		return roll;
	}
	public void setRoll(int roll) {
		System.out.println("Setter method of roll");
		this.roll = roll;
	}
	
	public void disp() {
		System.out.println("Method Invoked...");
		System.out.println("Name: " + name);
		System.out.println("Roll no.: "+ roll);
	}
}
