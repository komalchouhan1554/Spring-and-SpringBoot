package in.vj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address 
{
	private int houseno;
	private String city;
	private int pincode;
	
	public Address(@Value("574") int hn, @Value("Hydrabad") String city, @Value("751346") int pc)
	{
		this.houseno = hn;
		this.city = city;
		this.pincode = pc;
	}
	
	@Override
	public String toString() 
	{
		return "#"+ houseno + " , "+city+ " - "+pincode;
	}
}
