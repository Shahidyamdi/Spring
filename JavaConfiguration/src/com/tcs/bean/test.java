package com.tcs.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {
		ConfigurableApplicationContext  context = new AnnotationConfigApplicationContext(JavaBasedConfig.class);
		Emp e = context.getBean(Emp.class);
		e.disp();
		Student s = context.getBean(Student.class);
		s.info();
		s.hi();
		s.bye();
	}

}
