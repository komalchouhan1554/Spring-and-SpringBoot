package in.vj.validator;

import java.util.Properties;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import in.vj.beans.Student;

public class StudentValidator implements Validator
{
	private Resource resource;
	

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	public boolean supports(Class<?> clazz) 
	{
		boolean b = Student.class.equals(clazz);
		return b;
	}

	@Override
	public void validate(Object target, Errors errors) 
	{
		
		try 
		{
			Student std = (Student) target;
			
			Properties properties = PropertiesLoaderUtils.loadProperties(resource);
			
			if(std.getName().equals("") || std.getName().equals("null"))
			{
				errors.rejectValue("name", "key_name", properties.getProperty("key_name"));
			}
			
			if(std.getRoll() <= 0)
			{
				errors.rejectValue("roll", "key_roll",properties.getProperty("key_roll"));
			}
			
			if(std.getPhone().length() != 10)
			{
				errors.rejectValue("phone", "key_phone",properties.getProperty("key_phone"));
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
