package com.bridgeit.OrderedAutoWiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
    public static void main(String[] args)
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
    	OrderBean coll=context.getBean(OrderBean.class);
	      coll.printBeanList();
	}
}
