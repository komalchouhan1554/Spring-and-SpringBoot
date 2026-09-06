package in.dao;

import in.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

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


	@Transactional
	@Override
	public void insertStudent(Student std)
	{
		
		try 
		{
			entityManager.persist(std);
			System.out.println("Data Inserted Successfully ⚔️⚔️⚔️");
		} 
		catch (Exception e) 
		{
			System.out.println("Data Not Inserted !!!");
			e.printStackTrace();
		}
		
		
	}

	@Transactional
	@Override
	public void updateStudent(int id, float marks) 
	{
		try 
		{
			Student std = entityManager.find(Student.class, id);
			std.setMarks(marks);
			
			System.out.println("Data Updated Successfully ⚔️⚔️⚔️");
		} 
		catch (Exception e) 
		{
			System.out.println("Data Not Updated !!!");
			e.printStackTrace();
		}
		
	}


	@Override
	public void deleteStudnet(int id)
	{
		
	}

}
