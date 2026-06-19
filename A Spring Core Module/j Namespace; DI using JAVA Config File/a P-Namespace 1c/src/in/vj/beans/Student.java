package in.vj.beans;

public class Student 
{

	private String name;
	private int roll;
	private float marks;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void disp() {
		System.out.println("Name: "+ name);
		System.out.println("ROll: "+ roll);
		System.out.println("Marks: "+ marks);
		System.out.println("Address: "+ address);
	}
}
