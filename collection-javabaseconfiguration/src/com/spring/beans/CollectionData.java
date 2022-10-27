package com.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CollectionData {
	private List<String> names;

	private Set<Integer> pincode;

	private Map<String, Integer> wordCount;

	private List<Book> books; // reference*/

	// get and set methods

	public List<String> getNames() {
		return names;
	}

	@Autowired
	public void setNames(List<String> names) {
		this.names = names;
	}

	public Set<Integer> getPincode() {
		return pincode;
	}

	@Autowired
	public void setPincode(Set<Integer> pincode) {
		this.pincode = pincode;
	}

	public Map<String, Integer> getWordCount() {
		return wordCount;
	}

	@Autowired
	public void setWordCount(Map<String, Integer> wordCount) {
		this.wordCount = wordCount;
	}

	public List<Book> getBooks() {
		return books;
	}

	@Autowired
	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
