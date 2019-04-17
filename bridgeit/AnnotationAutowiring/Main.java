package com.bridgeit.AnnotationAutowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);
         Autowiring md=context.getBean(Autowiring.class);
         md.visible();
         context.close();
	}
}
