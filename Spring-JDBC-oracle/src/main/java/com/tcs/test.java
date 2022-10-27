package com.tcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.tcs.Spring_JDBC_oracle.JavaConfig;
import com.tcs.Spring_JDBC_oracle.Student;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		JdbcTemplate template = (JdbcTemplate) context.getBean(JdbcTemplate.class);
		StudentDAO student = (StudentDAO) context.getBean("studentdao");
		Student stud = new Student();
		stud.setSid(444);
		stud.setSname("sssss");
		stud.setSmarks(50);
		
		int x = student.create(stud);
		
		
		
		
		
		
		
	}

}
