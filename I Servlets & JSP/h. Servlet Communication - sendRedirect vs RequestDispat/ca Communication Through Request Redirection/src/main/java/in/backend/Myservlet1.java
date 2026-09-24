package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Communication through request-redirection : We use it when we want redirect to other's application page.

@SuppressWarnings("serial")
@WebServlet("/aaa")
public class Myservlet1 extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> My Title </title> ");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<h2> Hello Servlet </h2>");
		out.println("<a href='https://www.google.com'> Google 🥅 </h2>");
		out.println("</body>");
		
		out.println("</html>");
	}
	
}
