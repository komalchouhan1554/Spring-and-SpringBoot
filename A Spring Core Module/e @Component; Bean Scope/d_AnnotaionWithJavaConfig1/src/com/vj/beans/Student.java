package com.vj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student
{
	@Value("Vishal J")
	private String name;

	@Value("453")
	private int rollNo;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void stdDisp()
	{
		System.out.println("Name is : "+ name);
		System.out.println("ROll no : "+ rollNo);
	}
}
