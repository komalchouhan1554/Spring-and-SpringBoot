package in.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

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
		PrintWriter out = resp.getWriter();

		Enumeration<String> headerNames_enum = req.getHeaderNames();
		
		while (headerNames_enum.hasMoreElements()) 
		{
			String headerName = headerNames_enum.nextElement();
			String headerValue = req.getHeader(headerName);
			
			out.println(headerName + " - "+headerValue + "\n");
 			
		}
	}
}

// Output on page:-

/*

host - localhost:8080

connection - keep-alive

sec-ch-ua - "Google Chrome";v="149", "Chromium";v="149", "Not)A;Brand";v="24"

sec-ch-ua-mobile - ?0

sec-ch-ua-platform - "Windows"

upgrade-insecure-requests - 1

user-agent - Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/149.0.0.0 Safari/537.36

accept - text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,* /*;q=0.8,application/signed-exchange;v=b3;q=0.7

sec-fetch-site - none

sec-fetch-mode - navigate

sec-fetch-user - ?1

sec-fetch-dest - document

accept-encoding - gzip, deflate, br, zstd

accept-language - en-US,en;q=0.9,hi;q=0.8

*/