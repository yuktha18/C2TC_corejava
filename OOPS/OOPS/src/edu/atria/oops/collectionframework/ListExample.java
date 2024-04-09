package edu.atria.oops.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
//		can't instantiate the list
		
		List list = new ArrayList();
		list.add(0, 1);
		list.add(1, "Rahul");
		list.add(2,'M');
		list.add(3, 98.9f);
		list.add(4, 8867535422l);
		list.add(5,"Rahul");
		list.add(6,null);
		
		System.out.println(list);
		System.out.println("Element in first index: " + list.get(1));
	
		System.out.println(list.contains("R"));
		System.out.println(list.size());
		
		//System.out.println("Element in 7th index: " + list.get(7));// Exception: IndexOutOfBounds
		
	}

}
