package com.bridgeit.AnnotationAutowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SportTeacher implements Teacher 
{
 public void teach()
	{
		
        System.out.println("I am your sport trainer");
        System.out.println("Dhoni");
	}

}
