package in.configurations;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


// In replacement of web.xml file
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?> @Nullable [] getRootConfigClasses() 
	{
		return null;
	}

	@Override
	protected Class<?> @Nullable [] getServletConfigClasses() 
	{
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() 
	{
		return new String[]{"/"};
	}



}
