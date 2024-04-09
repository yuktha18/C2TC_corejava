package edu.atria.oops.dequeue;

import java.util.Deque;
import java.util.LinkedList;


public class DequeueDemo {

	public static void main(String[] args) {
		Deque<Integer> dq = new LinkedList<>();
		
		dq.add(4);
		dq.offer(3);
		dq.add(2);
		dq.add(1);
		
		System.out.println("Dequeue is: "+ dq);
		System.out.println("Dequeue is: "+ dq.remove());
		System.out.println("Dequeue is: "+ dq.element());
		System.out.println("Dequeue is: "+ dq);




	}

}
