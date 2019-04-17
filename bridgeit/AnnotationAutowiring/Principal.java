package com.bridgeit.AnnotationAutowiring;

import org.springframework.stereotype.Component;

@Component
public class Principal 
{
   public void details()
   {
	   System.out.println("I am principal of this college");
	   System.out.println("My name is dude");
   }
}
