package com.bridgeit.DataStructures;

import java.util.Scanner;

public class BankQ 
{
	static public String arr[];
	static public int front;
	static public int rear;
	static public int total;
	static public int count;
	static int totalAmount = 1000000;

	BankQ(int size) 
	{
		arr = new String[size];
		total = size;
		front = 0;
		rear = -1;
		count = 0;
	}
	public static int size()
	{
		return count;
	}

	static void queueDisplay() 
	{
		int i;
		if (front > rear)
		{
			System.out.println("Queue is Empty");
			return;
		}

		for (i = front; i <= rear; i++)
		{
			System.out.println(arr[i]);
		}
		return;
	}

	public static Boolean isEmpty()
	{
		return (size() == 0);
	}

	public static Boolean isFull() 
	{
		return (size() == total);
	}

	public static int withdraw(int money)
	{
		if (totalAmount > money) 
		{
			totalAmount = totalAmount - money;
			return totalAmount;
		} 
		else 
		{
			System.err.println(" Amount Exceeded ");
			return 0;
		}
	}

	public static int credit(int money)
	{
		totalAmount = totalAmount + money;
		return totalAmount;
	}

	public static void dequeue() 
	{
		if (isEmpty())
		{
			System.out.println("total amount in the bank is:" + totalAmount);
			System.out.println(" Transaction Successful ");

		}

		System.out.println("Removing from list  " + arr[front]);

		front = (front + 1) % total;
		count--;
	}

	public static void enqueue(String item)
	{

		if (isFull())
		{
			System.out.println("Sorry No Space to add users");

		}

		System.out.println("Adding to queue " + item);

		rear = (rear + 1) % total;
		arr[rear] = item;
		count++;
	}

	public static String peek()
	{
		if (isEmpty()) 
		{
			System.out.println("Transcaction over ");
			return null;
		}
		return arr[front];

	}

	public static String trancation(int n) 
	{
		Scanner sc = new Scanner(System.in);
		int money;
		if (isEmpty())
		{
			System.out.println(" Sorry List is Empty ");
			return null;
		}
		switch (n)
		{
		case 1:
			System.out.println("Enter how much Money to add into your account ");
			money = sc.nextInt();
			credit(money);
			System.out.println(peek() + "  is added in to your account  ");
			System.out.println("Total amount in your bank account is:" + totalAmount);
			break;
		case 2:
			System.out.println("Enter amount to withdraw ");
			money = sc.nextInt();
			withdraw(money);
			System.out.println(peek() + " is withdraw from your account ");
			System.out.println("Total amount in your bank account is:" + totalAmount);
			break;
		default:
			System.out.println("Enter valid details");

		}
		return arr[front];
		
	}
    
	

}