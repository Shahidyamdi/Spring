package com.tcs.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.Emp;
import com.tcs.Student;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("***************************************");
		
		Emp emp = context.getBean("emp",Emp.class);
		emp.empinfo();
		
		Student student = context.getBean("student",Student.class);
		student.studentinfo();
	}

}
