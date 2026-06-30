package in.vj.beans;

public class Address 
{
	private int houseno;
	private String city;
	private int pincode;
	
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() 
	{
		return "#"+ houseno + " , "+city+ " - "+pincode;
	}
	
	public void dispAdd()
	{
		System.out.println("#"+ houseno + " , "+city+ " - "+pincode);
	}
}
