package in.vj.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Car 
{
	private String model;
	
	@Autowired
	private Engine engine;

	public void setModel(String model) {
		this.model = model;
	}
	
	public void carStarts() {
		
		engine.engineWorking();
		System.out.println("My Car : Model "+model+ " Starts.");
	}
}
