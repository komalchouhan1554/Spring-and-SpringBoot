package in.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.EnableWebMvc;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
//In replacement of myds-servlet.xml file

//  For Default COnfiguration Settings

@Configuration
@ComponentScan(basePackages = "in.controllers")
public class WebConfig 
{
	@Bean
	public InternalResourceViewResolver resolver()
	{
		InternalResourceViewResolver res = new InternalResourceViewResolver();
		res.setPrefix("/WEB-INF/views/");
		res.setSuffix(".jsp");
		
		return res;
	}
}



// ------ For Customize Settings -------
/*

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "in.controllers")
public class WebConfig implements WebMvcConfigurer
{
	@Bean
	public InternalResourceViewResolver resolver()
	{
		InternalResourceViewResolver res = new InternalResourceViewResolver();
		res.setPrefix("/WEB-INF/views/");
		res.setSuffix(".jsp");
		
		return res;
	}
}


*/