package in.vj.aspects;

import java.lang.reflect.Method;

import org.jspecify.annotations.Nullable;
import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAspects implements MethodBeforeAdvice
{

	@Override
	public void before(Method method, @Nullable Object[] args, @Nullable Object target) throws Throwable 
	{
		System.out.println("----- Logging Service Logic -----");
		
	}

}
