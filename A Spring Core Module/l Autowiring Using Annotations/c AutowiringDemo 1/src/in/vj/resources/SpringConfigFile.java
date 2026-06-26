package in.vj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import in.vj.beans.Car;
import in.vj.beans.Engine;

@Component
public class SpringConfigFile
{
	@Bean
	public Engine engObj() 
	{
		Engine eng = new Engine();
		eng.setType("V6");
		
		return eng;
	}
	
	@Bean
	public Car carObj()
	{
		Car car = new Car();
		car.setModel("Tata Nexon");
		
		return car;
	}
}
