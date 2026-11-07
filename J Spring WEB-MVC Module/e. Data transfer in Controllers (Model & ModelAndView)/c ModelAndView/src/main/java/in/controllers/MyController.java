package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
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
	
	// ModelAndView Class
	
	@PostMapping("/myForm")
	public ModelAndView getFormName(HttpServletRequest req, HttpServletResponse resp,Model model)
	{
		String name = req.getParameter("uname");
		
		ModelAndView mav = new  ModelAndView();
		
		mav.addObject("mav_name",name);
		mav.setViewName("hello");
		
		return mav;
	}
	
	
	// Other Ways
	
	/*
	 
	
	@PostMapping("/myForm")
	public ModelAndView getFormName(HttpServletRequest req, HttpServletResponse resp,Model model)
	{
		String name = req.getParameter("uname");
		
		ModelAndView mav = new  ModelAndView("hello");
		
		mav.addObject("mav_name",name);
		
		return mav;
	}
	
	
	
	@PostMapping("/myForm")
	public ModelAndView getFormName(HttpServletRequest req, HttpServletResponse resp,Model model)
	{
		String name = req.getParameter("uname");
		
		ModelAndView mav = new  ModelAndView("hello","mav_name",name);
		
		return mav;
	}
	
	 */
	
}
