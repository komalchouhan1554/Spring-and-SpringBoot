package in.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import in.beans.Student;

public class StudentDaoImpl implements StudentDao 
{

	private HibernateTemplate hibernateTemplate;
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	@Override
	public void addStdDetails(Student std) 
	{
		try 
		{
			hibernateTemplate.save(std);
			System.out.println("Studet details added Successfully...");
		} 
		catch (Exception e) 
		{
			System.out.println("Student deatils not added due to some error !!!");
			e.printStackTrace();
		}
		
	}
	
	@Transactional
	@Override
	public void updateDeatils(Student std) {
		try 
		{
			hibernateTemplate.update(std);
			System.out.println("Studet details update Successfully...");
		} 
		catch (Exception e) 
		{
			System.out.println("Student deatils not update due to some error !!!");
			e.printStackTrace();
		}
		
	}
	
	@Transactional
	@Override
	public void deleteDetails(Student std) {
		try 
		{
			hibernateTemplate.delete(std);
			System.out.println("Studet details delete Successfully...");
		} 
		catch (Exception e) 
		{
			System.out.println("Student deatils not delete due to some error !!!");
			e.printStackTrace();
		}
		
	}
	@Override
	public void searchStdDetails(int id) {
		try 
		{
			Student std = (Student) hibernateTemplate.get(Student.class,id);
			System.out.println("Studet details retrive Successfully...");
			System.out.println("Name: "+ std.getName());
			System.out.println("Roll No: "+ std.getRollno());
			System.out.println("City: "+ std.getCity());
		} 
		catch (Exception e) 
		{
			System.out.println("Student deatils not retrieve due to some error !!!");
			e.printStackTrace();
		}
		
	}

}
