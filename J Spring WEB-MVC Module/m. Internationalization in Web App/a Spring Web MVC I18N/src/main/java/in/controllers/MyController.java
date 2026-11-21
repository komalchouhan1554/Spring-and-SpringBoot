package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController 
{
	@GetMapping("/home")
	public String openHomePage()
	{
		return "home";
	}
	
	@GetMapping("/contactUs")
	public String openContactUsPage()
	{
		return "contact-us";
	}
	
	@GetMapping("/aboutUs")
	public String openAboutUsPage()
	{
		return "about-us";
	}
	
	
}
