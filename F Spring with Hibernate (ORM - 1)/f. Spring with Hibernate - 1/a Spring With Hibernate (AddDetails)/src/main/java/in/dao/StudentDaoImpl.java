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

}
