package com.cg.hotel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/hotel/beans.xml");
		   Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
		
		
		
	}

}
