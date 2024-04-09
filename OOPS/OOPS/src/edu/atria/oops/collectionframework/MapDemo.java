package edu.atria.oops.collectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("First", "1st");
		map.put("2nd", new Float(2.0f));
		map.put("third","3rd");
		map.put("third", 3);//Duplicate - overrides the previous assignment
		System.out.println("Entries of map: " + map);
		//to view the map
		//returns the set view of the key
		Set set = map.keySet();
		System.out.println("The keys are: " + set);
		//returns the collection view of the key
		Collection collection = map.values();
		System.out.println("The values are: " + collection);
		//returns the set view of key value mappings
		Set mapset = map.entrySet();
		Set keyset = map.keySet();
		System.out.println("\n" + set + "\n"+ collection + "\n" + mapset + "\n" + keyset + "\n" + map.isEmpty());
		
		
	}

}
