package com.tcs.collection.setter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Teacher teacher = context.getBean(Teacher.class);
		teacher.getId().forEach(id -> System.out.println(id));
		teacher.getNames().forEach(name -> System.out.println(name));
		teacher.getYearsofExp().forEach((k, v) -> System.out.println(k + " " + v));
		teacher.getAddress().forEach(addr -> System.out.println(addr.getCity() + " " + addr.getCountry()));
	}

}
