package in.vj.log4j;

//Note: This is very old and deprecated by java
//TO run this we need old jar file :- log4j-1.2.17.jar 
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println("-------------- App Starts ---------------");

		BasicConfigurator.configure();
		
		Logger logger =  Logger.getLogger("Main");
		
		logger.fatal("This is fatel messge");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.info("This is info message");
		
		System.out.println("-------------- App Ends -----------------");

	}
}

//Output:-

/*

-------------- App Starts ---------------
1 [main] FATAL A1  - This is fatel messge
2 [main] ERROR A1  - This is error message
2 [main] WARN A1  - This is warn message
2 [main] INFO A1  - This is info message
-------------- App Ends -----------------

*/