package in.vj.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import in.vj.beans.Student;

public class StudentPostProcessor implements BeanPostProcessor 
{

	@Override
	public Object postProcessAfterInitialization(Object beanObj, String beanName) throws BeansException 
	{
		Student stdObj = (Student) beanObj;
		stdObj.setName("Hello " + stdObj.getName());
		
		return stdObj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object beanObj, String beanName) throws BeansException 
	{
		Student stdObj = (Student) beanObj;
		stdObj.setName(stdObj.getName() + ", How are You ???");
		
		return stdObj;
	}
	
}
