package com.javaworld.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javaworld.entity.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
