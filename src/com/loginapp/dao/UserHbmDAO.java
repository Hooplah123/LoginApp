package com.loginapp.dao;
import javax.inject.Named;

import org.hibernate.Session;

import com.loginapp.dto.User;

@Named
public class UserHbmDAO implements IUserDAO {

	@Override
	public void insertUser(User user) throws Exception {
		// save the plant to the database
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(user);
		
		session.getTransaction().commit();
		
	}

	@Override
	public void update(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User fetchUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
