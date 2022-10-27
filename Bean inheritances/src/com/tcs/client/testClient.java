package com.tcs.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.beans.Speakers;

public class testClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Speakers sp1 = context.getBean("sp1", Speakers.class);
		System.out.println(sp1);

		Speakers sp2 = context.getBean("sp2", Speakers.class);
		System.out.println(sp2);

		Speakers sp3 = context.getBean("sp3", Speakers.class);
		System.out.println(sp3);

		Speakers sp4 = context.getBean("sp4", Speakers.class);
		System.out.println(sp4);
	}
}
