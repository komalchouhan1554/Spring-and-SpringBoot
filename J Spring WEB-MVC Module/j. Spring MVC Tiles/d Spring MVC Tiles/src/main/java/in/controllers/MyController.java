package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController 
{
	@GetMapping("/home")
	public String openHomePage()
	{
	
		return "home_def";
	}
	
	@GetMapping("/aboutUS")
	public String openAboutUsPage()
	{
	
		return "about_def";
	}
	
	@GetMapping("/contactUS")
	public String openContactUSPage()
	{
	
		return "contact_def";
	}

}
