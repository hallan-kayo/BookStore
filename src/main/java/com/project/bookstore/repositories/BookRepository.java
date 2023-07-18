package com.project.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bookstore.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
