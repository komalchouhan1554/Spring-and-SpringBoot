package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController 
{
	@GetMapping("/helloPage")
	public String openHelloPage()
	{
		
		//System.out.println(100/0);
		
		String name=null;
		System.out.println(name.length());
		
		return "hello";
	}
	
	@GetMapping("/errorPage")
	public String OpenErrorPage()
	{
		return "error-page";
	}
	
}
