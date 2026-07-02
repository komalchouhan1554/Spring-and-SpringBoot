package in.vj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vj.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean("stdId")
	public Student student()
	{
		Student std = new Student();
		
		std.setName("");
		std.setRoll(54);
		std.setPhone("5785459");
		
		return std;
	}
}
