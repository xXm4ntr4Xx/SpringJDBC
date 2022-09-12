package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Book;

@Repository
public class BookDAOImplementation implements BookDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Book> showBook() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * from book",
				(rs,count) -> new Book(rs.getInt("id"),
																											rs.getString("title"),
																											rs.getString("author"),
																											rs.getInt("year"),
																											rs.getDouble("cost")));

	}
}
