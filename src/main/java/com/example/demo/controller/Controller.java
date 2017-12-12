package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Book;
import com.example.demo.service.BookService;

@RestController
public class Controller {

	@Autowired
	private BookService service;
	
	@RequestMapping("/")
	public String first() 
	{
		return "timepass";

	}
	@RequestMapping("/findAllBooks")
	public List<Book> getAllBooks()
	{
		service.addBook(new Book("Arpi" , "Arpit"));
		return service.findAllBooks(); 
	}
	
}
