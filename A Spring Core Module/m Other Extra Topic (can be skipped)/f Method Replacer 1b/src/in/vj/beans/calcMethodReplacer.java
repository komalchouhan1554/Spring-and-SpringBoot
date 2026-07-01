package in.vj.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class calcMethodReplacer implements MethodReplacer
{

	@Override
	public Object reimplement(Object obj1, Method m, Object[] obj2) throws Throwable 
	{
		int no1 = (Integer) obj2[0];
		int no2 = (Integer) obj2[1];
		int no3 = 100;
		
		System.out.println("Addition is: "+ (no1+no2+no3));

		return null;
	}
	
}
