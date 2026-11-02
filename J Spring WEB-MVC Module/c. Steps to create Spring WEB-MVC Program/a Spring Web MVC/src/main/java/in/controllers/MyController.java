package in.controllers;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyController implements Controller
{

	@Override
	public @Nullable ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		ModelAndView mav = new ModelAndView("hello");
		return mav;
	}

}
