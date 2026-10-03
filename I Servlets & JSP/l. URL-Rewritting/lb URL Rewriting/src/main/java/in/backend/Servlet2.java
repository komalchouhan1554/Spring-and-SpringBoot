package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Ser2")
public class Servlet2 extends HttpServlet
{
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
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		
		String name1 = req.getParameter("myname");
		String phone1 = req.getParameter("myphone");
		
		PrintWriter out =  resp.getWriter();
		
		
		out.print("<h1> Welcome "+name1+" (" +phone1+")</h3>");
		out.println("<h2 style = 'color:#49f505'> Servlet 2 Page </h2>");
		out.println("<a href='Ser1'> Click Here </a> to go to 'Servlet 1' ");
	}
}
















