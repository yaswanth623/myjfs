package com.tasktrial.passdemo.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tasktrial.passdemo.model.PassDemo;

@Component
@Transactional
public class PassDemoDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public String saveMethod(PassDemo passDemo) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(passDemo);
			return "Created";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Cannot create";
	}

	public ArrayList<PassDemo> validateLogin(String username) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Criteria ct=session.createCriteria(PassDemo.class);
			ct.add(Restrictions.like("username", username));
			ArrayList<PassDemo> player=(ArrayList<PassDemo>) ct.list();
			return player;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public PassDemo getDetails(int userId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			PassDemo passdemo=session.get(PassDemo.class, userId);
			return passdemo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String updatePassword(int userId, String password) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("update PassDemo set password=:password where userId=:userId");
			query.setParameter("userId", userId);
			query.setParameter("password", password);
			int res=query.executeUpdate();
			if(res>0)
				return "Updated";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Cannot Update";
	}
	
}
