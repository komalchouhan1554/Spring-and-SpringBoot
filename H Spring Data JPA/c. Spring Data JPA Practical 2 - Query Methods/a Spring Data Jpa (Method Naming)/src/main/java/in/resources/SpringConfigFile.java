package in.resources;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("in.repository")
@ComponentScan(basePackages = {"in"})
public class SpringConfigFile 
{
	@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_data_jpa_db");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}
	
	
	// Name of method must be : entityManagerFactory()
	@Bean(name ="entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean lcemfb()
	{
		LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
		
		lcemfb.setDataSource(dataSource());
		
		lcemfb.setPackagesToScan("in.entity");
		
		lcemfb.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		
		lcemfb.setJpaProperties(hibernateProperties());
		
		lcemfb.setEntityManagerFactoryInterface(jakarta.persistence.EntityManagerFactory.class);

		return lcemfb;
	}
	
	public Properties hibernateProperties()
	{
		Properties pros = new Properties();
		
		pros.setProperty("hibernate.hbm2ddl.auto", "update");
		pros.setProperty("hibernate.show_sql", "true");
		
		return pros;
	}
	
	
	// Name of method must be : transactionManager()
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory)
	{
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager(entityManagerFactory);
		return jpaTransactionManager;
	}
}
