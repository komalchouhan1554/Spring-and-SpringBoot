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
		
		Address addr = new Address();
		addr.setHouseno(12345);
		addr.setCity("Bengluru");
		addr.setPincode(245786);
		
		return addr;
	}
	
	@Bean("stdId")
	public Student createStdObj()
	{
		Student std = new Student();
		std.setName("Rohan");
		std.setRoll(544);
		std.setMarks(57);
		std.setAddress(createAddObj());
		
		return std;
	}
}
