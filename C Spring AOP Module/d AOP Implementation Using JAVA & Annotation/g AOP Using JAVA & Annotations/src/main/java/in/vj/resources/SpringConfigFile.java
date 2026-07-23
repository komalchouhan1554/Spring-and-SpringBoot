package in.vj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import in.vj.aspects.LoggingAspects;
import in.vj.services.BankTransactions;
import in.vj.services.PaytmTransactions;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfigFile 
{
	@Bean
	public BankTransactions bankTrans()
	{
		return new BankTransactions();
	}
	
	@Bean
	public LoggingAspects logAspects()
	{
		return new LoggingAspects();
	}
	
	@Bean
	public PaytmTransactions paytmTrans()
	{
		return new PaytmTransactions();
	}
}
