package edu.atria.oops.polymorphism;

public class OverloadingMain {

	public static void main(String[] args) {
		
		System.out.println("-------------Method Overloading-------------");
		System.out.println("Additin of two integers: " + MethodOverloading.add(10, 20));
		System.out.println("Additin of two float values: " + MethodOverloading.add(10.6f, 20.5f));
		System.out.println("Additin of two float values: " + MethodOverloading.add(100, 20.5f));
		System.out.println("Additin of two float values: " + MethodOverloading.add(10.5f, 20));
		System.out.println("Additin of two String values: " + MethodOverloading.add("Hello", " Ananth"));

	}

}
