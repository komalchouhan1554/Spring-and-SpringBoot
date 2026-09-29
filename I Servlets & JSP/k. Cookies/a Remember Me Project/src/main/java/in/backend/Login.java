package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/LoginForm")
public class Login extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		PrintWriter out = resp.getWriter();
		
		resp.setContentType("text/html");
		
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		String myrem = req.getParameter("rememberme1");
		
		if (myemail.equals("vishal@gmail.com") && mypass.equals("12345")) 
		{
			if(myrem != null)
			{
				Cookie ck = new Cookie("loginStatus", "true");
				ck.setMaxAge(60*60*24*356);
				resp.addCookie(ck);
			}
			
			
			RequestDispatcher rd = req.getRequestDispatcher("/ProfilePage");
			rd.include(req, resp);
		}
		else
		{
			out.println("<h3 style='color:red;' >Email Id and Password didn't matched !!! </h3>");
			
			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, resp);
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		service(req, resp);
	}
}
