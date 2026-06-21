package in.vj.beans;

public class Student 
{
	private String name;
	private int roll;
	private Address address;
	
	public Student(String name, int roll, Address address)
	{
		this.name = name;
		this.roll = roll;
		this.address = address;
	}
	
	
	public void disp() {
		System.out.println("Name: "+ name);
		System.out.println("Roll: " + roll);
		System.out.println("Address: "+ address);
	}
	
	
	
}
