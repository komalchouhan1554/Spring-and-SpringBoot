package in.vj.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// We need to add AspectJ tools Dependeny for annotation
@Aspect
public class LoggingAspects 
{
	@Before("execution( * in.vj.services.BankTransactions.transactionUsingMobileBanking(..)) || "+
			"execution( * in.vj.services.BankTransactions.transactionUsingUPI(..))")
	public void myLoggingBefore()
	{
		System.out.println("-----> Logging Service (Before) <-----");
	}
	
	@After("execution( * in.vj.services.BankTransactions.transactionUsingMobileBanking(..)) || "+
			"execution( * in.vj.services.BankTransactions.transactionUsingUPI(..))")
	public void myLoggingAfter()
	{
		System.out.println("-----> Logging Service (After) <-----");
	}
}
