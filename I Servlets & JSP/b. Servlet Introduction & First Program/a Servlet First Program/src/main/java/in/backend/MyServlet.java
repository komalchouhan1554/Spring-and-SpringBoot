package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/")
public class MyServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println("This is my First Servlet Program 🚀🚀🚀");
		
		PrintWriter out = resp.getWriter();
		out.println("This Shows On The Page 💫💫💫");
	}
}

// Output in console:-

// This is my First Servlet Program 🚀🚀🚀

// Output on page:-

// This Shows On The Page 💫💫💫