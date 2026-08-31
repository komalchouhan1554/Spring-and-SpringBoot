package in.main;

import in.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {

		Student std = new Student();
		std.setId(1);
		std.setName("Vishal");
		std.setEmail("vishal@gmail.com");
		std.setMarks(97.5f);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();

			entityManager.persist(std);

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
 
Jun 11, 2026 11:14:01 AM org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
INFO: HHH008540: Processing PersistenceUnitInfo [name: main-persistence-unit]
Jun 11, 2026 11:14:01 AM org.hibernate.Version logVersion
INFO: HHH000001: Hibernate ORM core version 7.3.3.Final
Jun 11, 2026 11:14:02 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProvider configure
WARN: HHH10001002: Using built-in connection pool (not intended for production use)
Jun 11, 2026 11:14:03 AM org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator logConnectionInfo
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
Jun 11, 2026 11:14:05 AM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate: create table std_marks (std_id integer not null, std_name varchar(255), std_email varchar(255), std_marks float(23), primary key (std_id)) engine=InnoDB
Hibernate: insert into std_marks (std_email,std_marks,std_name,std_id) values (?,?,?,?)

Success ...


---> Before <---

mysql> show tables;
Empty set (0.02 sec)

---> After <---

mysql> show tables;
+------------------+
| Tables_in_jpa_db |
+------------------+
| std_marks        |
+------------------+
1 row in set (0.00 sec)

mysql> desc std_marks;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| std_id    | int          | NO   | PRI | NULL    |       |
| std_name  | varchar(255) | YES  |     | NULL    |       |
| std_email | varchar(255) | YES  |     | NULL    |       |
| std_marks | float        | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
4 rows in set (0.01 sec)

mysql> select * from std_marks;
+--------+----------+------------------+-----------+
| std_id | std_name | std_email        | std_marks |
+--------+----------+------------------+-----------+
|      1 | Vishal   | vishal@gmail.com |      97.5 |
+--------+----------+------------------+-----------+
1 row in set (0.00 sec)
 
*/
