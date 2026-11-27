package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Controller
public class MyController 
{
	@GetMapping("/helloPage")
	public String openHelloPage()
	{
		
		// System.out.println(100/0);
		
		String name= null;
		System.out.println(name.length());
		
		return "hello";
	}
	
	
	// @ExceptionHandler(ArithmeticException.class) //We can use this annotation at onces
	@ExceptionHandler(NullPointerException.class)
	public String openErrorPage()
	{
		return "error-page";
	}
	

	
}
