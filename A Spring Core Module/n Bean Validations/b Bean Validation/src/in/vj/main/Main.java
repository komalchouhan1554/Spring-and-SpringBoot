package in.vj.main;

import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

import in.vj.beans.Student;
import in.vj.resources.SpringConfigFile;
import in.vj.validator.StudentValidator;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
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

	Name is not valid
	Phone number is not valid

*/
