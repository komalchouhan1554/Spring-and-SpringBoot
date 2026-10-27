package in.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.dbcon.DBConnection;
import in.models.User;

public class LoginDao 
{
	public User logDao (String email,String password)
	{
		User user = null;
		
		
		try 
		{
			Connection con = DBConnection.getConnection();
			
			PreparedStatement ps = con.prepareStatement("select * from register where email = ? and password=?");
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				user = new User();
				
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				user.setCity(rs.getString("city"));
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return user;
	}
}
