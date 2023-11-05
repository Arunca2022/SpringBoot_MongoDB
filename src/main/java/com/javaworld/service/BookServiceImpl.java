package com.javaworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaworld.entity.Book;
import com.javaworld.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository repository;

	@Override
	public Book saveBook(Book book) {

		return repository.save(book);
	}

	@Override
	public List<Book> getBooks() {

		return repository.findAll();
	}

}
