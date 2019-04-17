package com.bridgeit.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingSetterEmployeeMain 
{
 public static void main(String[] args) {
	
	  ApplicationContext context=new ClassPathXmlApplicationContext("UsingSetterBean.xml");
	   UsingSetterEmployee refEmployee=(UsingSetterEmployee)context.getBean("employee");
	   System.out.println(refEmployee);
}
  
}
