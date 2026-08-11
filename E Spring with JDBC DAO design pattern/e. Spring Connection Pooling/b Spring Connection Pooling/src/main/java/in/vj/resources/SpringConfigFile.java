package in.vj.resources;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public DataSource createDataSources() 
	{
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:mysql://localhost:3306/spring_jdbc");
		config.setUsername("root");
		config.setPassword("root");
		config.setMaximumPoolSize(5);
		
		HikariDataSource hickriDataSource = new HikariDataSource(config);
		return hickriDataSource;
	}

}
