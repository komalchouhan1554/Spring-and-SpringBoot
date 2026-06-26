package in.vj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	private String name;
	private int roll;
	private Address address;
	
	public Student(@Value("Sumit")String name, @Value("35") int roll,Address address)
	{
		this.name = name;
		this.roll = roll;
		this.address = address;
	}
	
	public void disp() {
		System.out.println("Name : "+ name);
		System.out.println("Roll :" + roll);
		System.out.println("Address: "+ address);
	}
}
