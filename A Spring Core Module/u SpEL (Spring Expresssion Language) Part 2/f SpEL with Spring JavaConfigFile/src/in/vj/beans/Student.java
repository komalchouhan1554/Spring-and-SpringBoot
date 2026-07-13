package in.vj.beans;

public class Student 
{
	 private String name;
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
