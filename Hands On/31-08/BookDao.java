package com.myapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.myapp.model.Book;

public class BookDao {
	
	public String saveBook(Book book) {
		try {
			SessionFactory factory=new Configuration().configure().buildSessionFactory();
			Session session= factory.openSession();
			Transaction txn=session.beginTransaction();
			session.save(book);
			txn.commit();
			return "Book Saved";
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "Book cannot be saved";
	}
}
