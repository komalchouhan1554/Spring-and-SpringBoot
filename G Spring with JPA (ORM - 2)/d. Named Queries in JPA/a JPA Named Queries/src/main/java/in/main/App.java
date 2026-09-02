package in.main;

import java.util.List;
import in.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class App 
{
    public static void main(String[] args) 
    {
    		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		try {
			
			TypedQuery<Student> query = entityManager.createNamedQuery("getAllStdDetails",Student.class);
			List<Student> std_lst = query.getResultList();

			for (Student std : std_lst) 
			{
				System.out.println("--------------------------");
				System.out.println("Id: " + std.getId());
				System.out.println("Name: " + std.getName());
				System.out.println("Roll NO: " + std.getRollno());
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
 

Hibernate: select s1_0.std_id,s1_0.std_marks,s1_0.std_name,s1_0.std_rollno from std_details s1_0
--------------------------
Id: 1
Name: Vishal Jadhav
Roll NO: 101
Marks: 98.7
--------------------------
Id: 2
Name: Priya Patel
Roll NO: 102
Marks: 92.0
--------------------------
Id: 3
Name: Amit Verma
Roll NO: 103
Marks: 78.2
--------------------------
Id: 4
Name: Sneha Reddy
Roll NO: 104
Marks: 88.0

 */