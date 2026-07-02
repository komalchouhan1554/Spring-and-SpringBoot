package in.vj.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import in.vj.beans.Student;

public class StudentValidator implements Validator
{

	@Override
	public boolean supports(Class<?> clazz) 
	{
		boolean b = Student.class.equals(clazz);
		return b;
	}

	@Override
	public void validate(Object target, Errors errors) 
	{
		Student std = (Student) target;
		
		if(std.getName().equals("") || std.getName().equals("null"))
		{
			errors.rejectValue("name", "key_name", "Name is not valid");
		}
		
		if(std.getRoll() <= 0)
		{
			errors.rejectValue("roll", "key_roll","Roll number cannot be 0");
		}
		
		if(std.getPhone().length() != 10)
		{
			errors.rejectValue("phone", "key_phone","Phone number is not valid");
		}
		
	}

}
