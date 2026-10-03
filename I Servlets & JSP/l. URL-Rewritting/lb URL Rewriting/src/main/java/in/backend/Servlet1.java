package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Ser1")
public class Servlet1 extends HttpServlet
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
		
		String name = "Vishal";
		String phone = "1234567890";
		
		PrintWriter out =  resp.getWriter();
		
		out.println("<h2 style = 'color:#c70e6a'> Servlet 1 Page </h2>");
		out.println("<a href='Ser2?myname="+name+"&myphone="+phone+"'> Click Here </a> to go to 'Servlet 2' ");
	}
}
















