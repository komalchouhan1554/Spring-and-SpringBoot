package in.vj.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public DriverManagerDataSource driverMangerDataSourceBean()
	{
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		dmds.setUsername("root");
		dmds.setPassword("root");
		
		return dmds;
	}
	
	@Bean
	public JdbcTemplate jdbcTempBean()
	{
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(driverMangerDataSourceBean());
		
		return jt;
	}
}
