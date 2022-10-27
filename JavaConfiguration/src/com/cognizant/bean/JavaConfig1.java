package com.cognizant.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig1 {
	@Bean("demo")
	public Demo demo()
	{	return new Demo();
	}
	

}
