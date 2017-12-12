package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService
{
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> findAllBooks() 
	{
		List<Book> list = new ArrayList<Book>();
		
		for (Book book : bookRepository.findAll()) 
		{
			list.add(book);
		} 
		return list;
	}
	
	public void addBook(Book book)
	{
		bookRepository.save(book);	
		
	}
	
}
