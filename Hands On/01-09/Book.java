package com.myapp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Book {
	@Id
	private int isbn;
	private String title;
	private String author;
	
	@Column(name="book_date")
	private Date date;

	@Transient
	int copiesOfBook;
	
	@Embedded
	Publisher publisher;
	
	@ElementCollection
	List<Distributor> distList;
	
	public Book(int isbn, String title, String author, Date date, int copiesOfBook, Publisher publisher,
			List<Distributor> distList) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.date = date;
		this.copiesOfBook = copiesOfBook;
		this.publisher = publisher;
		this.distList = distList;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getCopiesOfBook() {
		return copiesOfBook;
	}
	public void setCopiesOfBook(int copiesOfBook) {
		this.copiesOfBook = copiesOfBook;
	}
	public List<Distributor> getDistList() {
		return distList;
	}
	public void setDistList(List<Distributor> distList) {
		this.distList = distList;
	}
	public Book(int isbn, String title, String author, Date date) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.date = date;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(int isbn, String title, String author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", date=" + date + ", copiesOfBook="
				+ copiesOfBook + ", publisher=" + publisher + ", distList=" + distList + "]";
	}
	
}
