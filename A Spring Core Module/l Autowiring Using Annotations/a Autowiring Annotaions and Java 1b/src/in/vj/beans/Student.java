package in.vj.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
	private String name;
	private int roll;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Subjects subjects;

	
	public void setName(String name) {
		this.name = name;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}

	
	public void disp() {
		System.out.println("Name : "+ name);
		System.out.println("Roll :" + roll);
		System.out.println("Address: "+ address);
		System.out.println("Subjects: "+ subjects);
	}
}
