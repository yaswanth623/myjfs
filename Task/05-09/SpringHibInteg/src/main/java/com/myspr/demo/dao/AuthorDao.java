package com.myspr.demo.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.myspr.demo.Model.Author;

@Transactional
public class AuthorDao {


@Autowired
SessionFactory factory;


public AuthorDao() {
// TODO Auto-generated constructor stub
}


public AuthorDao(SessionFactory factory) {
super();
this.factory = factory;
}


public String saveAuthor(Author author){
try{
Session session=factory.getCurrentSession();
session.save(author);
return "Author Created";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "cannot create Author";
}


public ArrayList<Author> getByCity(String city){
	
	Session session=factory.openSession();
		/*
		 * Query
		 * query=session.createQuery("from author a where a.city= :cityParameter");
		 * query.setParameter("cityParameter", city);
		 */
	
	Criteria ct=session.createCriteria(Author.class);
	ct.add(Restrictions.ilike("city", city));
	
	ArrayList<Author> author=(ArrayList<Author>) ct.list();
	System.out.println(author);
	return author;
}


public ArrayList<Author> getByName(String authorName){
	
	Session session=factory.openSession();
	
	Criteria ct=session.createCriteria(Author.class);
	ct.add(Restrictions.ilike("authorName", authorName));
	
	ArrayList<Author> author=(ArrayList<Author>) ct.list();
	System.out.println(author);
	return author;
}

public String deleteAuthor(String authorName){
try{
Session session=factory.getCurrentSession();
Query query=session.createQuery("delete from Author a  where a.authorName=:authorname");
query.setParameter("authorname", authorName);
int count=query.executeUpdate();
if(count>0)
	return "Entry deleted";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "cannot delete entry";
}



public Author getAuthorById(int authorId){
try{
Session session=factory.getCurrentSession();
Author author=(Author)session.get(Author.class,authorId);
return author;
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return null;
}



public String updateAuthorById(Author author){
try{
Session session=factory.getCurrentSession();

System.out.println("author "+author);
session.update("Author",author);
return "Author Updated";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "Cannot Update Auhtor";
}

}