package com.task.dxcusers.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.task.dxcusers.model.DxcUsers;

@Component
@Transactional
public class DxcUsersDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public String saveMethod(DxcUsers dxcUsers) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(dxcUsers);
			return "Created";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Cannot Create";
	}
	
	public ArrayList<DxcUsers> validateLogin(String username){
		try {
			Session session=sessionFactory.getCurrentSession();
			Criteria ct=session.createCriteria(DxcUsers.class);
			ct.add(Restrictions.like("username", username));
			ArrayList<DxcUsers> user=(ArrayList<DxcUsers>)ct.list();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public DxcUsers getDetails(int userId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			DxcUsers dxcUsers=session.get(DxcUsers.class, userId);
			return dxcUsers;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String updatePassword(int userId, String password) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("update DxcUsers set password=:password where userId=:userId");
			query.setParameter("userId", userId);
			query.setParameter("password", password);
			int res=query.executeUpdate();
			if(res>0)
				return "Updated";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Cannot update";
	}

}
