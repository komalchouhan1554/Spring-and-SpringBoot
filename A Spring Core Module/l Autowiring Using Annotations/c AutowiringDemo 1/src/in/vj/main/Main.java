package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.vj.beans.Car;
import in.vj.resources.SpringConfigFile;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		ApplicationContext c = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Car cc = c.getBean("carObj", Car.class);
		
		cc.carStarts();

	}

}


// Output:-

/*

V6: Engine Start Working
My Car : Model Tata Nexon Starts.

*/