package com.bridgeit.AnnotationAutowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Autowiring 
{
	@Autowired
    Processor pro;
	
	public void visible()
	{
		pro.process();
	}
}
