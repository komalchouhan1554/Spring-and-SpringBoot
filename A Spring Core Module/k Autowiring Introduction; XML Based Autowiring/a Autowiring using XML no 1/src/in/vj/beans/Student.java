package in.vj.beans;

public class Student 
{
	private String name;
	private int roll;
	private Address address;
	
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
	
	
	public void disp() {
		System.out.println("Name: "+ name);
		System.out.println("Roll: " + roll);
		System.out.println("Address: "+ address);
	}
	
	
	
}
