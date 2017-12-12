package com.example.demo.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "Book")

public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String bookName;
	String author;
	@Temporal(TemporalType.DATE)
	Date purchaseDate ;
	public Book(int id, String bookName, String author, Date purchaseDate) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.purchaseDate = purchaseDate;
	} 
	
	public Book(String bookName, String author, Date purchaseDate) {
		this.bookName = bookName;
		this.author = author;
		this.purchaseDate = purchaseDate;
	} 

	public Book()
	{}

	public Book(String string, String string2) {
		this.bookName = string;
		this.author = string2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", author=" + author + ", purchaseDate=" + purchaseDate
				+ "]";
	}
	
	
}
