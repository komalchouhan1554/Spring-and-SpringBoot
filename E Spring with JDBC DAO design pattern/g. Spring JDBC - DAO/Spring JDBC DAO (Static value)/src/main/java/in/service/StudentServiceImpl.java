package in.service;

import in.beans.Student;
import in.dao.StudentDao;

public class StudentServiceImpl implements StudentService
{
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
