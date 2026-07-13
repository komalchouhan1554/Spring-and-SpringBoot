package in.vj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("Vishal J")
	 private String name;
	
	@Value("#{address.city}")
	 private String city;
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public void setCity(String city)
	 {
		 this.city = city;
	 }
	 

	 public void disp()
	 {
		 System.out.println("Hello "+ name );
		 System.out.println("City: "+ city);
	 }
	 
}
