package com.tcs.collection.constructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Address address1() {
		return new Address("machilipatnam", "india");

	}

	@Bean
	public Address address2() {
		return new Address("vijayawada", "india");

	}

	@Bean
	public Teacher teacherdata() {
		return new Teacher(Set.of(3434,545,657,6868),
				List.of("ratan","anu","durga"),
				Map.of(2,"ratan",7,"durga",3,"lipika"),
				List.of(address1(),address2()));
	}

}
