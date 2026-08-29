package in.resources;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import in.dao.StudentDao;
import in.dao.StudentDaoImpl;

@Configuration
@EnableTransactionManagement
public class SpringConfigFile 
{
	@Bean
	public DriverManagerDataSource dmDataSources()
	{
		
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/Spring_hibernate_db");
		dmds.setUsername("root");
		dmds.setPassword("root");
		
		return dmds;
	}
	
	@Bean
	public LocalSessionFactoryBean mySessionFactory()
	{
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		
		lsfb.setDataSource(dmDataSources());
		
		Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto","update");
		hibernateProperties.setProperty("hibernate.show_sql","true");
		hibernateProperties.setProperty("hibernate.format_sql", "true");
		
		lsfb.setHibernateProperties(hibernateProperties);
		
		lsfb.setPackagesToScan("in.beans");		
		
		return lsfb;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager()
	{
		HibernateTransactionManager htm = new HibernateTransactionManager();
		
		htm.setSessionFactory(mySessionFactory().getObject());
		
		return htm;
	}
	
	@Bean
	public HibernateTemplate myHibernateTemplate()
	{
		HibernateTemplate  ht = new HibernateTemplate();
		
		ht.setSessionFactory(mySessionFactory().getObject());
		
		return ht;
	}
	
	
	@Bean
	public StudentDao stdDaoImplBean()
	{
		StudentDaoImpl stdDaoImpl = new StudentDaoImpl();
		
		stdDaoImpl.setHibernateTemplate(myHibernateTemplate());
		
		return stdDaoImpl;
	}
}













