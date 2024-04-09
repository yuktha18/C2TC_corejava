package edu.atria.oops.priorityqueuedemo;

import java.util.PriorityQueue;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(4);
		pq.offer(3);
		pq.add(2);
		pq.add(1);
		
		System.out.println(pq);
	}

}
