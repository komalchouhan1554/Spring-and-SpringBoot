package in.dao;

import in.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class StudentDaoImpl implements StudentDao
{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void searchStudent(int id)
	{
		
		try 
		{
			Student std = entityManager.find(Student.class, id);
			System.out.println("-----------------------");
			System.out.println("Name: "+ std.getName());
			System.out.println("RollNo: "+ std.getRoll());
			System.out.println("Marks: "+ std.getMarks());
			System.out.println("------------------------");
			
		} 
		catch (Exception e) 
		{
			System.out.println("Student Details Not found");
			e.printStackTrace();
		}
		
		
	}

}
