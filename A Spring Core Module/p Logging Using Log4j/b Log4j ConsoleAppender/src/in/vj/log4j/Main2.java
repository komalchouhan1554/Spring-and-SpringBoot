package in.vj.log4j;

//Note: This is very old and deprecated by java
//TO run this we need old jar file :- log4j-1.2.17.jar 
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main2 {

	public static void main(String[] args) 
	{
		System.out.println("-------------- App Starts ---------------");

		PropertyConfigurator.configure(System.getProperty("user.dir")  +"/src/in/vj/resources/log4j2.properties");
		
		Logger logger =  Logger.getLogger("Main");
		
		logger.fatal("This is fatel message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.info("This is info message");
		
		System.out.println("-------------- App Ends -----------------");

	}
}

//Output:-

/*

-------------- App Starts ---------------
FATAL 2026-04-03 17:35:04,885 This is fatel message
ERROR 2026-04-03 17:35:04,888 This is error message
WARN 2026-04-03 17:35:04,889 This is warn message
INFO 2026-04-03 17:35:04,889 This is info message
-------------- App Ends -----------------


*/