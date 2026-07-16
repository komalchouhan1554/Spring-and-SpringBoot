package in.vj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vj.beans.Student;

@Configuration
public class SpringConfigFile 
{

	@Bean
	public Student createStdBean()
	{
		Student std = new Student();
		
		std.setName("Vishal");
		std.setRoll(87);

		return std;
	}
}
