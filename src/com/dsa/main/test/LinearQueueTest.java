package com.dsa.main.test;

import com.dsa.structures.seq.LinearQueueInt;

public class LinearQueueTest {

	public static void main(String[] args) {
		LinearQueueInt queue = new LinearQueueInt(5);
		
		System.out.println("Queue elements: " + queue.display());
		
		queue.push(10);
		queue.push(11);
		System.out.println("Queue elements: " + queue.display());
		
		System.out.println("Removed - " + queue.pop());
		System.out.println("Queue elements: " + queue.display());
		
		System.out.println("Removed - " + queue.pop());
		System.out.println(queue.display());
		
		queue.push(1);
		queue.push(2);
		System.out.println("Queue elements: " + queue.display());
		
		queue.push(45);
		queue.push(67);
		queue.push(87);
		System.out.println("Queue elements: " + queue.display());

		System.out.println("Removed - " + queue.pop());
		System.out.println("Removed - " + queue.pop());
		System.out.println("Removed - " + queue.pop());
		System.out.println("Removed - " + queue.pop());
		System.out.println("Queue elements: " + queue.display());
		
		// queue.push(87); -- this will cause error as Queue needs to be cleared before use

		
	}
}
