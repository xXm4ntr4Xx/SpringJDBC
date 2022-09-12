package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.model.Book;
import com.service.BookService;

@SpringBootApplication
public class SpringJdbcBookApplication implements CommandLineRunner {

	@Autowired 
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcBookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		List<Book> allBooks = bookService.showBook();
		
		
		System.out.println(allBooks);
		
	}

}
