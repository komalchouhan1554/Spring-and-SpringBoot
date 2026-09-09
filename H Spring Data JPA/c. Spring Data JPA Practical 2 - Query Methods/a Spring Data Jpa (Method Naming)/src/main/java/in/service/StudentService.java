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
	
	
	public Student getStdDetailsByEmail(String email)
	{
		Student std = studentRepository.findByEmail(email);
		return std;
	}
	
}











