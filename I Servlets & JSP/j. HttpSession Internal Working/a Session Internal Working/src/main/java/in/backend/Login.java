package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/loginForm")
public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		if(myemail.equals("vishal@gmail.com") && mypass.equals("vishal123"))
		{
			String name= "Vishal J";
			
			HttpSession session = req.getSession();
			session.setAttribute("session_name", name);
			
			RequestDispatcher rd = req.getRequestDispatcher("/profilePage");
			rd.forward(req, resp);
		}
		else
		{
			resp.setContentType("text/html");
			out.println("<h2 style = 'color:red'> Email and Password didnt matched !!!<h3>" );
			
			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, resp);
		}
	}
}
