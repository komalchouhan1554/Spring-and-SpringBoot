package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"m_name","m_gender","m_city"}) // To store multiple data
public class MyController 
{
	@GetMapping("/aaa")
	public String OpenFirstPage(Model model)
	{
		// 100 lines of code
		String name = "Vishal";
		String gender = "Male";
		String city = "Indore";
		
		model.addAttribute("m_name", name);
		model.addAttribute("m_gender", gender);
		model.addAttribute("m_city", city);
		
		return "first";
	}
	
	@GetMapping("/bbb")
	public String OpenSecondPage()
	{
		return "second";
	}
}
