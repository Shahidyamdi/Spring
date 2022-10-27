package com.cg.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.springjdbc.employee.Employee;
import com.cg.springjdbc.employee.dao.EmployeeDao;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/springjdbc/employee/test/db.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeedao");
		Employee employee = new Employee();
//		employee.setId(3);
//		employee.setFirstName("sameer");
//		employee.setLastName("mohammed");
//		
		
		
		//int result = dao.create(employee);
		//int result = dao.update(employee);
//		int result =dao.delete(3);
//		System.out.println("inserted row " +result);
		
//		Employee employee2 = dao.read(2);	
//		System.out.println("employee record :" +employee2);s
		
		
		List<Employee> query = dao.read();
		System.out.println("records"+query);
		
	}

} 
