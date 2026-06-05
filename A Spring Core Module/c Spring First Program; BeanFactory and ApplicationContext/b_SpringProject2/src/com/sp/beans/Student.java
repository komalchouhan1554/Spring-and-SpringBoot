package com.sp.beans;

public class Student 
{
	private String name;
	private int rollNo;
	
	public String getName() {
		System.out.println("name : Getter method is not called in backend autoamatically.");
		return name;
	}
	public void setName(String name) {
		System.out.println("name : Setter method is called in backend autoamatically.");
		this.name = name;
	}
	public int getRollNo() {
		System.out.println("rollNO : Getter method is not called in backend autoamatically.");
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		System.out.println("rollNO : Setter method is called in backend autoamatically.");
		this.rollNo = rollNo;
	}
	
	public void disp()
	{
		System.out.println("name is : "+ name);
		System.out.println("ROll no : "+ rollNo);
	}
}