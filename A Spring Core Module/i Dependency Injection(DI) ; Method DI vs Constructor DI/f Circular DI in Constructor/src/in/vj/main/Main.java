package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Student;
import in.vj.beans.Teacher;

public class Main {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
		
		Student std = (Student)context.getBean("stdId");
		std.stdDisp();		
		
		System.out.println("----------------------------------------------");
		
		Teacher tch = (Teacher)context.getBean("tId");
		tch.techDisp();
	}
}


// Output:-

/*

Is there an unresolvable circular reference or an asynchronous initialization dependency?

Mar 22, 2026 10:18:02 AM org.springframework.context.support.ClassPathXmlApplicationContext refresh
WARNING: Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException:
Exception in thread "main" org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'tId' defined in class path.
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:377)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:135)
	at org.springframework.beans.factory.support.ConstructorResolver.resolveConstructorArguments(ConstructorResolver.java:705)
		at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:365)
	... 31 more


*/