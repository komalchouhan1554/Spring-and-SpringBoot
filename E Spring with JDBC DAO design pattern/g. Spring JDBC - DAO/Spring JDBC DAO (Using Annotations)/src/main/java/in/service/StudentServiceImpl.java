package in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.beans.Student;
import in.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentDao stdDao;

	public void setStdDao(StudentDao stdDao) {
		this.stdDao = stdDao;
	}

	@Override
	public boolean addStdDetailsService(Student std) 
	{
		boolean status = stdDao.addStdDetails(std);
		return status;
	}		
}
