package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Controller
public class MyController 
{
	@GetMapping("/helloPage")
	public String openHelloPage()
	{
		
		System.out.println(100/0);
		
		String name= null;
		System.out.println(name.length());
		
		return "hello";
	}
	
	
	
	// TO see the class name
	
//	public void demo()
//	{
//		SimpleMappingExceptionResolver obj= new SimpleMappingExceptionResolver();
//		obj.setExceptionMappings(null);
//	}
	
}
