package com.dsa.structures.seq;

public class StackOfInt {

	private int arr[];
	private int top;
	private int capacity;
	
	public StackOfInt(int c) {
		this.top = -1;
		this.capacity = c;
		arr = new int[this.capacity];
	}
	
	public void push(int value) {
		if(isFull()) {
			throw new RuntimeException("Stack is full");
		} else {
			arr[++top] = value;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return arr[top--];
	}
	
	private boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}
	
	public int size() {
		return top + 1;
	}
	
}
