package in.vj.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Student  implements BeanFactoryAware
{
	
	private String name;
	private int roll;
	private Address address;
	
	private BeanFactory beanFac;
	
	
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
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException 
	{
		this.beanFac = beanFactory;
	}
	
	public void disp() {
		System.out.println("Name :"+ name);
		System.out.println("Roll no.: "+ roll);
		
		Address address = (Address) beanFac.getBean("addObj");
		System.out.println("Address :"+ address);
	}
	
}
