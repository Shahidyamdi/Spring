package com.cognizant.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig1.class,JavaConfig2.class);
		Demo d = context.getBean(Demo.class);
		d.info();
		Beer b = context.getBean(Beer.class);
		b.info();
	}

}
