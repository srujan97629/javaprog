package com.bridgeit.FactoryDesignPattern;

import java.util.Scanner;

public class FactoryMain
{
   public static void main(String[] args) 
   {
	  OperatingSystemFactory osf=new OperatingSystemFactory();
	  System.out.println("Enter name of the Os you need ");
	  Scanner scan=new Scanner(System.in);
	  String os=scan.next();
	  Os obj =osf.operatingSystem(os);	
	  obj.spec();
	  scan.close();
   }
}
