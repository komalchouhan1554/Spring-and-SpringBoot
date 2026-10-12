package in.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/myServlet")
public class MyServlet extends HttpServlet
{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		PrintWriter out = resp.getWriter();
		
		ServletConfig config = getServletConfig();
		
		/*
		String myname = config.getInitParameter("name1");
		String myemail = config.getInitParameter("email1");
		String mycity = config.getInitParameter("city1");
		
		out.println("Name : "+myname);
		out.println("Email : "+myemail);
		out.println("City : "+mycity);
		*/
		
		Enumeration<String> enumeration = config.getInitParameterNames();
		
		while (enumeration.hasMoreElements()) 
		{
			String paramName = enumeration.nextElement();
			
			String paramValue = config.getInitParameter(paramName);
			out.println(paramValue);
			
		}
	}

}

//Output:-

/* 

Vishal Jadhav
vishal@gmail.com
Indore

 */
