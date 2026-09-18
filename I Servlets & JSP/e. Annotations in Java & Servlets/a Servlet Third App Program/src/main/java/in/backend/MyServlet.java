package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
// @WebServlet("/myser1")
// @WebServlet(name = "ms", urlPatterns = {"/myser1"})
@WebServlet(name = "ms", urlPatterns = {"/aaa","/bbb"})
public class MyServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		out.println("Hello, Servlet 1 !!!");
	}
}

// Output on page:-

// Hello, Servlet 1 !!!