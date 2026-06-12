package in.vj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vj.beans.Student;

@Configuration
public class StudentConfigFile 
{
	@Bean("stdId")
	public Student createStdObj()
	{
		Student std = new Student();
		std.setName("Vishal");
		std.setRoll(61);
		
		return std;
	}
}
