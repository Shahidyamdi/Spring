package com.cg.order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/cg/order/beans.xml");
		PaymentGateway pay =  (PaymentGateway) context.getBean("pay");
		System.out.println(pay);
	}

}
