package com.bridgeit.App.Dao;

import com.bridgeit.App.Model.Login;
import com.bridgeit.App.Model.User;

public interface UserDao
{	
  void register(User user);
  User validateUser(Login login);
  
}
