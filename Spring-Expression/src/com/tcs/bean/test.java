package com.tcs.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SpringEl e =context.getBean("spel",SpringEl.class);
		System.out.println(e);
		
		Emp ee = context.getBean("emp",Emp.class);
		System.out.println(ee);
		
		Student eee =context.getBean("student",Student.class);
		System.out.println(eee);
		
		Product eeee =context.getBean("pro",Product.class);
		System.out.println(eeee);
		
		
	}

}
