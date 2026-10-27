package in.dao;

import in.models.User;

public class LoginDao 
{
	public User logDao (String email,String password)
	{
		User user = null;
		
		if(email.equals("vishal@gmail.com") && password.equals("vj123"))
		{
			user = new User();
			
			user.setEmail("Vishal");
			user.setEmail("vishal@gmail.com");
			user.setCity("Indore");
		}
		
		return user;
	}
}
