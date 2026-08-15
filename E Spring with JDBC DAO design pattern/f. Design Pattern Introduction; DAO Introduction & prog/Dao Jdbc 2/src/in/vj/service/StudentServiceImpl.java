package in.vj.service;

import in.vj.bean.Student;
import in.vj.dao.StudentDao;
import in.vj.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService{
	
	public boolean addStudentDetailService(Student std)
	{
		StudentDao studentdao=new StudentDaoImpl();
		boolean status= studentdao.addStudentDetail(std);
		return status;
	}

}
