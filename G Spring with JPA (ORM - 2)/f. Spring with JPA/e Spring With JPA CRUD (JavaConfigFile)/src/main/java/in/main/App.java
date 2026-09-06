package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.dao.StudentDao;
// import in.entity.Student;
import in.resources.SpringConfigFile;

public class App 
{
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
    		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    		
    		StudentDao stdDao = (StudentDao) context.getBean("stdDaoImpl");
    		// stdDao.searchStudent(2);
    		
    		/*
    		 
    		Student std = new Student();
    		std.setId(7);
    		std.setName("Akshay Kumar");
    		std.setRoll(765);
    		std.setMarks(87.5f);
    		
    		stdDao.insertStudent(std);
    		
    		*/
    		
    		// stdDao.updateStudent(5, 98.4f);
    		
    		 stdDao.deleteStudnet(7);
    		
    }
}


// output:-

/*

===> Search Operation <===

Hibernate: select s1_0.std_id,s1_0.std_marks,s1_0.std_name,s1_0.std_roll from sprStd_deatils s1_0 where s1_0.std_id=?

-----------------------
Name: Priya Patel
RollNo: 102
Marks: 88.78
------------------------

====================================================================================================================================

===> Insert Operation

---> Before <---

mysql> select * from sprstd_deatils;
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

---> After <---

Data Inserted Successfully ⚔️⚔️⚔️

Hibernate: insert into sprStd_deatils (std_marks,std_name,std_roll,std_id) values (?,?,?,?)

mysql> select * from sprstd_deatils;
+--------+-----------+---------------+----------+
| std_id | std_marks | std_name      | std_roll |
+--------+-----------+---------------+----------+
|      1 |      89.5 | Rahul Sharma  |      101 |
|      2 |     88.78 | Priya Patel   |      102 |
|      3 |      91.2 | Amit Verma    |      103 |
|      5 |      95.8 | Komal Chauhan |      105 |
|      6 |      97.5 | Vishal Jadhav |      987 |
|      7 |      87.5 | Akshay Kumar  |      765 |
+--------+-----------+---------------+----------+
6 rows in set (0.00 sec)

====================================================================================================================================

===> Update Operation

---> Before <---

mysql> select * from sprstd_deatils;
+--------+-----------+---------------+----------+
| std_id | std_marks | std_name      | std_roll |
+--------+-----------+---------------+----------+
|      1 |      89.5 | Rahul Sharma  |      101 |
|      2 |     88.78 | Priya Patel   |      102 |
|      3 |      91.2 | Amit Verma    |      103 |
|      5 |      95.8 | Komal Chauhan |      105 |
|      6 |      97.5 | Vishal Jadhav |      987 |
|      7 |      87.5 | Akshay Kumar  |      765 |
+--------+-----------+---------------+----------+
6 rows in set (0.00 sec)

---> After <---

Hibernate: select s1_0.std_id,s1_0.std_marks,s1_0.std_name,s1_0.std_roll from sprStd_deatils s1_0 where s1_0.std_id=?

Data Updated Successfully ⚔️⚔️⚔️

Hibernate: update sprStd_deatils set std_marks=?,std_name=?,std_roll=? where std_id=?

mysql> select * from sprstd_deatils;
+--------+-----------+---------------+----------+
| std_id | std_marks | std_name      | std_roll |
+--------+-----------+---------------+----------+
|      1 |      89.5 | Rahul Sharma  |      101 |
|      2 |     88.78 | Priya Patel   |      102 |
|      3 |      91.2 | Amit Verma    |      103 |
|      5 |      98.4 | Komal Chauhan |      105 |
|      6 |      97.5 | Vishal Jadhav |      987 |
|      7 |      87.5 | Akshay Kumar  |      765 |
+--------+-----------+---------------+----------+
6 rows in set (0.00 sec)

====================================================================================================================================


===> Delete Operation

---> Before <---

mysql> select * from sprstd_deatils;
+--------+-----------+---------------+----------+
| std_id | std_marks | std_name      | std_roll |
+--------+-----------+---------------+----------+
|      1 |      89.5 | Rahul Sharma  |      101 |
|      2 |     88.78 | Priya Patel   |      102 |
|      3 |      91.2 | Amit Verma    |      103 |
|      5 |      98.4 | Komal Chauhan |      105 |
|      6 |      97.5 | Vishal Jadhav |      987 |
|      7 |      87.5 | Akshay Kumar  |      765 |
+--------+-----------+---------------+----------+
6 rows in set (0.00 sec)

---> After <---

Hibernate: select s1_0.std_id,s1_0.std_marks,s1_0.std_name,s1_0.std_roll from sprStd_deatils s1_0 where s1_0.std_id=?

Data Deleted Successfully ⚔️⚔️⚔️

Hibernate: delete from sprStd_deatils where std_id=?


mysql> select * from sprstd_deatils;
+--------+-----------+---------------+----------+
| std_id | std_marks | std_name      | std_roll |
+--------+-----------+---------------+----------+
|      1 |      89.5 | Rahul Sharma  |      101 |
|      2 |     88.78 | Priya Patel   |      102 |
|      3 |      91.2 | Amit Verma    |      103 |
|      5 |      98.4 | Komal Chauhan |      105 |
|      6 |      97.5 | Vishal Jadhav |      987 |
+--------+-----------+---------------+----------+
5 rows in set (0.00 sec)

*/
