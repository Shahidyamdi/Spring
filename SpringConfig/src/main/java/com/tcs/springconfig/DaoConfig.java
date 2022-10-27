package com.tcs.springconfig;

import org.springframework.context.annotation.Bean;

public class DaoConfig {
	@Bean
	public Dao dao() {
		return new Dao();
	}

}
