package com.vj.beans;

public class Student 
{
	private String name;
	private String rollNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public void stdDisp()
	{
		System.out.println("Name is : "+ name);
		System.out.println("ROll no : "+ rollNo);
	}
}
