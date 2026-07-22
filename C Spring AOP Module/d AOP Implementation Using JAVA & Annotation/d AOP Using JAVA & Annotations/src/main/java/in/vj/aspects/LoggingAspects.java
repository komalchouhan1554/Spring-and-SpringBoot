package in.vj.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

// We need to add AspectJ tools Dependeny for annotation
@Aspect
public class LoggingAspects 
{
	@Around("execution( * in.vj.services.BankTransactions.transactionUsingMobileBanking(..)) || "+
			" execution( * in.vj.services.BankTransactions.transactionUsingUPI(..))")
	public void myLogging(ProceedingJoinPoint jointPoint) throws Throwable
	{
		System.out.println("-----> Logging Service (Before) <-----");
		
		jointPoint.proceed();
		
		System.out.println("-----> Logging Service (After) <-----");
	}
}
