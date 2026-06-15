package in.vj.beans;

public class Teacher 
{
	private Student student;

	public Teacher(Student std)
	{
		this.student = std;
	}
	
	public void techDisp() {
		System.out.println("In Student Class: "+ student);
	}
}
