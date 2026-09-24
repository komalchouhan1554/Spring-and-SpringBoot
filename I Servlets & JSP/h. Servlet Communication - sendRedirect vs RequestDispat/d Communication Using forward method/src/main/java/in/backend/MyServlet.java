package in.backend;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/aaa")
public class MyServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// In this case the URL is not change.
		
		/*
		RequestDispatcher rd = req.getRequestDispatcher("/newPage.html");
		rd.forward(req, resp);
		*/
		
		RequestDispatcher rd2 = req.getRequestDispatcher("/bbb");
		rd2.forward(req, resp);
	}
}
