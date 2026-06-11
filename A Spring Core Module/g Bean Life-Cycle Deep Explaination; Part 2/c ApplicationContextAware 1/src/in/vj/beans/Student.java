package in.vj.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student  implements ApplicationContextAware
{
	
	private String name;
	private int roll;
	private Address address;
	
	private ApplicationContext applicationContext;
	
	
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
		System.out.println("Name :"+ name);
		System.out.println("Roll no.: "+ roll);
		
		Address address = (Address) applicationContext.getBean("addObj");
		System.out.println("Address :"+ address);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException 
	{
		this.applicationContext = applicationContext;
	}
	
}
