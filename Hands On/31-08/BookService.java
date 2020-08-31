package com.myapp.service;

import com.myapp.dao.BookDao;
import com.myapp.model.Book;
import com.myapp.model.Publisher;

public class BookService {

	public static void main(String[] args) {
		Book book=new Book(101, "India 2020", "Abdul Kalam");
		Publisher publisher=new Publisher(111, "Penguin Books");
		book.setPublisher(publisher);
		BookDao dao=new BookDao();
		System.out.println(dao.saveBook(book));
		
	}

}
