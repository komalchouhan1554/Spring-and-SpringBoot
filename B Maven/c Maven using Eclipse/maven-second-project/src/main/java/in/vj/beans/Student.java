package in.vj.beans;

public class Student 
{
	private String name;
	private int roll;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public void disp()
	{
		System.out.println("Name: "+ name);
		System.out.println("Roll: "+roll);
	}
	
}
