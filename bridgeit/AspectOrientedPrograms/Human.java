package com.bridgeit.AspectOrientedPrograms;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human
{
	@Value(value = "Do yoga")
	String value;
	@Before("execution (public void start())")
   public void morning()
   {
	   System.out.println("Wake up at 6'o clock  "+value);
   }
	@After("execution (public void start())")
   public void walking()
   {
	   System.out.println("walk for 1 hour");
   }
	@Primary @After("execution (public void start())")
   public void drinkWater()
   {
	   System.out.println("After wake up take some water ");
   }
}
