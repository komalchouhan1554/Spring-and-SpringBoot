package in.vj.beans;

public class Student 
{
	private Teacher teacher;
		
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public void stdDisp() {
		System.out.println("In Student Class: "+ teacher);
	}
}
