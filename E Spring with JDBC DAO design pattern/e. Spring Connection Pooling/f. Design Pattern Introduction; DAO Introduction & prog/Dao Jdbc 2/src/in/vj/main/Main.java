package in.vj.main;

import in.vj.bean.Student;
import in.vj.service.StudentService;
import in.vj.service.StudentServiceImpl;

public class Main {

	public static void main(String[] args) 
	{
		Student std=new Student();
		std.setName("komal");
		std.setEmail("komal@gmail.com");
		std.setPassword( "komal123");
		std.setGender("male");
		std.setCity( "indore");

		StudentService stdservice= new StudentServiceImpl();
		boolean status=stdservice.addStudentDetailService(std);
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


// Output:-


/*  
  ->Before
  mysql> select * from register;

+--------+------------------+-----------+----------+--------+
| name   | email            | pasword   | gender   | city   |
+--------+---------------------+----------+--------+--------+
| Vishal | Vishal@gmail.com | Vishal123 | Male     | indore |
+--------+------------------+-----------+----------+--------+
1 row in set (0.03 sec)


->After

mysql> select * from register;
+--------+------------------+-----------+--------+--------+
| name   | email            | pasword   | gender | city   |
+--------+------------------+-----------+--------+--------+
| vishal | vishal@gmail.com | vishal123 | male   | indore |
| Komal  | komal@gmail.com  | komal123  | female | indore |
+--------+------------------+-----------+--------+--------+
2 rows in set (0.02 sec)


*/
