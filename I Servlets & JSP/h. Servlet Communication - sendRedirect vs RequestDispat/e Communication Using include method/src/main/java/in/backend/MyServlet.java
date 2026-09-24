package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


// include() method will add the response of another page in itself page.


@SuppressWarnings("serial")
@WebServlet("/aaa")
public class MyServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		PrintWriter out = resp.getWriter();
		out.println("Hello Servlet 1");
		
		/*
		resp.setContentType("text/html");
		
		RequestDispatcher rd = req.getRequestDispatcher("/newPage.html");
		rd.include(req, resp);
		*/
		
		RequestDispatcher rd2 = req.getRequestDispatcher("/bbb");
		rd2.include(req, resp);
		
	}
}
