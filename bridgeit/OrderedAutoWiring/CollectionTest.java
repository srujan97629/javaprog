package com.bridgeit.OrderedAutoWiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollectionTest {
	public static void main(String[] args)
	{
         AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	      CollectionBean coll=context.getBean(CollectionBean.class);
	      coll.getNameList();
	}
}
