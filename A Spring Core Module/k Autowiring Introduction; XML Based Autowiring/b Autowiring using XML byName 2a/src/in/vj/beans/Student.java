package in.vj.beans;

public class Student 
{
	private String name;
	private int roll;
	private Address address;
	private Subjects subjects;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Subjects getSubjects() {
		return subjects;
	}
	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}
	
	public void disp() {
		System.out.println("Name: "+ name);
		System.out.println("Roll: " + roll);
		System.out.println("Address: "+ address);
		System.out.println("Subjects: " + subjects);
	}
	
	
	
}
