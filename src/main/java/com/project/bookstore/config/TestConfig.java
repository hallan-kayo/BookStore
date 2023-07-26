package com.project.bookstore.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.bookstore.entities.Book;
import com.project.bookstore.entities.Category;
import com.project.bookstore.repositories.BookRepository;
import com.project.bookstore.repositories.CategoryRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Category c1 = new Category(null, "Redes de computadores");
		Category c2 = new Category(null, "Linguagem de programação");
		Category c3 = new Category(null, "Diversos");
		Category c4 = new Category(null, "Banco de Dados");
		
		categoryRepository.saveAll(Arrays.asList(c1,c2,c3,c4));
		
		Book b1 = new Book(null,"Código limpo, Habilidades práticas do Agile Software", "Robert C. Martin", 2009, 1);
		Book b2 = new Book(null,"Redes de Computadores", "Tanenbaum, Feamster & Wetherall", 2021, 6);
		Book b3 = new Book(null,"Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curioso", "Aditya Y. Bhargava", 2017, 1);
		Book b4 = new Book(null,"Introdução à Linguagem SQL: Abordagem Prática Para Iniciantes", "Thomas Nield", 2016, 1);
		Book b5 = new Book(null,"Data Science Do Zero: Noções Fundamentais com Python", "Joel Grus", 2021, 2);
		Book b6 = new Book(null,"Inteligência Artificial - Do Zero ao Metaverso", "	Martha Gabriel", 2022, 1);
		Book b7 = new Book(null,"Desenvolvimento Real de Software: Um guia de projetos para fundamentos em Java", "Raoul-Gabriel Urma & Richard Warburton", 2021, 1);
		Book b8 = new Book(null,"Aprendendo Node: Usando JavaScript no Servidor", "Shelley Powers", 2017, 1);
		Book b9 = new Book(null,"Como ser um Programador Melhor: um Manual Para Programadores que se Importam com Código", "Pete Goodliffe", 2009, 1);
		
		bookRepository.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8,b9));
		
		b1.setCategory(c3);
		b2.setCategory(c1);
		b3.setCategory(c2);
		b4.setCategory(c4);
		b5.setCategory(c2);
		b6.setCategory(c3);
		b7.setCategory(c2);
		b8.setCategory(c2);
		b9.setCategory(c3);
		
		bookRepository.saveAll(Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8,b9));
		
	}
	
	

}
