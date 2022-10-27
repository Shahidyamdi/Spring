package com.cg.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/autowiring/annotation/beans.xml");
		   Employee employee = (Employee) context.getBean("emp");
		System.out.println(employee);
		
		
		
	}

}
