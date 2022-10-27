package com.tcs.collection.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Teacher teacher = context.getBean(Teacher.class);
		System.out.println(teacher);
		
	}
}
