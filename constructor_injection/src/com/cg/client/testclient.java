package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.Emp;

public class testclient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		System.out.println("***********************************");
		Emp emp = context.getBean("emp",Emp.class);
		System.out.println(emp);

	}

}
