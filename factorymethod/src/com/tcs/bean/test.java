package com.tcs.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tcs/bean/beans.xml");
		Traveller t = context.getBean("data",Traveller.class);
		System.out.println(t.getDateTime());
		
	}

}
