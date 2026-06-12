package in.vj.resources;

import java.util.HashMap;
import java.util.Map;

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
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("C", 98);
		map.put("CPP", 82);
		map.put("Python", 92);
		map.put("Java", 95);
		map.put("JS", 88);
		
		std.setSubMarks(map);
		
		return std;
	}
}
