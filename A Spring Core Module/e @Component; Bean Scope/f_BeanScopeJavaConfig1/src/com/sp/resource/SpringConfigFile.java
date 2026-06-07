package com.sp.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.sp.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean
	@Scope("singleton") // Same reference for each getBean(-) request
	public Student stdObj()
	{
		Student std = new Student();
		
		std.setName("Vishal");
		std.setRollNo(78);
		return std;
	}
	
}
