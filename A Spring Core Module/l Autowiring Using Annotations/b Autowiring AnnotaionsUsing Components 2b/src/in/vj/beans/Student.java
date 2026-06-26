package in.vj.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("Prafull")
	private String name;
	
	@Value("45")
	private int roll;
	
	// @Autowired
	private Address address;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}


	public void disp() {
		System.out.println("Name : "+ name);
		System.out.println("Roll :" + roll);
		System.out.println("Address: "+ address);
	}
}
