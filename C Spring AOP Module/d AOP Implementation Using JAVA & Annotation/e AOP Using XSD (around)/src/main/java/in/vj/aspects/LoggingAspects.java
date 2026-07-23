package in.vj.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspects 
{
	public void myLogging(ProceedingJoinPoint jointPoint) throws Throwable
	{
		System.out.println("-----> Logging Service (Before) <-----");
		
		jointPoint.proceed();
		
		
		System.out.println("-----> Logging Service (After) <-----");
	}
}
