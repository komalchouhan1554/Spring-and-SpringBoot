package in.vj.log4j;

//Note: This is very old and deprecated by java
//TO run this we need old jar file :- log4j-1.2.17.jar 
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main4 {

	public static void main(String[] args) 
	{
		System.out.println("-------------- App Starts ---------------");

		PropertyConfigurator.configure(System.getProperty("user.dir")  +"/src/in/vj/resources/log4j4.properties");
		
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
[FATAL] 03/04/2026 05:52:25 pm - This is fatel message
[ERROR] 03/04/2026 05:52:25 pm - This is error message
[WARN ] 03/04/2026 05:52:25 pm - This is warn message
[INFO ] 03/04/2026 05:52:25 pm - This is info message
-------------- App Ends -----------------


*/