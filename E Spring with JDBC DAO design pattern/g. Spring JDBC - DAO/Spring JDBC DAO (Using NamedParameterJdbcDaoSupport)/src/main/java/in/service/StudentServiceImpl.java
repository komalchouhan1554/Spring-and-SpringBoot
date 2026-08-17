package in.service;

import java.util.Map;
import in.dao.StudentDao;

public class StudentServiceImpl implements StudentService
{
		private StudentDao stdDao;

		public void setStdDao(StudentDao stdDao) {
			this.stdDao = stdDao;
		}

		@Override
		public boolean addStdDetailsService(Map<String,Object> map) 
		{
			boolean status = stdDao.addStdDetails(map);
			return status;
		}
		
		
}
