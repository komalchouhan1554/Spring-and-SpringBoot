package in.vj.beans;

public class Employee 
{
	private String name;
	private String phno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	public void disp()
	{
		System.out.println("Name :" +  name);
		System.out.println("Phone no. "+ phno);
	}
}
