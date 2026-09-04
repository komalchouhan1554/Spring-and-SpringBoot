 package in.main;

import java.util.List;

import in.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class App {
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		try {
			
			String native_sql_query = "SELECT * FROM std_details";
			
			Query query = entityManager.createNativeQuery(native_sql_query,Student.class);	
			
			List<Student> std_lst = query.getResultList();
			
			for (Student std: std_lst) 
			{
	
				System.out.println("--------------------------");
				System.out.println("Id: " + std.getId());
				System.out.println("Name: " + std.getName());
				System.out.println("Roll No: " + std.getRoll());
				System.out.println("Marks: " + std.getMarks());
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
			System.out.println("Failed !!!");
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
 
Hibernate: alter table std_details modify column std_rollno varchar(255)

Hibernate: SELECT * FROM std_details

--------------------------
Id: 1
Name: Vishal Jadhav
Roll No: 101
Marks: 98.7
--------------------------
Id: 2
Name: Priya Patel
Roll No: 102
Marks: 92.0
--------------------------
Id: 3
Name: Amit Verma
Roll No: 103
Marks: 78.2
--------------------------
Id: 4
Name: Sneha Reddy
Roll No: 104
Marks: 88.0
*/
