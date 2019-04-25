package com.bridgeit.App.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.App.Model.User;
import com.bridgeit.App.Services.UserServices;

@Controller
public class RegistrationController 
{
	@Autowired
   public UserServices userService;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request,HttpServletResponse responce)
	{
		ModelAndView refModel=new ModelAndView("register");
		refModel.addObject("user", new User());
		return refModel;
	}
	
	@RequestMapping(value="/registerProcess",method=RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request,HttpServletResponse responce,
			@ModelAttribute("user") User user )
	{
		userService.register(user);
		
		return new ModelAndView("Welcome","firstname",user.getFirstname());
	}
   
}
