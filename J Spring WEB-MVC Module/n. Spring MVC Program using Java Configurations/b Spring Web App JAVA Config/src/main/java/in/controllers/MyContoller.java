package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyContoller 
{
	@GetMapping("/aaa")
	public String openHelloPage()
	{
		return "hello";
	}
}
