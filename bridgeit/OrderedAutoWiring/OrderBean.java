package com.bridgeit.OrderedAutoWiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderBean
{
	@Autowired(required=false)
   private List<Names> beanList;
	
   public void printBeanList()
   {
	   System.out.println(beanList);
   }
}
