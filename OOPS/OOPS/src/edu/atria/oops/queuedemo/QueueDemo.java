package edu.atria.oops.queuedemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> qu = new LinkedList<>();
		
		qu.add(4);
		qu.offer(3);
		qu.add(2);
		qu.offer(1);
		
		System.out.println("Queue Content is: "+ qu);
		System.out.println("Removed Queue element is: "+ qu.remove());
		System.out.println("Queue Content is: "+ qu);
		System.out.println("Queue size is: "+ qu.size());
		qu.clear();
		System.out.println("Queue peek element is: "+ qu.peek());
		System.out.println("Queue Content is: "+ qu);
		
		System.out.println("Queue poll is: "+ qu.poll());
		System.out.println("Queue Content is: "+ qu);
	}

}
