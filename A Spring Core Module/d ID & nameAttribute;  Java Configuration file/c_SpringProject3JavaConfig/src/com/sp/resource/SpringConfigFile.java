package com.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sp.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public Student stdObj()
	{
		Student std = new Student();
		
		std.setName("Vishal");
		std.setRollNo(78);
		return std;
	}
	
	
	@Bean(name = "stdObj1")
	public Student createObj()
	{
		Student std = new Student();
		
		std.setName("Vijay");
		std.setRollNo(45);
		return std;
	}
}
