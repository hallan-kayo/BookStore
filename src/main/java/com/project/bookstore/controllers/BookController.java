package com.project.bookstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bookstore.entities.Book;
import com.project.bookstore.services.BookService;

@RestController
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping
	public List<Book> findAll(){
		return bookService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Book findById(@PathVariable Long id) {
		return bookService.findById(id);
	}
}
