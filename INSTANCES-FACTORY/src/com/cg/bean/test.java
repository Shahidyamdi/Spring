package com.cg.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("com/cg/bean/beans.xml");
		Demo d =(Demo)context.getBean("demo");
		d.disp();
	}

}
