package in.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.beans.Student;

@Repository
public class StudentDaoImpl implements StudentDao
{
	@Autowired
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}


	@Override
	public boolean addStdDetails(Student std) 
	{
		boolean status = false;
		
		try 
		{
			String sql_query = "insert into register values(?,?,?,?,?)";
			int count = jt.update(sql_query, std.getName(),std.getEmail(),std.getPassword(),std.getGender(),std.getCity());
			
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
