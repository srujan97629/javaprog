package com.bridgeit.SingleTonLink;

public class BillPughSingletonMain
{
     public static void main(String[] args)
     {
	    BillPughSingleton bs=BillPughSingleton.getInstance();
	    System.out.println(""+bs.hashCode());
	    BillPughSingleton bs2=BillPughSingleton.getInstance();
	    System.out.println(""+bs2.hashCode());
	 }
}
