package in.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;

// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;



@Controller
@RequestMapping("/myproject") // Class Level @RequestMapping acts as a sub-url
public class MyController 
{
	/*
	 
	@RequestMapping("/aaa")
	public void vj()
	{
		// --------- body -----------
	}

	
//---------------------------------------------------
	
	
	@RequestMapping("/aaa")
	public String openHelloPage()
	{
		return "hello";
	}
	
	
//---------------------------------------------------
		
		
	@RequestMapping("/aaa")
	public ModelAndView openHelloPage()
	{
		
		ModelAndView mav = new ModelAndView();
		// Set model data
		// Set view data
		return mav;
	}
	
	
//---------------------------------------------------
		
			
	@RequestMapping("/aaa")
	public String openHelloPage(int a)
	{
		return "hello";
	}
	
	
//---------------------------------------------------
	
		
	@RequestMapping("/aaa")
	public String openHelloPage(String name)
	{
		return "hello";
	}

	
//---------------------------------------------------
	
	
	@RequestMapping("/aaa")
	public String openHelloPage(HttpServletRequest req, HttpServletResponse resp)
	{
		return "hello";
	}
	
			
	*/
	
//---------------------------------------------------
	
	// @RequestMapping(value = "/aaa")
	// @RequestMapping(value = {"/aaa" , "/bbb" , "/ccc"} )
	// @RequestMapping(value = "/aaa", method = RequestMethod.GET)
	@RequestMapping(value = "/aaa", method = {RequestMethod.GET, RequestMethod.POST})
	public String openHelloPage()
	{
		return "hello";
	}
	

//--------------------------------------------------- When Request is coming through Get Method

	@GetMapping("/aaa")
	public String openHelloPageViaGet()
	{
		return "hello";
	}
	
	
//--------------------------------------------------- When Request is coming through Post Method

	@PostMapping("/aaa")
	public String openHelloPageViaPost()
	{
		return "hello";
	}
	
}
