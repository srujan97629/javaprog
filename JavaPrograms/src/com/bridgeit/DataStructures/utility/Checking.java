package com.bridgeit.DataStructures.utility;

public class Checking 
{
     public static void main(String[] args)
     {
		//LinkedlistInt list=new LinkedlistInt(12);
		LinkedList<String> list=new LinkedList<String>();
		list.last("5");
		list.last("10");
		list.last("26");
		list.last("76");
		list.display();
		System.out.println("============");
	    list.delete("10");
		list.display();
	 }
     public static boolean isPalindrome(int number)
	   {
		   int temp=number;
		   int add=0;
		   while(number>0)
		   {
			 add=(add*10)+(number%10);
			
			 number=number/10;
		   }
		   if(add==temp)
		   {
			   return true;
		   }
		   else
		   {
		     return false;
		   }
	   }


}
