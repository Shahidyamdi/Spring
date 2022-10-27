package collectiondata;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collectiondata/beans.xml");
		//get the bean object 
				Collectiondata data = context.getBean("colldata",Collectiondata.class);
				List<String> names = data.getNames();
				System.out.println(names);
				System.out.println(names.getClass().getName());
				
				System.out.println("********");
				
				Set<Integer> pincodes = data.getPincodes();
				System.out.println(pincodes);
				System.out.println(pincodes.getClass().getName());
				
				System.out.println("********");
				
				Map<String, Integer> word = data.getWordCount();
				System.out.println(word);
				System.out.println(word.getClass().getName());
				
				System.out.println("********");
				Properties properties = data.getDatabase();
				System.out.println(properties.getProperty("username")+" "+properties.getProperty("password"));
				System.out.println(properties.getClass().getName());
				
				System.out.println("********");
				
				List<Book> books = data.getBooks();
				books.forEach(book->System.out.println(book.getId()+" "+book.getName()+" "+book.getAuthor()));
				System.out.println(books.getClass().getName());
			}
		



	

}
