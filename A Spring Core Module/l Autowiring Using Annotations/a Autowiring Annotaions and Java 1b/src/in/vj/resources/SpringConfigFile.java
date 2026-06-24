package in.vj.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.vj.beans.Address;
import in.vj.beans.Student;
import in.vj.beans.Subjects;

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
	public Subjects createSubObj() 
	{
		Subjects sub = new Subjects();
		
		List<String> lst = new ArrayList<String>();
		lst.add("C");
		lst.add("C++");
		lst.add("Java");
		lst.add("Python");
		
		sub.setLst(lst);
		
		return sub;
	}
	
	@Bean
	public Student createStdObj() 
	{
		Student std = new Student();
		std.setName("Vishal");
		std.setRoll(66);
		// std.setAddress(createAddObj()); // Manually Dependency Injection
		// std.setLst(createSubObj()); // Manually Dependency Injection
		return std;
	}
	
	
}
