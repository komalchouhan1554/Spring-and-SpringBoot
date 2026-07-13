package in.vj.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vj.beans.Address;
import in.vj.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public Address addId()
	{
		Address addr = new Address();
		
		addr.setHouseno(67);
		addr.setCity("Indore");
		addr.setPincode(475812);
		
		return addr;
	}
	
	/*
	@Bean
	public Student stdId(@Value("#{addId.city}") String city)
	{
		Student std = new Student();
		
		std.setName("Vishal");
		// std.setCity(addId().getCity());
		 std.setCity(city);
		 
		return std;  
	}
	*/
	
	@Bean
	public Student stdId( @Value("#{addId.getCity()}") String city)
	{
		Student std = new Student();
		
		std.setName("Vishal");
		// std.setCity(addId().getCity());
		 std.setCity(city);
		 
		return std;  
	}
}
