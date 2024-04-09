package edu.atria.oops.inheritancedemo.animal;

public class AnimalInheritanceTest {

	public static void main(String[] args) {
		Cat cat = new Cat(true, "milk", 4, "White");
		System.out.println("Is cat vegetarian?? "+ cat.isVegetarian());
		System.out.println("Cat drinks "+ cat.getEats());
		System.out.println("Cat has "+ cat.getNoOflegs()+" legs");
		System.out.println("Cat color is: "+ cat.getColor());
		System.out.println(cat);
	}

}
