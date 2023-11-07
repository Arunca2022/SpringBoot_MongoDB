package com.javaworld.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javaworld.dto.BookDto;
import com.javaworld.entity.Book;
import com.javaworld.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	
	@Autowired
	private BookService bookService;
	
	
	ObjectMapper objectMapper = new ObjectMapper();
	
	@PostMapping
	public Book saveBook(@RequestBody BookDto bookDto){
		
		Book book = objectMapper.convertValue(bookDto, Book.class);
		return bookService.saveBook(book);
	}

	@GetMapping
	public List<BookDto> getBooks(){
		
		
		 List<Book> books = bookService.getBooks();
	     List<BookDto> bookDtos = books.stream()
	                .map(book -> objectMapper.convertValue(book, BookDto.class))
	                .collect(Collectors.toList());
		return bookDtos;
	}
	

}
