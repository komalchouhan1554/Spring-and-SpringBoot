package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.exceptions.LessAgeException;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController 
{
	@GetMapping("/openVotingPage")
	public String openVotingPage()
	{
		return "voting-page";
	}
	
	@PostMapping("/voteForm")
	public String openVotedPage(HttpServletRequest req)
	{
		 String ageString = req.getParameter("age1");

	     Integer age = Integer.parseInt(ageString);
		
		if(age < 18)
		{
			throw new LessAgeException("Sorry, you cancont vote as your age is below 18 !!!");
		}
		else
		{
			return "pass";
		}
		
	}
	

}
