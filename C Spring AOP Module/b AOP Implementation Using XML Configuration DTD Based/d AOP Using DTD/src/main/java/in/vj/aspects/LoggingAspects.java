package in.vj.aspects;


import java.lang.reflect.Method;

import org.jspecify.annotations.Nullable;
import org.springframework.aop.AfterReturningAdvice;

public class LoggingAspects implements AfterReturningAdvice
{

	@Override
	public void afterReturning(@Nullable Object returnValue, Method method, @Nullable Object[] args,
			@Nullable Object target) throws Throwable 
	{
		System.out.println("----- After ::: Logging Service Logic -----");
		
	}

}
