package in.resources;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import in.dao.StudentDaoImpl;
import in.service.StudentServiceImpl;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public DataSource createDataSourceObj()
	{
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/dao_db");
		dmds.setUsername("root");
		dmds.setPassword("root");
		return dmds;
	}
	
	// No need of this bean
//	@Bean
//	public JdbcTemplate createJdbcTemplateObj()
//	{
//		JdbcTemplate jdbcT = new JdbcTemplate();
//		jdbcT.setDataSource(createDataSourceObj());
//		return jdbcT;
//	}
	
	@Bean
	public StudentDaoImpl createStdDaoImplObj()
	{
		StudentDaoImpl stdDaoImpl = new StudentDaoImpl();
		stdDaoImpl.setDataSource(createDataSourceObj());
		return stdDaoImpl;
	}
	
	@Bean
	public StudentServiceImpl createStdServiceImplObj()
	{
		StudentServiceImpl stdImpl = new StudentServiceImpl();
		stdImpl.setStdDao(createStdDaoImplObj());
		return stdImpl;
	}
	
}
