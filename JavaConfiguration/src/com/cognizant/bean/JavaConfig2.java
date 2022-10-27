package com.cognizant.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JavaConfig2 {
	@Bean("beer")
	public Beer beer() {
		return new Beer();
	}

}
