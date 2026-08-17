package in.dao;

import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport; 

public class StudentDaoImpl extends NamedParameterJdbcDaoSupport implements StudentDao
{


	@Override
	public boolean addStdDetails(Map<String,Object> map) 
	{
		boolean status = false;
		
		try 
		{
			String sql_query = "insert into register values(:key_name,:key_email,:key_pass,:key_gender,:key_city)";
			int count = getNamedParameterJdbcTemplate().update(sql_query,map);
			
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
