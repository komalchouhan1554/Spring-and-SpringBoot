package in.vj.log4j;

//Note: This is very old and deprecated by java
//TO run this we need old jar file :- log4j-1.2.17.jar 
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
	public static void main(String[] args) 
	{
		System.out.println("-------------- App Starts ---------------");

		PropertyConfigurator.configure(System.getProperty("user.dir")  +"/src/in/vj/resources/log4j.properties");
		
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
-------------- App Ends -----------------



*/