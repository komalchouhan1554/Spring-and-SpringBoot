package in.main;

import in.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		try {

			Employee emp = entityManager.find(Employee.class, 2);


			System.out.println("----- Employee Details -----");
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("Age: "+emp.getEmpAge());
			System.out.println("Department: "+emp.getEmpDepartment());
			System.out.println("Gender: "+emp.getEmpGender());
			
		} catch (Exception e) {
			e.printStackTrace();
			
			System.out.println("Failed !!!");
		}
		finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	}
}

// Output:-

/*
 
Jun 11, 2026 11:55:09 AM org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
INFO: HHH008540: Processing PersistenceUnitInfo [name: main-persistence-unit]
Jun 11, 2026 11:55:09 AM org.hibernate.Version logVersion
INFO: HHH000001: Hibernate ORM core version 7.3.3.Final
Jun 11, 2026 11:55:09 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProvider configure
WARN: HHH10001002: Using built-in connection pool (not intended for production use)
Jun 11, 2026 11:55:10 AM org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator logConnectionInfo
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
Jun 11, 2026 11:55:12 AM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate: select e1_0.emp_id,e1_0.emp_age,e1_0.emp_department,e1_0.emp_gender,e1_0.emp_name from emp_details e1_0 where e1_0.emp_id=?

----- Employee Details -----
Name: Komal
Age: 21
Department: Computer
Gender: female
 
*/
