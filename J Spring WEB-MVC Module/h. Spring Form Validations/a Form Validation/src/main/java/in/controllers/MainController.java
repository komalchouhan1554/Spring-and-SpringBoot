package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.beans.Student;
import jakarta.validation.Valid;

@Controller
public class MainController 
{
	@RequestMapping("/regPage")
	public String openRegisterPage(Model model)
	{
		model.addAttribute("modelStd",new Student());
		return "regPage";
	}
	

	
	  
	@PostMapping("/regForm")
	public String handleRegForm(@Valid  @ModelAttribute("modelStd") Student std, BindingResult br)
	{
		if(br.hasErrors())
		{
			return "regPage";
		}
		else
		{
			return "profile";
		}
	}
		
}
