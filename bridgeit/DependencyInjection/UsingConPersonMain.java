package com.bridgeit.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingConPersonMain 
{
     public static void main(String[] args)
     {
		ApplicationContext context=new ClassPathXmlApplicationContext("UsingConPersonBean.xml");
		UsingConPerson refBean=(UsingConPerson)context.getBean("person");
		System.out.println("Person Details");
		System.out.println(refBean);
	 }
}
