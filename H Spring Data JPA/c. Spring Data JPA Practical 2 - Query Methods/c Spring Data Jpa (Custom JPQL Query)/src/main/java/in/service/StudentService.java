package in.service;

import java.util.List;
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
		Student std = studentRepository.getByEmail(email);
		return std;
	}
	
	public List<Student> getStdDeatilsByMarksGreatorThan(float marks)
	{
		return studentRepository.OtherNameByMarksGreaterThan(marks);
	}

}











