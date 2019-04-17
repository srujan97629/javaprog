package com.bridgeit.AutowireDependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByNameUserTest {
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("ByNameUserBean.xml");
		ByNameUser refBean = context.getBean("user",ByNameUser.class);
		System.out.println("User Details");
		System.out.println(refBean);
		ClassPathXmlApplicationContext refCon= (ClassPathXmlApplicationContext)context;
		refCon.close();
	}
}
