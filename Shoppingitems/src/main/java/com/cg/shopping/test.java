package com.cg.shopping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/shopping/bean.xml");
		ShoppingCart shop = (ShoppingCart) context.getBean("shop");
		System.out.println(shop.getItem());
	}

}
