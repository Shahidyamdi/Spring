package com.spring.beans;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfig {
	@Bean
	public Book book1() {
		Book book = new Book();
		book.setBname("eyx");
		book.setBid(234);
		book.setBauthor("eiopp");
		return book;
	}

	@Bean
	public Book book2() {
		Book books = new Book();
		books.setBname("hyeo");
		books.setBid(4590);
		books.setBauthor("rtiona");
		return books;
	}

	@Bean
	public List<Book> getBooks() {
		List<Book> book = new ArrayList<>();
		book.add(book1());
		book.add(book2());
		return book;
	}

	@Bean
	public List<String> getNames() {

		List<String> names = new ArrayList<String>();
		names.add("Ratan");
		names.add("anu");
		names.add("Durga");
		return names;
	}

	@Bean
	public Set<Integer> getPincode() {
		Set<Integer> pincodes = new LinkedHashSet<>();
		pincodes.add(234);
		pincodes.add(345);
		pincodes.add(567);
		return pincodes;
	}

	@Bean
	public Map<String, Integer> getWordCount() {
		Map<String, Integer> wordCount = new LinkedHashMap<>();
		wordCount.put("June", 4);
		wordCount.put("tuesday", 8);
		wordCount.put("saturday", 10);
		return wordCount;
	}

	@Bean
	public CollectionData getCollectionData() {
		CollectionData collectionData = new CollectionData();

		collectionData.setNames(getNames());
		collectionData.setPincode(getPincode());
		collectionData.setWordCount(getWordCount());
		collectionData.setBooks(getBooks());
		return collectionData;
	}

}
