package com.dsa.structures;

public class CircularQueueInt {

	private int arr[];
	private int capacity;
	private int rear, front;

	public CircularQueueInt(int c) {
		capacity = c;
		front = -1;
		rear = -1;
		arr = new int[capacity];
	}

	public void push(int value) {
		if (isFull()) {
			throw new RuntimeException("The queue is full!");
		} else {
			if (isEmpty()) {
				++front;
				arr[++rear] = value;
			} else if (rear == capacity - 1) {
				rear = 0;
				arr[rear] = value;
			} else {
				arr[++rear] = value;
			}
		}
		System.out.println("Inserted: " + value + ", Front: " + front + ", Rear: " + rear);
	}

	public int pop() {
		int e;
		if (isEmpty()) {
			throw new RuntimeException("The queue is empty!");
		} else {
			e = arr[front];
			if (rear == front) { // only 1 element so reset the queue
				rear = -1;
				front = -1;
			} else if (front == capacity - 1) { // front points to last element, so move it back to 0
				front = 0;
			} else { // simply move front one position
				front++;
			}
			System.out.println("Removed: " + e + ", Front: " + front + ", Rear: " + rear);
		}
		return e;
	}

	private boolean isEmpty() {
		return rear == -1 && front == -1;
	}

	private boolean isFull() {
		return (front == 0 && rear == capacity - 1) || front == rear + 1;
	}
}
