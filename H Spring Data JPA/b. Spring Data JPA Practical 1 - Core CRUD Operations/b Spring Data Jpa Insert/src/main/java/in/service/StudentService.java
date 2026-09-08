package in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.entity.Student;
import in.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository studentRepository;
	
	public boolean insertStdDetailsService(Student std)
	{
		boolean status = false;
		
		try
		{
			studentRepository.save(std);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
			e.printStackTrace();
		}
		
		
		return status;
	}
}
