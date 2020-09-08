package com.myboot.mvc.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myboot.mvc.model.MyUsers;

@Component
@Transactional
public class MyUsersDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public String saveUser(MyUsers myUsers) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(myUsers);
			return "User Created";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "User cannot be created";
	}
	
	public ArrayList<MyUsers> getUser() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from MyUsers");
			ArrayList<MyUsers> myUsers=(ArrayList<MyUsers>) query.list();
			return myUsers;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
