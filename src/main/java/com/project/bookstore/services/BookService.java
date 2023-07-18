package com.project.bookstore.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.bookstore.entities.Book;
import com.project.bookstore.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Transactional(readOnly = true)
	public List<Book> findAll(){
		List<Book> result = bookRepository.findAll();
		return result;
	}
	
	@Transactional(readOnly = true)
	public Book findById(Long id) {
		return bookRepository.findById(id).get();
	}
	
	public Book add(Book book) {
		return bookRepository.save(book);
	}
	
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
	
	public Book updateBook(Long id, Book book) {
		Book result = this.findById(id);
		BeanUtils.copyProperties(book, result, "id");
		return bookRepository.save(result);
	}
	
}
