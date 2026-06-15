package in.vj.beans;

public class Student 
{
	private Teacher teacher;
		
	public Student(Teacher tch)
	{
		this.teacher = tch;
	}


	public void stdDisp() {
		System.out.println("In Student Class: "+ teacher);
	}
}
