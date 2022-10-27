package com.tcs.testclient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.beans.Entitlement;

public class testClient {
	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
		Entitlement eee = context.getBean("alias_ent", Entitlement.class);
		System.out.println(eee);
		
	}

}
