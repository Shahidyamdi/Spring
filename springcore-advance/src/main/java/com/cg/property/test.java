package com.cg.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/property/beans.xml");
		MyDAO dao =(MyDAO)context.getBean("mydao");
		System.out.println(dao);
	}

}
