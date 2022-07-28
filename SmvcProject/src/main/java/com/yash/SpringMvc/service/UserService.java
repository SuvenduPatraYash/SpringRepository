package com.yash.SpringMvc.service;

import com.yash.SpringMvc.model.Login;
import com.yash.SpringMvc.model.User;

public interface UserService {

	int register(User user);

	User validateUser(Login login);
}