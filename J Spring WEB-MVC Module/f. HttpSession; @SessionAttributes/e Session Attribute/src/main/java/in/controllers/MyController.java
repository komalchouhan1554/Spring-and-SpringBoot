package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


// Suppose we don't want data on every page

@Controller
@SessionAttributes("m_name") 
public class MyController 
{
	@GetMapping("/aaa")
	public String OpenFirstPage(Model model)
	{
		// 100 lines of code
		String name = "Vishal";
		
		model.addAttribute("m_name", name);
		
		return "first";
	}
	
	@GetMapping("/bbb")
	public String OpenSecondPage()
	{
		return "second";
	}
	
	@GetMapping("/ccc")
	public String OpenThirdPage(SessionStatus sessionStatus)
	{
		// It will complete the session and after clicking on third link we 
		// will not be able to get the data on the other pages.
		sessionStatus.setComplete(); 
		
		return "third";
	}
	
	@GetMapping("/ddd")
	public String OpenFourthPage()
	{
		return "fourth";
	}
}
