package in.dao;

import in.entity.Student;

public interface StudentDao 
{
	public void searchStudent(int id);
	
	public void insertStudent(Student std);
	public void updateStudent(int id,float marks);
	public void deleteStudnet(int id);
	
}
