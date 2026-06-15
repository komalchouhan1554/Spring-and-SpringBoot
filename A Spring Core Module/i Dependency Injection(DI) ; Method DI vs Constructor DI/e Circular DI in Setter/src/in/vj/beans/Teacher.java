package in.vj.beans;

public class Teacher 
{
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void techDisp() {
		System.out.println("In Student Class: "+ student);
	}
}
