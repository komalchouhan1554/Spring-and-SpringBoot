package in.backend;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Communication through .sendError(___ , "Message") Method

@SuppressWarnings("serial")
@WebServlet("/aaa")
public class Myservlet1 extends HttpServlet
{
	 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.sendError(404, "Page not Found, please try again later ..! (This is custom message.)");
	}
	
}

// Output on Browser

// Hello Servlet : Html