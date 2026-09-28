package in.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/homePage")
public class Home extends HttpServlet
{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        PrintWriter out = resp.getWriter();

	HttpSession session = req.getSession();
	String myname = (String) session.getAttribute("session_name");

		
	out.println("<h1 style='color: #3498db; font-family: sans-serif; text-align: center;'>Welcome : " + myname + "</h1>");


	out.println("<html>");
	out.println("<head>");
	out.println("<style>");
	// Page setup
	out.println("  body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #f0f2f5; margin: 0; padding: 0; color: #333; }");
	// Header style
	out.println("  header { background-color: #00ddff; color: white; padding: 20px; text-align: center; font-size: 24px; font-weight: bold; }");
	// Container layout
	out.println("  .container { max-width: 600px; margin: 40px auto; background: white; padding: 30px; border-radius: 8px; box-shadow: 0 4px 6px rgba(0,0,0,0.1); }");
	// Typography
	out.println("  h2 { color: #007bff; margin-top: 0; }");
	out.println("  p { line-height: 1.6; color: #555; }");
	// Button style
	out.println("  .btn { display: inline-block; background-color: #28a745; color: white; padding: 10px 20px; text-decoration: none; border-radius: 5px; margin-top: 15px; font-weight: bold; }");
	out.println("  .btn:hover { background-color: #218838; }");
	// Footer style
	out.println("  footer { text-align: center; padding: 20px; color: #777; font-size: 14px; position: fixed; bottom: 0; width: 100%; background: #e9ecef; }");
	out.println("</style>");
	out.println("</head>");
	out.println("<body>");

	// 1. Navigation / Header
	out.println("<header>")
                ;
        out.println("<header>My Web Application</header>");
        out.println("<a href = 'homePage'>Home</a>");
        out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        out.println("<a href = 'profilePage'>Profile</a>");
        out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        out.println("<a href = 'contectUs'>Contect Us</a>");
        out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        out.println("<a href = 'logout'>Logout</a>");
                
        out.println("</header>");

	// 2. Main Content Card
	out.println("<div class='container'>");
	out.println("  <h2>Welcome, User!</h2>");
	out.println("  <p>We are glad to have you back. This is your personalized dashboard where you can manage your account, view recent activities, and check your notifications.</p>");
	out.println("  <p>Your last login was recorded today. Everything is running smoothly, and no urgent actions are required at this time.</p>");
	out.println("  <a href='#' class='btn'>Go to Dashboard</a>");
	out.println("</div>");
		
        out.println("<h2 style='color: #00ddff; margin-top: 20px; text-align: center;'>Home Page</h2>");
                
	// Inside Profile.java, replace your logout link line with this:
	out.println("<h3 style='color: brown; margin-top: 20px; text-align: center;'>");
	out.println("  <a href='logout'> Logout </a>");
	out.println("</h3>");
		
	// 3. Footer
	out.println("<footer>&copy; 2026 Your Company. All rights reserved.</footer>");

	out.println("</body>");
	out.println("</html>");
    }
    
    
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
    
}
