package in.vj.dao;

import in.vj.bean.Student;
import in.vj.dbCon.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDaoImpl implements StudentDao {
	
	public boolean addStudentDetail(Student std)
	{
		boolean status=false;
		try
		{
			Connection con= DbConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into register values(?, ?, ? , ?, ?)");
			ps.setString(1,std.getName());
			ps.setString(2,std.getEmail());
			ps.setString(3, std.getPassword());
			ps.setString(4, std.getGender());
			ps.setString(5, std.getCity());
			
			int count=ps.executeUpdate();
			if(count>0)
			{
				status=true;
			}
			else
			{
				status=false;
			}
			
			
		}
		catch(Exception e)
		{
			status = false;
			e.printStackTrace();
		}
		return status;
	}

}
