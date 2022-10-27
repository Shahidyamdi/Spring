package com.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClient {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		CollectionData data = context.getBean(CollectionData.class);

		List<String> names = data.getNames();
		System.out.println(names);

		Set<Integer> pincodes = data.getPincode();
		System.out.println(pincodes);

		Map<String, Integer> wordCount = data.getWordCount();
		System.out.println(wordCount);

//		List<Book> books = data.getBooks();
//		for (Book b : books) {
//			System.out.println(b.getBid() + " " + b.getBauthor() + " " + b.getBname());
//		}

	}

}
