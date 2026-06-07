package com.vj.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vj.beans.Employee;

@Configuration
public class EmpConfigFile 
{
	@Bean
	public Employee empObj() 
	{
		Employee emp = new Employee();
		emp.setEmpName("Rupesh");
		emp.setEmpId(75578);
		
		return emp;
	}
}
