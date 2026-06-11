package in.vj.beans;

public class Student 
{
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void disp() {
		System.out.println(name);
	}
}
