package com.bridgeit.FactoryDesignPattern;

public class OperatingSystemFactory
{
   public Os operatingSystem(String passing)
   {
	   if(passing.equals("android"))
	   {
		   return new Android();
	   }
	   else if(passing.equals("ios"))
	   {
		   return new Ios();
	   }
	   else
	   {
		   return new Windows();
	   }
   }
}
