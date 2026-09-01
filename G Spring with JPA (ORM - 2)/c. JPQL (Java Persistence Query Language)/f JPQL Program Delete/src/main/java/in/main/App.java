 package in.main;

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
		entityTransaction.begin();
		
		try {
			
			String jpql_query = "DELETE FROM Student s WHERE s.id = :stdId";
			Query query = entityManager.createQuery(jpql_query);
			
			query.setParameter("stdId", 3);
			
			int count = query.executeUpdate();
			if(count > 0)
			{
				System.out.println("Success 🤖🤖🤖");
				entityTransaction.commit();
			}
			else
			{
				System.out.println("Fail !!!");
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

mysql> select * from std_marks;
+--------+------------------+-----------+----------+
| std_id | std_email        | std_marks | std_name |
+--------+------------------+-----------+----------+
|      1 | vishal@gmail.com |     98.88 | Vishal   |
|      2 | komal@gmail.com  |      89.7 | Komal    |
|      3 | rupesh@gmail.com |     94.48 | Rupesh   |
|      4 | chetan@gmail.com |     79.78 | chetan   |
+--------+------------------+-----------+----------+
4 rows in set (0.00 sec)


---> After <---

Hibernate: delete s1_0 from std_marks s1_0 where s1_0.std_id=?
Success 🤖🤖🤖

mysql> select * from std_marks;
+--------+------------------+-----------+----------+
| std_id | std_email        | std_marks | std_name |
+--------+------------------+-----------+----------+
|      1 | vishal@gmail.com |     98.88 | Vishal   |
|      2 | komal@gmail.com  |      89.7 | Komal    |
|      4 | chetan@gmail.com |     79.78 | chetan   |
+--------+------------------+-----------+----------+
3 rows in set (0.00 sec)

*/
