package com.tcs.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class ApplicationContextAwareImpl  implements ApplicationContextAware{

	private ApplicationContext applicationcontext;

	@Override
	public void setApplicationContext(ApplicationContext applicationcontext) throws BeansException {
		System.out.println("SetApplication method");
		this.applicationcontext = applicationcontext;
	}
	 public void displayPersonDetails(){
			Person person = (Person)applicationcontext.getBean("person");
	        System.out.println(person.getName());
	 }
	

}
