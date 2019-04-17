package com.bridgeit.AnnotationBased;

import org.springframework.beans.factory.annotation.Value;

public class SpellChecker
{

	@Value(value = "Checking Completed")
	String check;
	public SpellChecker()
	{
		
		System.out.println("Inside SpellChecker constructor");
	}

	public void checkSpelling()
	{
		System.out.println("Inside checkSpelling "+check);
	}
}
