package com.tcs.Spring_JDBC_oracle;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		JdbcTemplate template = (JdbcTemplate) context.getBean(JdbcTemplate.class);
//		String sql ="insert into emp values(?,?,?)";
//		int result = template.update(sql, new Integer(555),"vijay","20000");
//		System.out.println("data inserted "+result);

		// insert query
		String query = "insert into student values(?,?,?)";
		int r1 = template.update(query, 111, "ratan", 99);
		int r2 = template.update(query, 222, "anu", 55.5);
		int r3 = template.update(query, 333, "durga", 30);
		System.out.println("Data inserted successfully...." + r1 + " " + r2 + " " + r3);

//		
//		// update query 
//		String updateQuery = "update student set smarks=smarks+2 where smarks<40";
//		  int updateCount = template.update(updateQuery);
//		 System.out.println("Records are updated...."+updateCount);

//		int[] res = template.batchUpdate
//				("insert into student values(1,'aaa',99)",
//				"insert into student values(2,'bbb',89)", 
//				"insert into student values(3,'ccc',79)");
//		for (int r : res) {
//			System.out.println(r);
//		}
		
		
		 Studentdao dao=(Studentdao)context.getBean("studentdao");  
		    List<Student> list=dao.getAllEmployees();  
		          
		    for(Student e:list)  
		        System.out.println(e);  

	}
}
