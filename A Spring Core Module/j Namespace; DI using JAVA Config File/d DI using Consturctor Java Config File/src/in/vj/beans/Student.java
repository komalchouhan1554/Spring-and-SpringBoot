package in.vj.beans;

public class Student 
{

	private String name;
	private int roll;
	private float marks;
	private Address address;
	
	public Student(String name, int roll,float marks, Address address) {
		
		this.name = name;
		this.roll = roll;
		this.marks = marks;
		this.address = address;
	}
	
	public void disp() {
		System.out.println("Name: "+ name);
		System.out.println("ROll: "+ roll);
		System.out.println("Marks: "+ marks);
		System.out.println("Address: "+ address);
	}
}
