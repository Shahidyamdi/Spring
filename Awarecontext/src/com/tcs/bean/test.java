package com.tcs.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
		
		Person pro = context.getBean("per" ,Person.class);
		System.out.println(pro.name);
		
		
	   
	}

}
