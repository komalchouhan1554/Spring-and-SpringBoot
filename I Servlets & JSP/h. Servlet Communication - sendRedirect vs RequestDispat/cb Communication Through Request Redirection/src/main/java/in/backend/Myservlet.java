package in.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Communication through request-redirection : We use it when we want redirect to other's application page.

@SuppressWarnings("serial")
@WebServlet("/aaa")
public class Myservlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setStatus(HttpServletResponse.SC_FOUND);
		resp.setHeader("Location", "https://www.google.com");
	}
}
