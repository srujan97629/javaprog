package com.bridgeit.DataStructures.utility;

public class Dequeue<T> {
	static int total = 100, rear = -1, front = -1;
	static String[] input = new String[total];

	public boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (rear == input.length) {
			return true;
		}
		return false;
	}

	public T addFront(String item) {
		if (isFull()) {
			System.out.println("Sorry no space");
		} else {
			if (isEmpty()) {
				front++;
				input[front] = item;
				rear++;
			} else {
				for (int i = rear + 1; i >= front; i--) {
					input[i + 1] = input[i];
				}
				input[front] = item;
				rear++;
			}
		}
		return null;
	}

	public T addRear(String item) {
		if (isFull()) {
			System.out.println("deque is full");
		} else {
			if (isEmpty()) {
				front++;
				rear++;
				input[rear] = item;
			} else {
				rear++;
				input[rear] = item;
			}

		}
		return null;
	}

	public String removeRear() {
		if (isEmpty()) {
			return "deque is empty";
		} else {
			String rearElement = input[rear];
			rear--;
			if (front > rear) {
				front = -1;
				rear = -1;
			}
			return rearElement;
		}
	}

	public String removeFront() {
		if (isEmpty()) {
			return "deque is empty";
		} else {
			String frontElement = input[front];
			front++;
			if (front > rear) {
				front = -1;
				rear = -1;
			}

			return frontElement;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("deque is empty");
		} else {
			for (int i = front; i <= rear; i++) {
				System.out.println(input[i]);
			}
		}
	}

	public int size() {
		if (isEmpty()) {
			return 0;
		} else {
			int length = rear - front + 1;

			return length;
		}
	}

	public String toString() {
		String result = "";
		result = "";
		for (int i = front; i <= rear; i++) {
			result = result + input[i];
		}

		return result;
	}

}
