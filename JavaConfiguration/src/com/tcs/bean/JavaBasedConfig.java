package com.tcs.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JavaBasedConfig {
	
	@Bean(name="emp")
	public Emp emp() {
		return new Emp();
		
	}
	@Bean
	public Student student()
	{	return new Student();
	}

}
