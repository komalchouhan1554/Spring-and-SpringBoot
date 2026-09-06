package in.resources;

import java.util.Properties; 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import in.dao.StudentDaoImpl;
import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
public class SpringConfigFile 
{
	@Bean
	public DriverManagerDataSource dmDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jpa_db");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean lcemFactoryBean()
	{
		
		LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
		lcemfb.setDataSource(dmDataSource());
		lcemfb.setPackagesToScan("in.entity");
		lcemfb.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		
		// Other way is that we can create separate method for properties
		
		/*
		 * 
		Properties properties =  new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.show_sql", "true");
		lcemfb.setJpaProperties(properties);
		
		*/
		
		lcemfb.setJpaProperties(hibernateProperties());
		return lcemfb;
	}
	
	@Bean
	public Properties hibernateProperties()
	{
		Properties hibernateProperties =  new Properties();
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		
		return hibernateProperties;
	}
	
	@Bean
	public JpaTransactionManager jpaTransactionManager(EntityManagerFactory emf)
	{
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);
		
		return transactionManager;
	}
	
	@Bean
	public StudentDaoImpl stdDaoImpl()
	{
		return new StudentDaoImpl();
	}

}
