package com.bridgeit.OrderedAutoWiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MapTest 
{
   public static void main(String[] args)
   {

   	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
   	MapBean coll=context.getBean(MapBean.class);
	      coll.printNameMap();
   }
}
