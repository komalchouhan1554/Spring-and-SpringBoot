package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController 
{
	@RequestMapping("/aaa")
	public ModelAndView openHelloPage()
	{
		ModelAndView mav = new ModelAndView("hello");
		return mav;
	}
}
