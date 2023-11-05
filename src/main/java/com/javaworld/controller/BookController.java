package com.javaworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaworld.entity.Book;
import com.javaworld.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	
	@Autowired
	private BookService bookService;
	
	@PostMapping
	public Book saveBook(@RequestBody Book book){
		return bookService.saveBook(book);
	}

	@GetMapping
	public List<Book> getBooks(){
		return bookService.getBooks();
	}
	

}
