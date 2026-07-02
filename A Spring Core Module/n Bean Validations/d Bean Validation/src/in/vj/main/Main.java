package in.vj.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import in.vj.beans.Student;
import in.vj.validator.StudentValidator;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		String configLocation = "/in/vj/resources/applicationContext.xml";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Student std = (Student) context.getBean("stdId");
		
		Map<String, Object> map = new HashMap<String, Object>();
		MapBindingResult mapBindingResult = new MapBindingResult(map, "mymapobj");
		
		StudentValidator stdValidator = (StudentValidator) context.getBean("stdVal");
		stdValidator.validate(std, mapBindingResult);
		
		List<ObjectError> lst = mapBindingResult.getAllErrors();
		
		if(lst.isEmpty())
		{
			std.disp();
		}
		else 
		{		
			for (ObjectError oe : lst) 
			{
				System.err.println(oe.getDefaultMessage());
			}
		}

	}

}

// output:-

/*

	Roll number cannot be 0
	Phone number is not valid

*/
