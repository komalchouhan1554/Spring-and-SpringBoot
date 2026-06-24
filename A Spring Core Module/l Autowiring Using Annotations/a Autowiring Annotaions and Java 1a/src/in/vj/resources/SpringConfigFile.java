package in.vj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vj.beans.Address;
import in.vj.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public Address createAddObj() 
	{
		Address addr = new Address();
		
		addr.setHouseno(521);
		addr.setCity("Indore");
		addr.setPincode(745861);
		return addr;
	}
	
	@Bean
	public Student createStdObj() 
	{
		Student std = new Student();
		std.setName("Vishal");
		std.setRoll(66);
		// std.setAddress(createAddObj()); // Manually Dependency Injection
		
		return std;
	}
}
