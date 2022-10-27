package com.tcs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class JavaConfig {
	
	@Bean
	public DriverManagerDataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	    dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	    dataSource.setUsername("system");
	    dataSource.setPassword("shahid");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate template()
	{	 JdbcTemplate jdbcTemplate = new JdbcTemplate();
		 jdbcTemplate.setDataSource(dataSource());
		 return jdbcTemplate;
	}
	
	

}
