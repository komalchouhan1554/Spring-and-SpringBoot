package in.controller;

import java.io.IOException;
import java.io.PrintWriter;

import in.models.User;
import in.service.LoginService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/loginForm")
public class LoginController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		String myEmail = req.getParameter("email1");
		String myPass = req.getParameter("pass1");
		
		LoginService logServ = new LoginService();
		User user = logServ.loginService(myEmail, myPass);
		
		
		if (user != null) 
		{
			HttpSession session = req.getSession();
			session.setAttribute("session_user", user);
			
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
		}
		else
		{
			out.println("<h3 style='color:red;'> Email & Password didm't matched </h3>");
			
			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, resp);
		}
	}
}
