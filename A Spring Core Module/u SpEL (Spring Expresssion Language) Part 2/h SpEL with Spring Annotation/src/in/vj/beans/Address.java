package in.vj.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address 
{
	@Value("86")
	private int houseno;
	
	@Value("Chandigarh")
	private String city;
	
	@Value("854762")
	private int pincode;
	
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#" + houseno + "," + city + "-"+pincode;
	}
	
}
