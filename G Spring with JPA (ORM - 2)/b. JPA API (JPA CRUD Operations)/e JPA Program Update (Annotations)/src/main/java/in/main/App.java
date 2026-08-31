package in.main;

import in.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();

			Employee emp = entityManager.find(Employee.class, 2);
			emp.setEmpName("Vishal J");
			emp.setEmpAge(23);
			emp.setEmpGender("male");
			
			// entityManager.merge(emp); // not needed because entity will be updated automatically.
			
			entityTransaction.commit();

			System.out.println("Success ...");
		} catch (Exception e) {
			e.printStackTrace();
			
			entityTransaction.rollback();
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
 
Jun 11, 2026 12:02:30 PM org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
INFO: HHH008540: Processing PersistenceUnitInfo [name: main-persistence-unit]
Jun 11, 2026 12:02:30 PM org.hibernate.Version logVersion
INFO: HHH000001: Hibernate ORM core version 7.3.3.Final
Jun 11, 2026 12:02:31 PM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProvider configure
WARN: HHH10001002: Using built-in connection pool (not intended for production use)
Jun 11, 2026 12:02:32 PM org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator logConnectionInfo
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
Jun 11, 2026 12:02:34 PM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate: select e1_0.emp_id,e1_0.emp_age,e1_0.emp_department,e1_0.emp_gender,e1_0.emp_name from emp_details e1_0 where e1_0.emp_id=?
Hibernate: update emp_details set emp_age=?,emp_department=?,emp_gender=?,emp_name=? where emp_id=?

Success ...


---> Before <---

mysql> select * from emp_details;
+--------+---------+----------------+------------+----------+
| emp_id | emp_age | emp_department | emp_gender | emp_name |
+--------+---------+----------------+------------+----------+
|      1 |      21 | Computer       | female     | Komal    |
|      2 |      21 | Computer       | female     | Komal    |
+--------+---------+----------------+------------+----------+
2 rows in set (0.00 sec)

---> After <---

mysql> select * from emp_details;
+--------+---------+----------------+------------+----------+
| emp_id | emp_age | emp_department | emp_gender | emp_name |
+--------+---------+----------------+------------+----------+
|      1 |      21 | Computer       | female     | Komal    |
|      2 |      23 | Computer       | male       | Vishal J |
+--------+---------+----------------+------------+----------+
2 rows in set (0.00 sec)
 
*/
