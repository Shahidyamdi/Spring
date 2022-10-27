package com.tcs.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.springaop.Productservice;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tcs/springaop/test/beans.xml");
		Productservice productservice =(Productservice) context.getBean("productService");
		System.out.println(productservice.multiply(4, 5));
	}

}
