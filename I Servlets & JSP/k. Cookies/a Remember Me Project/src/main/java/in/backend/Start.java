package in.backend;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Start")
public class Start extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	
		boolean logStatus = false;
		
		Cookie [] ck = req.getCookies();
		
		if (ck != null) 
		{
			for (Cookie c : ck) 
			{
				if (c.getName().equals("loginStatus") && c.getValue().equals("true")) 
				{
					logStatus = true;
				}
			}
		}
		
		
		
		if (logStatus) 
		{
			RequestDispatcher rd = req.getRequestDispatcher("/ProfilePage");
			rd.forward(req, resp);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.forward(req, resp);
		}
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		service(req, resp);
	}
}
