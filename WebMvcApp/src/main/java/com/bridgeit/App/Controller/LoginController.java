package com.bridgeit.App.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.App.Model.Login;
import com.bridgeit.App.Model.User;
import com.bridgeit.App.Services.UserServices;

@Controller
public class LoginController 
{
	@Autowired
	   public UserServices userService;
		
		@RequestMapping(value="/login",method=RequestMethod.GET)
		public ModelAndView showLogin(HttpServletRequest request,HttpServletResponse responce)
		{
			ModelAndView refModel=new ModelAndView("login");
			refModel.addObject("login", new Login());
			return refModel;
		}
		@RequestMapping(value="/loginProcess",method=RequestMethod.POST)
		public ModelAndView loginProcess(HttpServletRequest request,HttpServletResponse responce,
				@ModelAttribute("login") Login login)
		{
			ModelAndView refModel=null;
			User user=userService.validateUser(login);
			if(null!=user)
			{
				refModel=new ModelAndView("welcome");
				refModel.addObject("fristname",user.getFirstname());
			}
			else
			{
				refModel=new ModelAndView("login");
				refModel.addObject("message","username or password wrong");
			}
			return refModel;
			
		}
}













