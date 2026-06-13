package in.vj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("Prafull")
	private String name;
	
	@Value("51")
	private int roll;
	
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
	
	public void disp() {
		System.out.println("Name: "+ name);
		System.out.println("Roll NO: "+ roll);
	}
}
