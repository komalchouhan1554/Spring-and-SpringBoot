package in.vj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vj.beans.Address;
import in.vj.beans.Student;

@Configuration
public class SpringConfigFIle 
{
	@Bean
	public Address createAddObj() {
		
		Address addr = new Address(12345,"Bengluru",245786);
		return addr;
	}
	
	@Bean("stdId")
	public Student createStdObj()
	{
		Student std = new Student("Rohan",644,43,createAddObj());
		return std;
	}
}
