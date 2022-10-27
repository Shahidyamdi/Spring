package com.tcs.collection.setter;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Address address1() {
		Address addr = new Address();
		addr.setCountry("machilipatnam");
		addr.setCity("india");
		return addr;
		
	}
	@Bean
	public Address address2() {
		Address addr = new Address();
		addr.setCity("vijayawada");
		addr.setCountry("india");
		return addr;
		
	}
	@Bean
	public Teacher teacherdata() {
		Teacher teacher = new Teacher();
		teacher.setAddress(List.of(address1(),address2()));
		teacher.setId(Set.of(3434,545,657,6868));
		teacher.setNames(List.of("ratan","anu","durga"));
		teacher.setYearsofExp(Map.of(2,"ratan",7,"durga",3,"lipika"));
		return teacher;
	}
	

}
