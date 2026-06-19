package in.vj.beans;

public class Address 
{
	private int houseno;
	private String city;
	private int pincode;
	
	public Address(int house, String city, int pincode)
	{
		this.houseno = house;
		this.city = city;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#" + houseno + " , "+city+" - "+pincode;
	}
	
	
}
