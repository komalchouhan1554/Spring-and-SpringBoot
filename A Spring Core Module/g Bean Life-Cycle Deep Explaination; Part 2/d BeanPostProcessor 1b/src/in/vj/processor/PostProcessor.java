package in.vj.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import in.vj.beans.Employee;
import in.vj.beans.Student;

public class PostProcessor implements BeanPostProcessor 
{

	@Override
	public Object postProcessAfterInitialization(Object beanObj, String beanName) throws BeansException 
	{
		if (beanObj instanceof Student) 
		{
			Student stdObj = (Student) beanObj;
			stdObj.setName("Hello " + stdObj.getName());
			
			return stdObj;
		}
		else
		{
			Employee empObj = (Employee) beanObj;
			empObj.setPhno("+91-"+ empObj.getPhno());
			return empObj;
		}
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanObj, String beanName) throws BeansException 
	{
		
		if (beanObj instanceof Student) 
		{
			Student stdObj = (Student) beanObj;
			stdObj.setName(stdObj.getName() + ", How are You ???");
			
			return stdObj;
		}
		else
		{
			return beanObj;
		}
	
	}
	
}
