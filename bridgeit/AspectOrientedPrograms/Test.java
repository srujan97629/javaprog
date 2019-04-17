package com.bridgeit.AspectOrientedPrograms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test
{
    public static void main(String[] args)
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		 Day refDay=context.getBean(Day.class);
		 refDay.start();
		 context.close();
	}
}
