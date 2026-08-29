package in.dao;

import in.beans.Student;

public interface StudentDao 
{
	public void addStdDetails(Student std);
	public void updateDeatils(Student std);
	public void deleteDetails(Student std);
	public void searchStdDetails(int id);
}
