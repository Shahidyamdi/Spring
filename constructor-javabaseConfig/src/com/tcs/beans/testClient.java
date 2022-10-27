package com.tcs.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarJavaConfig.class);
		Car car = context.getBean(Car.class);
		System.out.println(car);

	}

}
