package com.bridgeit.DataStructures.utility;

	public class StackGenerics<T> 
	{
		LinkedList list=new LinkedList();
		Node head;
		static int top;
		static Object[] arr;
		public static int size;

		public StackGenerics(int n)
		{
			top=-1;
			size=n;
			arr=new String[n];

		}
		boolean isEmpty()
		{
			return (top==-1);
		}

		public class Node<T>
		{
			T data;
			T next;

			Node(T value)
			{
				data=value;
				next=null;
			}
		}

		public boolean push(T value)
		{			
			if(top>size)
			{
				System.out.println("stack overflow");
				return false;
			}

			else
			{
				arr[++top]=list.push(value);				
				System.out.print(" "+arr[top]);
				return true;
			}			
		}
		
		public <T> Object pop()
		{	
			Node temp=head;
			Object s;
			if(top < 0)
			{
				//System.out.println("stack underflow");
				return null;
			}
			else
			{
			  s=arr[top--];
			 System.out.print(" "+s);
			return s;
			}		

		}
	}

