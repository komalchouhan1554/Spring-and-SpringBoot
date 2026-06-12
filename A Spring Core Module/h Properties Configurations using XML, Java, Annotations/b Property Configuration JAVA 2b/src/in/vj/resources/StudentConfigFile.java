package in.vj.resources;

import java.util.ArrayList;
import java.util.List;

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
		
		
		List<String> lst = new ArrayList<String>();
		lst.add("C");
		lst.add("CPP");
		lst.add("Pyhton");
		lst.add("Java");
		
		std.setSubjects(lst);
		
		return std;
	}
}
