package com.tcs.bean;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Mycollection col = context.getBean("parentscollection", Mycollection.class);
		System.out.println("---Elements in parent bean---");
		Set<String> parentsset = col.getMySet();
		Iterator<String> itr = parentsset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("******************************************");

		Mycollection coll = context.getBean("childcollection", Mycollection.class);
		System.out.println("---Element in child bean");
		Set<String> childset = coll.getMySet();
		Iterator<String> itrs = childset.iterator();
		while (itrs.hasNext()) {
			System.out.println(itrs.next());
		}

	}
}
