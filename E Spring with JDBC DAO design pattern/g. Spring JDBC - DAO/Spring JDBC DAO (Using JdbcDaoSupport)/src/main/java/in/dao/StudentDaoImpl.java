package in.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import in.beans.Student;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao
{


	@Override
	public boolean addStdDetails(Student std) 
	{
		boolean status = false;
		
		try 
		{
			String sql_query = "insert into register values(?,?,?,?,?)";
			int count = getJdbcTemplate().update(sql_query, std.getName(),std.getEmail(),std.getPassword(),std.getGender(),std.getCity());
			
			if(count > 0)
			{
				status = true;
			}
			else
			{
				status = false;
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return status;
	}

}
