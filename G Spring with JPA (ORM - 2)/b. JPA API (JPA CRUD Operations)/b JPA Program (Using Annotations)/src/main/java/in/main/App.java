package in.main;

import in.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Komal");
		emp.setEmpAge(21);
		emp.setEmpGender("female");
		emp.setEmpDepartment("Computer");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();

			entityManager.persist(emp);

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
 
Jun 11, 2026 11:35:33 AM org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
INFO: HHH008540: Processing PersistenceUnitInfo [name: main-persistence-unit]
Jun 11, 2026 11:35:33 AM org.hibernate.Version logVersion
INFO: HHH000001: Hibernate ORM core version 7.3.3.Final
Jun 11, 2026 11:35:34 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProvider configure
WARN: HHH10001002: Using built-in connection pool (not intended for production use)
Jun 11, 2026 11:35:35 AM org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator logConnectionInfo
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
Jun 11, 2026 11:35:37 AM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate: create table emp_details (emp_id integer not null, emp_age integer, emp_department varchar(255), emp_gender varchar(255), emp_name varchar(255), primary key (emp_id)) engine=InnoDB
Hibernate: insert into emp_details (emp_age,emp_department,emp_gender,emp_name,emp_id) values (?,?,?,?,?)

Success ...


---> Before <---

mysql> show tables;
+------------------+
| Tables_in_jpa_db |
+------------------+
| std_marks        |
+------------------+
1 row in set (0.00 sec)

---> After <---


mysql> show tables;
+------------------+
| Tables_in_jpa_db |
+------------------+
| emp_details      |
| std_marks        |
+------------------+
2 rows in set (0.00 sec)

mysql> desc emp_details;
+----------------+--------------+------+-----+---------+-------+
| Field          | Type         | Null | Key | Default | Extra |
+----------------+--------------+------+-----+---------+-------+
| emp_id         | int          | NO   | PRI | NULL    |       |
| emp_age        | int          | YES  |     | NULL    |       |
| emp_department | varchar(255) | YES  |     | NULL    |       |
| emp_gender     | varchar(255) | YES  |     | NULL    |       |
| emp_name       | varchar(255) | YES  |     | NULL    |       |
+----------------+--------------+------+-----+---------+-------+
5 rows in set (0.00 sec)

mysql> select * from emp_details;
+--------+---------+----------------+------------+----------+
| emp_id | emp_age | emp_department | emp_gender | emp_name |
+--------+---------+----------------+------------+----------+
|      1 |      21 | Computer       | female     | Komal    |
+--------+---------+----------------+------------+----------+
1 row in set (0.00 sec)
 
*/
