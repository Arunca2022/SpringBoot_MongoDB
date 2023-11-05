package com.javaworld.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.javaworld.entity.Book;


public interface BookService {
	
	public Book saveBook(@RequestBody Book book);
	public List<Book> getBooks();

}
