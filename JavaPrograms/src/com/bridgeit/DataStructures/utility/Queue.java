package com.bridgeit.DataStructures.utility;

/******************************************************************************************
 * @purpose : To hold all the method of queue class
 * 
 * @author  : Srujan Madipeddi
 * @version : 1.0
 * @Date    : 19-03-2019
 ******************************************************************************************/

public class Queue<T> {

	LinkedList list = new LinkedList();
	private Object arr[];
	private int front;
	public int rear;
	public static int capacity;
	private int count;

	/* calling constructor to initializing array size */
	public Queue(int size) {
		arr = new Object[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}
	public static class Node<T> {
		T data;
		T next;

		Node(T d) {
			data = d;
			next = null;
		}
	}

	/**
	 * @purpose : to find objects are full are not in object
	 * @return : boolean
	 */

	public Boolean isFull() {
		return (size() == capacity);
	}

	public Boolean isEmpty() {
		return (size() == 0);
	}

	/**
	 * @param string : It takes string as command line arguments
	 * @purpose : To add a string element to object at front
	 * @return : void
	 */
	public void enQueue(T data) {
		

		if (isFull()) {
			System.out.println("No Space\n Program Terminated");
			System.exit(0);
		}

		// System.out.print(" "+ new_node.data);

		rear = (rear + 1) % capacity;
		arr[rear] = list.last(data);
		count++;
	}

	/**
	 * @purpose : to find no of elements in object
	 * @return : integer
	 */
	public int size() {
		return count; // returns the size of array
	}

	/**
	 * @purpose : To remove element
	 * @return : void
	 */
	public void deQueue() {
		if (isEmpty()) {
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		} else {
			System.out.println("Removing " + arr[front]);

			front = (front + 1) % capacity;
			count--;
		}
	}
	public void push(T new_data)
	{
		Node<T> new_node=new Node(new_data);

		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		}

		//System.out.print(" "+ new_node.data);
		//System.out.println(""+new_data);
		rear = (rear + 1) % capacity;
		arr[rear] =list.last(new_data);

		count++;
	}
	public void pop()
	{
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		else
		{
		System.out.println("Removing " + arr[front]);

		front = (front + 1) % capacity;
		  count--;
		}
	}

	/**
	 * @purpose : To display the elements in queue
	 * @return : void
	 */

	public void show() {
		// for loop to display all elements in queue
		for (int i = 0; i < count; i++) {
			System.out.print(arr[front + i] + " ");
		}
		System.out.println();
	}
}
