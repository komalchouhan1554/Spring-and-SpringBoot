package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.beans.Student;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MainController 
{
	@RequestMapping("/regPage")
	public String openRegisterPage()
	{
		return "regPage";
	}
	
	@PostMapping("/regForm")
	public String handleRegForm(HttpServletRequest req, Model model)
	{
		String myname= req.getParameter("name1");
		String myemail= req.getParameter("email1");
		String mypass= req.getParameter("pass1");
		String mygender = req.getParameter("gender1");
		String mycity= req.getParameter("city1");
		// insert into database code
		
		Student std = new Student();
		std.setName(myname);
		std.setEmail(myemail);
		std.setPassword(mypass);
		std.setGender(mygender);
		std.setCity(mycity);
		
		
		model.addAttribute("model_name", std);
		
		return "profile";
	}
}
