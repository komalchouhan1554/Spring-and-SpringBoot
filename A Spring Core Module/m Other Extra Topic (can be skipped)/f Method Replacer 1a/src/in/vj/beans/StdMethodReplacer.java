package in.vj.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class StdMethodReplacer implements MethodReplacer
{

	@Override
	public Object reimplement(Object obj1, Method m, Object[] obj2) throws Throwable 
	{
		System.out.println("Good Morning, How are you?");
		return null;
	}
	
}
