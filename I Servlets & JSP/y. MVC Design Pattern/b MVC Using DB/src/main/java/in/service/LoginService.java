package in.service;

import in.dao.LoginDao;
import in.models.User;

public class LoginService 
{
	public User loginService(String name, String pass)
	{
		LoginDao logDao = new LoginDao();
		User user = logDao.logDao(name, pass);
		
		return user;
	}
}
