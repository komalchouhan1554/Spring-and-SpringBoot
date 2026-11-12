package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController 
{
	@GetMapping("/helloPage")
	public String openHelloPage()
	{
		return "hello";
	}
	
	@GetMapping("/pageNotFound")
	public String openPageNotFound()
	{
		return "page-not-found";
	}
}
