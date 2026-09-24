package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Communication through request-response object

@SuppressWarnings("serial")
@WebServlet("/aaa")
public class Myservlet1 extends HttpServlet
{
	/*
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		
		out.println("Through Resp Object");
	}
	
	 */
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		// Instead use of these we use the JSP.
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Hello Servlet </title> ");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<h2> Hello Servlet : Html </h2>");
		out.println("</body>");
		
		out.println("</html>");
	}
	
}

// Output on Browser

// Hello Servlet : Html