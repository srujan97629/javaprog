package com.bridgeit.BeanExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
		ApplicationContext context=new AnnotationConfigApplicationContext(Configure.class);
		Hostel ref=context.getBean(Hostel.class);
		System.out.println(ref);
	}
}
