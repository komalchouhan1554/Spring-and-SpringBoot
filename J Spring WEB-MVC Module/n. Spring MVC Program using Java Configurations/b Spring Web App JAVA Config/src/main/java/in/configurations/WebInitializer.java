package in.configurations;

import org.springframework.web.WebApplicationInitializer;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

//In replacement of web.xml file

public class WebInitializer implements WebApplicationInitializer
{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException 
	{
		AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
		webAppContext.register(WebConfig.class);
		webAppContext.setServletContext(servletContext);
		
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispature", new DispatcherServlet(webAppContext));
		servlet.addMapping("/");
		
	}

}
