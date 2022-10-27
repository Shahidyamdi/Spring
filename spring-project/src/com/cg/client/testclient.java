package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.Marks;
import com.cg.Student;



public class testclient {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		System.out.println("***********************************");
		Student stud = context.getBean("stud",Student.class);
		System.out.println(stud.getRollNo());
		System.out.println(stud.getStudentName());
		
		


        System.out.println("************individual marks****************");
        Marks marks=stud.getMarks();
        System.out.println("maths: "+marks.getMaths());
        System.out.println("science: "+marks.getScience());
        System.out.println("social "+marks.getSocial());

        System.out.println("************total marks****************");
        int mat=marks.getMaths();
        int soc=marks.getSocial();
        int sci=marks.getScience();

        int sum= mat+soc+sci;
        System.out.println("Total marks: " + sum);
        
        
        
        System.out.println("************total marks average****************");
        
        int average = mat+soc+sci;
        System.out.println("Average ......"+average/3);
    }

	}


