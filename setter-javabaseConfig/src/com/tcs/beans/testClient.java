package com.tcs.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarJavaConfig.class);
		Car car = context.getBean(Car.class);
		System.out.println(car.getCarDealer());

		Tesla tesla = (Tesla) context.getBean("tesla");
		System.out.println(tesla);
		Bently bently = (Bently) context.getBean("bently");
		System.out.println(bently);
		Porsche porsche = (Porsche) context.getBean("porsche");
		System.out.println(porsche);

	}

}
