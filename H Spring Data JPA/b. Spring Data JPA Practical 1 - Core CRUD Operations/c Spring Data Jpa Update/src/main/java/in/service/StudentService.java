package in.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.entity.Student;
import in.repository.StudentRepository;

@Service
public class StudentService 
{
	@Autowired
	private StudentRepository studentRepository;
	
	public void insertStdDetailsService(Student std)
	{
		try {
			studentRepository.save(std);
			System.out.println("Data Inserted Succesfully 🤖🤖🤖");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Data Not Inserted !!!");
		}
	}
	
	public void updateStdDetailsService(int id, float marks)
	{
		try 
		{
			Optional<Student> optional = studentRepository.findById(id);
			
			Student std = optional.get();
			std.setMarks(marks);
			
			studentRepository.save(std);
			
			System.out.println("Data Updated Succesfully 🤖🤖🤖");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Data Not Updated !!!");
		}
	}
}
