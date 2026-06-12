package in.vj.beans;

import java.util.List;


public class Student 
{
	
	private String name;
	private int roll;
	private List<String> subjects ;
	
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
	
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public void disp() {
		System.out.println("Name: "+ name);
		System.out.println("Roll NO: "+ roll);
		System.out.println("Subjects: "+ subjects);
		
	}
}
