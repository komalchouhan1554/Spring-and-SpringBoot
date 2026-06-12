package in.vj.beans;

import java.util.Map;


public class Student 
{
	
	private String name;
	private int roll;
	private Map<String, Integer> subMarks ;
	
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
	
	
	public Map<String, Integer> getSubMarks() {
		return subMarks;
	}
	public void setSubMarks(Map<String, Integer> subMarks) {
		this.subMarks = subMarks;
	}
	public void disp() {
		System.out.println("Name: "+ name);
		System.out.println("Roll NO: "+ roll);
		System.out.println("Subjects & Marks: "+ subMarks);
		
	}
}
