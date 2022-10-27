package collectiondata;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collectiondata {
	List<String> names;
	Set<Integer> pincodes;
	Map<String, Integer> wordCount;
	Properties database;
	List<Book> books;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Set<Integer> getPincodes() {
		return pincodes;
	}

	public void setPincodes(Set<Integer> pincodes) {
		this.pincodes = pincodes;
	}

	public Map<String, Integer> getWordCount() {
		return wordCount;
	}

	public void setWordCount(Map<String, Integer> wordCount) {
		this.wordCount = wordCount;
	}

	public Properties getDatabase() {
		return database;
	}

	public void setDatabase(Properties database) {
		this.database = database;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
