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
			
			String native_sql_query = "DELETE FROM std_details WHERE std_id = :stdId";
			
			Query query = entityManager.createNativeQuery(native_sql_query,Student.class);	
			query.setParameter("stdId", 4);
			
			int count = query.executeUpdate();
			
			if(count > 0)
			{
				System.out.println("Data deleted. ❤️");
				entityTransaction.commit();
			}
			else
			{
				System.out.println("Data not deleted !!!");
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
|      2 |      87.8 | Priya Patel   | 102        |
|      3 |      78.2 | Amit Verma    | 103        |
|      4 |        88 | Sneha Reddy   | 104        |
|      5 |      96.8 | Komal         | 105        |
+--------+-----------+---------------+------------+
5 rows in set (0.00 sec)

---> After <---

Hibernate: DELETE FROM std_details WHERE std_id = ?

Data deleted. ❤️

mysql> select * from std_details;
+--------+-----------+---------------+------------+
| std_id | std_marks | std_name      | std_rollno |
+--------+-----------+---------------+------------+
|      1 |      98.7 | Vishal Jadhav | 101        |
|      2 |      87.8 | Priya Patel   | 102        |
|      3 |      78.2 | Amit Verma    | 103        |
|      5 |      96.8 | Komal         | 105        |
+--------+-----------+---------------+------------+
5 rows in set (0.00 sec)

*/
