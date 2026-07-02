package in.vj.beans;

public class Student 
{
	private String name;
	private int roll;
	private String phone;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	public String getPhone() {
		return phone;
	}
	
	public void disp()
	{
		System.out.println("Name: "+ name);
		System.out.println("Roll: "+ roll);
		System.out.println("Phone no. "+ phone);
	}
	
	
}
