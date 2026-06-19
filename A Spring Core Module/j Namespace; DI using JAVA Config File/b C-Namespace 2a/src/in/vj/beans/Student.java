package in.vj.beans;

public class Student 
{

	private String name;
	private int roll;
	private float marks;
	
	public Student(String name, int roll, float marks)
	{
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	public void disp() {
		System.out.println("Name: "+ name);
		System.out.println("ROll: "+ roll);
		System.out.println("Marks: "+ marks);
	}
}
