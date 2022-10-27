package com.cg.injection.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/injection/interfaces/beans.xml");
		OrderBO b = (OrderBO) context.getBean("bo");
		b.placeorder();
	}

}
 