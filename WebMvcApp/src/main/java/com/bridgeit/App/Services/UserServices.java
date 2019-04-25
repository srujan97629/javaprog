package com.bridgeit.App.Services;

import com.bridgeit.App.Model.Login;
import com.bridgeit.App.Model.User;

public interface UserServices
{
   void register(User user);
   User validateUser(Login login);
}
	
