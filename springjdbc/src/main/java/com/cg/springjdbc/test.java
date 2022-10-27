package com.cg.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/springjdbc/db.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql ="insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, new Integer(1),"shahid","mohammed");
		int result1 = jdbcTemplate.update(sql, new Integer(2),"sameer","mohammed");
		System.out.println("number of records   inserted are : " +result1+result);
	}

}
