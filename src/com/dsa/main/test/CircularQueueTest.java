package com.dsa.main.test;

import com.dsa.structures.CircularQueueInt;

public class CircularQueueTest {

	public static void main(String[] args) {
		CircularQueueInt cq= new CircularQueueInt(5);
		
		cq.push(10);
		cq.push(11);
		cq.push(12);
		cq.push(13);
		cq.push(14);
		
		cq.pop();
		cq.pop();
		cq.pop();
		
		cq.push(20);
		cq.push(21);
		cq.push(22);
	
//		cq.push(23); // this should fail as queue is full
		
		cq.pop();
		cq.pop();
		cq.pop();
		cq.pop();
		cq.pop();
		
//		cq.pop(); // this should fail as queue is empty
	
	}
}
