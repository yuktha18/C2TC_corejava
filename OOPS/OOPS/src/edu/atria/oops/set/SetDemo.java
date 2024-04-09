package edu.atria.oops.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set s =new LinkedHashSet(); //HashSet();
		s.add(5);
		s.add(75.5);
		s.add("Atria");
		s.add(true);
		s.add(true);
		
		System.out.println("the elements in the list"+s);

	}

}
