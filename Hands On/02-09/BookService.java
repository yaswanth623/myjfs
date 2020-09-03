package com.myapp.service;

import java.util.ArrayList;
import java.util.Date;

import com.myapp.dao.BookDao;
import com.myapp.model.Book;
import com.myapp.model.Distributor;
import com.myapp.model.Publisher;

public class BookService {

	public static void main(String[] args) {
		/*Book book=new Book(103, "Outliers", "Malcolm Gladwell",new Date());
		book.setCopiesOfBook(10);
		Publisher publisher=new Publisher(111, "Penguin Books");
		book.setPublisher(publisher);
		
		ArrayList<Distributor> distList=new ArrayList();
		distList.add(new Distributor(3, "Rohit", "Hyderabad"));
		distList.add(new Distributor(4, "Rahul", "Bijapur"));

		book.setDistList(distList);*/
		
		BookDao dao=new BookDao();
		Book book=new Book(200, "ABC", "XYZ",new Date());
		book.setCopiesOfBook(10);
		Publisher publisher=new Publisher(161, "IJK");
		book.setPublisher(publisher);
		dao.saveBook(book);
		
		/*System.out.println(dao.saveBook(book));
		ArrayList<Book> books=(ArrayList<Book>)dao.getBooks();
		
		for(Book book:books){
			System.out.println(book);
		}*/
		/*BookDao dao=new BookDao();
		ArrayList<Book> books=(ArrayList<Book>)dao.filterBooks();

		for(Book book1:books){
		System.out.println(book1);*/
		}
		
	}


