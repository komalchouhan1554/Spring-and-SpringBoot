package in.main;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class App {
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		try {
			
			String jpql_query = "SELECT s.id, s.name FROM Student s";
			
			// Typed Query
			TypedQuery<Object[]> query = entityManager.createQuery(jpql_query,Object[].class);	
			
			List<Object[]> obj_lst = query.getResultList();
			
			for (Object[] obj: obj_lst) 
			{
				int id = (int) obj[0];
				String name = (String) obj[1];
				
				System.out.println("--------------------------");
				System.out.println("Id: " + id);
				System.out.println("Name: " + name);
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
 
Jun 13, 2026 3:00:19 PM org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
INFO: HHH008540: Processing PersistenceUnitInfo [name: main-persistence-unit]
Jun 13, 2026 3:00:19 PM org.hibernate.Version logVersion
INFO: HHH000001: Hibernate ORM core version 7.3.3.Final
Jun 13, 2026 3:00:20 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProvider configure
WARN: HHH10001002: Using built-in connection pool (not intended for production use)
Jun 13, 2026 3:00:21 PM org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator logConnectionInfo
INFO: HHH10001005: Database info:
	Database JDBC URL [jdbc:mysql://localhost:3306/jpa_db]
	Database driver: MySQL Connector/J
	Database dialect: MySQLDialect
	Database version: 8.0.45
	Default catalog/schema: jpa_db/undefined
	Autocommit mode: false
	Isolation level: REPEATABLE_READ
	JDBC fetch size: none
	Pool: DriverManagerConnectionProvider
	Minimum pool size: 1
	Maximum pool size: 20
Jun 13, 2026 3:00:23 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate: select s1_0.std_id,s1_0.std_name from std_marks s1_0
--------------------------
Id: 1
Name: Vishal
--------------------------
Id: 2
Name: Prafull
--------------------------
Id: 3
Name: komal
--------------------------
Id: 4
Name: Suraj
 
*/
