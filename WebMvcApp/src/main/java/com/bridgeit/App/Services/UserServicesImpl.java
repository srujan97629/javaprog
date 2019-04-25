package com.bridgeit.App.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeit.App.Dao.UserDao;
import com.bridgeit.App.Model.Login;
import com.bridgeit.App.Model.User;

public class UserServicesImpl implements UserServices {

	@Autowired
	UserDao userDao;

	@Override
	public void register(User user) {
		userDao.register(user);
	}

	@Override
	public User validateUser(Login login) {
		return userDao.validateUser(login);

	}

}