package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/aaa")
public class LogIn extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		
		String myEmail = req.getParameter("email");
		String myPass = req.getParameter("pass1");
		
		out.println("Email: "+myEmail + "\n");
		out.println("Password: "+myPass);
	}
}

//Output on page:-

/*
 
Email: Vishal@gmail.com

Password: Vishal123
 
*/
