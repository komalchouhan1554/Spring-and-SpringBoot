package in.vj.beans;

public class Student 
{
	private int roll;
	private String name;
	private String aadhar;
	private String phone;

	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void stdDisp() 
	{
		System.out.println("Roll: "+ roll);
		System.out.println("Name : "+ name);
		System.out.println("Aadhar: "+ aadhar);
		System.out.println("Phone: "+ phone);
	}
}
