package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/applicationContext_hibernate.xml");

		CustomerDao custDao = (CustomerDao) context.getBean("custdao");
		Customer c = new Customer();
		c.setCno(1);
		c.setCname("ratan");
		c.setAddress("madhapur");
		c.setPhone(9000160099l);
		custDao.save(c);
		System.out.println("Record inserted successfully...");
	}
}
