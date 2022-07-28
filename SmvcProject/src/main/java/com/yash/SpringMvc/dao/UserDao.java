package com.yash.SpringMvc.dao;

import com.yash.SpringMvc.model.Login;
import com.yash.SpringMvc.model.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}