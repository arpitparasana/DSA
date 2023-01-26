package com.dsa.structures.seq;

public class StackOfChar {

	private char arr[];
	private int top;
	private int capacity;

	public StackOfChar(int c) {
		this.arr = new char[c];
		this.top = -1;
		this.capacity = c;
	}

	public void push(char c) {
		if (isFull()) {
			throw new RuntimeException("Stack is full!");
		}
		arr[++this.top] = c;
	}

	public char pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty!");
		}
		return arr[top--];
	}

	private boolean isEmpty() {
		return top == -1;
	}

	private boolean isFull() {
		return top == capacity - 1;
	}

	private int size() {
		return top + 1;
	}

	public String display() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		for (int i = 0; i <= top; i++) {
			sb.append(arr[i] + " ");
		}
		sb.append("]");
		return sb.toString();
	}
}
