package com.tcs.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tcs/bean/beans.xml");
		 ConfigData data = context.getBean("com",ConfigData.class);
		 System.out.println(data);
	}

}
