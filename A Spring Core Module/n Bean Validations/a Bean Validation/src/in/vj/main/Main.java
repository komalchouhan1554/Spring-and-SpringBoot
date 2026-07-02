package in.vj.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DataBinder;
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
		
		
		DataBinder db = new DataBinder(std);
		db.addValidators(new StudentValidator());
		db.validate();
		
		List<ObjectError> lst = db.getBindingResult().getAllErrors();
		
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
