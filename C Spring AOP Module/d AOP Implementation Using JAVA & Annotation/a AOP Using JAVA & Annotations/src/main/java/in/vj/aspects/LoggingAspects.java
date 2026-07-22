package in.vj.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
// import org.aspectj.lang.annotation.Before;

// We need to add AspectJ tools Dependeny for annotation
@Aspect
public class LoggingAspects 
{
	// @Before("execution( * in.vj.services.BankTransactions.*(..))")
	@After("execution( * in.vj.services.BankTransactions.*(..))")
	public void myLogging()
	{
		System.out.println("-----> Logging Service <-----");
	}
}
