package com.bridgeit.AnnotationAutowiring;

import org.springframework.stereotype.Component;

//@Component
public class Intel implements Processor
{

	String series;
	public Intel(String series)
	{
		this.series=series;
	}
	public void process() 
	{		
		System.out.println("Available Series are  "+series);
	}

}
