package com.loginapp.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginapp.dao.IUserDAO;
import com.loginapp.dto.User;

@Named
public class UserService implements IUserService {
	
	@Inject
	IUserDAO userDAO;
	
	@Override
	public User filterUser(String filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) throws Exception {

		if (user.getUsername() == null || user.getUsername().isEmpty()) {
			throw new Exception("Username is empty");
		} else if (user.getPassword() == null || user.getPassword().isEmpty()) {
			throw new Exception("Password is empty");
		} else if (user.getName() == null || user.getName().isEmpty()) {
			throw new Exception("Name is empty");
		}
		
		userDAO.insertUser(user);
	
	}

}
