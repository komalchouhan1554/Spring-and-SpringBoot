package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController 
{
	@RequestMapping("/loginPage")
	public String openLogin()
	{
		return "login";
	}
	
	@PostMapping("/loginForm")
	public String loginForm(HttpServletRequest req, Model model, HttpSession session)
	{
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		if(myemail.equals("vishal@gmail.com") && mypass.equals("vishal"))
		{
			
			session.setAttribute("session_name", "Vishal");
			session.setAttribute("session_gender", "Male");
			session.setAttribute("session_city", "Indore");
			
			return "profile";
		}
		else
		{
			model.addAttribute("login_error","Email id a & Password didn't matched");
			return "login";
		}
	}
	
}
