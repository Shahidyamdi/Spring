package com.cg.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/autowiring/beans.xml");
		   Employee employee = (Employee) context.getBean("emp");
		System.out.println(employee);
		
		
		
	}

}
