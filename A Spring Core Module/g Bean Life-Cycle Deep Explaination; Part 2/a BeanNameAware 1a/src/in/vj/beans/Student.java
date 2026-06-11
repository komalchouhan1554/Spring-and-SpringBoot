package in.vj.beans;

import org.springframework.beans.factory.BeanNameAware;

public class Student implements BeanNameAware
{
	
	private String name;
	private int roll;
	private String beanName;
	
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
		System.out.println("Name : " + name);
		System.out.println("Roll : " + roll);
		System.out.println("Bean Name : " + beanName);
	}
	@Override
	public void setBeanName(String name) 
	{	
		
		this.beanName = name;
		
	}
}
