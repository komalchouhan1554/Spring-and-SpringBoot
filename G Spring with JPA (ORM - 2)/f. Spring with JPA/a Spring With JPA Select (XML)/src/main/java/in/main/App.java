package in.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.dao.StudentDao;

public class App 
{
    @SuppressWarnings("resource")
	public static void main(String[] args) 
    {
    		ApplicationContext context = new ClassPathXmlApplicationContext("/in/resources/applicationContext.xml");
    		
    		StudentDao stdDao = (StudentDao) context.getBean("stdDaoImpl");
    		stdDao.searchStudent(2);
    }
}


// output:-

/*

Hibernate: select s1_0.std_id,s1_0.std_marks,s1_0.std_name,s1_0.std_roll from sprStd_deatils s1_0 where s1_0.std_id=?

-----------------------
Name: Priya Patel
RollNo: 102
Marks: 76.0
------------------------

*/
