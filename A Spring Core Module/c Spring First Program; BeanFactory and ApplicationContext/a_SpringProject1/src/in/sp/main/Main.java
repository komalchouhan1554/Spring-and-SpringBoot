package in.sp.main;

import java.awt.Container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.sp.beans.Student;


public class Main {

	public static void main(String[] args) 
	{
		Resource resourse = new ClassPathResource("/in/sp/resource/applicationContext.xml");

		BeanFactory bean = new XmlBeanFactory(resource);
		
		Student std = (Student) Container.getBeans("stdObj");
		std.disp();
	}
}

// Output:-

/*

name is : Vishal Jadhav
ROll no : 201

*/