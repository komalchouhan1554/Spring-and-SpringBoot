package in.vj.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SecurityAspects 
{
	@Before("execution(* in.vj.services.BankTransactions.*(..))")
	public void mySecurity()
	{
		System.out.println("!!!!! Security Service !!!!!");
	}
}
