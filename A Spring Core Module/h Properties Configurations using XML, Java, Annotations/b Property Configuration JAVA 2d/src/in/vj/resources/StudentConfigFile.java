package in.vj.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import in.vj.beans.Student;

@Configuration
@PropertySource("/in/vj/resources/student.properties")
public class StudentConfigFile 
{
	@Value("${student.name}")
	private String name;
	
	@Value("${student.roll}")
	private int roll;
	
	@Bean("stdId")
	public Student createStdObj()
	{
		Student std = new Student();
		std.setName(name);
		std.setRoll(roll);
		
		return std;
	}
}
