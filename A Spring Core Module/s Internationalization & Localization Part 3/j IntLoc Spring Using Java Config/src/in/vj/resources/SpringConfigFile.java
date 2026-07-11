package in.vj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import in.vj.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public ResourceBundleMessageSource rmsId()
	{
		ResourceBundleMessageSource obj = new ResourceBundleMessageSource();
		obj.setBasename("in/vj/resources/MessageBundle");
		
		return obj;
	}
	
	@Bean
	public Student stdObj()
	{
		Student std = new Student();
		std.setName("Aakash");
		std.setCountry("India");
		std.setMsgSource(rmsId());;
		
		return std;
	}
}
