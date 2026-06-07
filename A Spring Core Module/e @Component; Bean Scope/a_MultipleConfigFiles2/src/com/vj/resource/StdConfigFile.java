package com.vj.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vj.beans.Student;

@Configuration
public class StdConfigFile 
{
	@Bean
	public Student stdObj()
	{
		Student std = new Student();
		std.setName("Aazad Singh");
		std.setRollNo("32");
		
		return std;
	}
}
