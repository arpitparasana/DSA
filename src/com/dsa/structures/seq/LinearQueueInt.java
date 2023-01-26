package com.dsa.structures.seq;

/**
 * @author Arpit Parasana Implementation of Linear Queue with limitation where
 *         empty 'spots' in a queue can only be re-used after the queue is
 *         filled & cleared completely
 */

public class LinearQueueInt {

	private int arr[];
	private int r;
	private int f;
	private int capacity;

	public LinearQueueInt(int c) {
		arr = new int[c];
		r = -1;
		f = -1;
		capacity = c;
	}

	public void push(int v) {
		if (isFull()) {
			throw new RuntimeException("Queue is full!");
		} else if (isEmpty()) {
			f++;
		}
		arr[++r] = v;
	}

	public int pop() {
		int element;
		if (isEmpty()) {
			throw new RuntimeException("Queue is empty!");
		} else if (r == f) {
			element = arr[f];
			reset();
		} else {
			element = arr[f++];
		}
		return element;
	}

	private void reset() {
		r = -1;
		f = -1;
	}

	private boolean isEmpty() {
		return r == -1 && f == -1;
	}

	private boolean isFull() {
		return r == capacity - 1;
	}

	public String display() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		if(!isEmpty()) {
			for (int i = f; i <= r; i++) {
				sb.append(arr[i] + " ");
			}
		}
		return sb.append("]").toString();
	}
}
