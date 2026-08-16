package in.resources;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "in")
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
	
	@Bean
	public JdbcTemplate createJdbcTemplateObj()
	{
		JdbcTemplate jdbcT = new JdbcTemplate();
		jdbcT.setDataSource(createDataSourceObj());
		return jdbcT;
	}
}
