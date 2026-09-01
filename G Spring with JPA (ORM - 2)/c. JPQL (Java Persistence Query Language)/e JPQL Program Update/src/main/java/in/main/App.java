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
			
			String jpql_query = "UPDATE Student s SET s.marks = :newMarks WHERE s.id = :stdId";
			Query query = entityManager.createQuery(jpql_query);
			
			query.setParameter("newMarks", 89.7);
			query.setParameter("stdId", 2);
			
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

Hibernate: select s1_0.std_id,s1_0.std_email,s1_0.std_marks,s1_0.std_name from std_marks s1_0
--------------------------
Id: 1
Name: Vishal
Email: vishal@gmail.com
Marks: 98.88
--------------------------
Id: 2
Name: Komal
Email: komal@gmail.com
Marks: 94.48
--------------------------
Id: 3
Name: Rupesh
Email: rupesh@gmail.com
Marks: 94.48
--------------------------
Id: 4
Name: chetan
Email: chetan@gmail.com
Marks: 79.78


---> After <---

Hibernate: update std_marks s1_0 set std_marks=? where s1_0.std_id=?
Success 🤖🤖🤖

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

*/
