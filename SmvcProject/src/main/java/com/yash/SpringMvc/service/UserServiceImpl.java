package com.yash.SpringMvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.yash.SpringMvc.dao.UserDao;
import com.yash.SpringMvc.model.Login;
import com.yash.SpringMvc.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;

	public int register(User user) {
		return userDao.register(user);
	}

	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

}