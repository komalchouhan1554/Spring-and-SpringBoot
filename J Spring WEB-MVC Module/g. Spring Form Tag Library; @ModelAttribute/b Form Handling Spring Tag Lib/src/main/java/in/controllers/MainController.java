package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.beans.Student;

@Controller
public class MainController 
{
	@RequestMapping("/regPage")
	public String openRegisterPage(Model model)
	{
		model.addAttribute("modelStd",new Student());
		return "regPage";
	}
	
	/*
	
	
	@PostMapping("/regForm")
	public String handleRegForm(Student std, Model model)
	{
		model.addAttribute("model_name", std);
		
		return "profile";
	}
	
	*/
	
	
	/* 
	  
	@PostMapping("/regForm")
	public String handleRegForm(@ModelAttribute("model_std") Student std)
	{
		
		return "profile";
	}
	
	*/

	// Another way
	

	@ModelAttribute
	public void addStdObject(Student std, Model model)
	{
		model.addAttribute("model_std", std);
	}
	
	@PostMapping("/regForm")
	public String handleRegForm(Student std, Model model)
	{
		// insert into database code
		
		return "profile";
	}
		
}
