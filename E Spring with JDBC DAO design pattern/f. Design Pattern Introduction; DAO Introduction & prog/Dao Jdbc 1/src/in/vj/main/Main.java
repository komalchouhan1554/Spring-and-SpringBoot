package in.vj.main;

import in.vj.bean.Student;
import in.vj.dao.StudentDao;
import in.vj.dao.StudentDaoImpl;

public class Main {

	public static void main(String[] args) 
	{
		Student std=new Student();
		std.setName("Vishal");
		std.setEmail("Vishal@gmail.com");
		std.setPassword( "Vishal123");
		std.setGender("Male");
		std.setCity( "indore");

		StudentDao studentdao=new StudentDaoImpl();
		boolean status= studentdao.addStudentDetail(std);
		if(status)
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}


/*output
 * 

mysql> select * from register;

+--------+------------------+-----------+----------+--------+
| name   | email            | pasword   | gender   | city   |
+--------+---------------------+----------+--------+--------+
| Vishal | Vishal@gmail.com | Vishal123 | Male     | indore |
+--------+------------------+-----------+----------+--------+
1 row in set (0.03 sec)

*/
