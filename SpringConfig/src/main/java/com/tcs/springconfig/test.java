package com.tcs.springconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		//Dao dao = context.getBean(Dao.class);
		Service service  = context.getBean(Service.class);
		service.save();
		context.close();
	}

}
