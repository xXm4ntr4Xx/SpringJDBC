package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BookDAO;
import com.model.Book;

@Service
public class BookServiceImplementation implements BookService {

	@Autowired
	private BookDAO bookDAO;
	
	@Override
	public List<Book> showBook() {
		// TODO Auto-generated method stub
		return bookDAO.showBook();
	}

}
