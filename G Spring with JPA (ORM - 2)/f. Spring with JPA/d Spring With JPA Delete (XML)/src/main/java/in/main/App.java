package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.dao.StudentDao;
 // import in.entity.Student;

public class App 
{
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
    		ApplicationContext context = new ClassPathXmlApplicationContext("/in/resources/applicationContext.xml");
    		
    		StudentDao stdDao = (StudentDao) context.getBean("stdDaoImpl");
    		// stdDao.searchStudent(2);
    		
    		/*
    		 
    		Student std = new Student();
    		std.setId(6);
    		std.setName("Vishal Jadhav");
    		std.setRoll(987);
    		std.setMarks(97.5f);
    		
    		stdDao.insertStudent(std);
    		
    		*/
    		
    		// stdDao.updateStudent(2, 88.78f);
    		
    		stdDao.deleteStudnet(4);
    		
    }
}


// output:-

/*

---> Before <---

mysql> select * from  sprstd_deatils;
+--------+-----------+---------------+----------+
| std_id | std_marks | std_name      | std_roll |
+--------+-----------+---------------+----------+
|      1 |      89.5 | Rahul Sharma  |      101 |
|      2 |     88.78 | Priya Patel   |      102 |
|      3 |      91.2 | Amit Verma    |      103 |
|      4 |      84.7 | Sneha Singh   |      104 |
|      5 |      95.8 | Komal Chauhan |      105 |
|      6 |      97.5 | Vishal Jadhav |      987 |
+--------+-----------+---------------+----------+
6 rows in set (0.00 sec)

---> After <---

Hibernate: select s1_0.std_id,s1_0.std_marks,s1_0.std_name,s1_0.std_roll from sprStd_deatils s1_0 where s1_0.std_id=?

Data Deleted Successfully ⚔️⚔️⚔️

Hibernate: delete from sprStd_deatils where std_id=?

mysql> select * from  sprstd_deatils;
+--------+-----------+---------------+----------+
| std_id | std_marks | std_name      | std_roll |
+--------+-----------+---------------+----------+
|      1 |      89.5 | Rahul Sharma  |      101 |
|      2 |     88.78 | Priya Patel   |      102 |
|      3 |      91.2 | Amit Verma    |      103 |
|      5 |      95.8 | Komal Chauhan |      105 |
|      6 |      97.5 | Vishal Jadhav |      987 |
+--------+-----------+---------------+----------+
5 rows in set (0.00 sec)

*/
