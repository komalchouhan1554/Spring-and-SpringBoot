package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@Controller

public class MyController 
{

	@RequestMapping("/aaa")
	public String openHelloPage()
	{
		return "hello";
	}
	
	@PostMapping("/myForm")
	public String getFormName(HttpServletRequest req, HttpServletResponse resp)
	{
		String name = req.getParameter("uname");
		System.out.println("Name : " + name);
		
		return "hello";
	}
	

	
}
