 package in.main;

import in.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class App {
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		try {
			
			entityTransaction.begin();
			
			String native_sql_query = "UPDATE std_details SET std_marks = :stdNewMarks WHERE std_id = :stdId";
			
			Query query = entityManager.createNativeQuery(native_sql_query,Student.class);	
			query.setParameter("stdId", 2);
			query.setParameter("stdNewMarks", 87.8f);
			
			int count = query.executeUpdate();
			
			if(count > 0)
			{
				System.out.println("Data updated succesfully. ❤️");
				entityTransaction.commit();
			}
			else
			{
				System.out.println("Data not updated !!!");
				entityTransaction.rollback();
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
			System.out.println("Failed !!!");
			entityTransaction.rollback();
		}
		finally 
		{
			entityManager.close();
			entityManagerFactory.close();
		}

	}
}

// Output:-

/*
 
---> Before <---

mysql> select * from std_details;
+--------+-----------+---------------+------------+
| std_id | std_marks | std_name      | std_rollno |
+--------+-----------+---------------+------------+
|      1 |      98.7 | Vishal Jadhav | 101        |
|      2 |        92 | Priya Patel   | 102        |
|      3 |      78.2 | Amit Verma    | 103        |
|      4 |        88 | Sneha Reddy   | 104        |
|      5 |      96.8 | Komal         | 105        |
+--------+-----------+---------------+------------+
5 rows in set (0.00 sec)

---> After <---

Hibernate: UPDATE std_details SET std_marks = ? WHERE std_id = ?

Data updated succesfully. ❤️

mysql> select * from std_details;
+--------+-----------+---------------+------------+
| std_id | std_marks | std_name      | std_rollno |
+--------+-----------+---------------+------------+
|      1 |      98.7 | Vishal Jadhav | 101        |
|      2 |      87.8 | Priya Patel   | 102        |
|      3 |      78.2 | Amit Verma    | 103        |
|      4 |        88 | Sneha Reddy   | 104        |
|      5 |      96.8 | Komal         | 105        |
+--------+-----------+---------------+------------+
5 rows in set (0.00 sec)

*/
