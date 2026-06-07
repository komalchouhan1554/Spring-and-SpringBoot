package com.vj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyStudent 
{
	@Value("Amar")
	private String name;
	
	@Value("984")
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
	
	public void disp() {
		System.out.println("Name : " + name);
		System.out.println("RollNO. : " + rollNo);
	}
	
}
