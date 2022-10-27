package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.company;
import com.cg.product;

public class test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("******************");
		
		product pro = context.getBean("pro",product.class);
		
		
		System.out.println("******product details*********");
		System.out.println("product id = "+ pro.getPid());
		System.out.println("product name = "+ pro.getPname());
		System.out.println("product cost = "+ pro.getPcost());
		
		System.out.println("********company details********");
		
		company company = context.getBean("company",company.class);
		System.out.println(" company name = "+company.getName());
		System.out.println(" company regid = "+company.getRegid());
		System.out.println(" company location = "+company.getLocation());
		
	}

}
