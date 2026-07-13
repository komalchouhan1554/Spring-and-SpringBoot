package in.vj.beans;

public class Student 
{
	 private String name;
	 private Address address;
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 
	 public void setAddress(Address address) {
		this.address = address;
	}


	 public void disp()
	 {
		 System.out.println("Hello "+ name );
		 System.out.println("Address: "+ address);
	 }
	 
}
