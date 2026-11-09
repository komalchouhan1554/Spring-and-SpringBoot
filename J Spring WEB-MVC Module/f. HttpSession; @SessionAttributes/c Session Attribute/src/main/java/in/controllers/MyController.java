package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

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
}
