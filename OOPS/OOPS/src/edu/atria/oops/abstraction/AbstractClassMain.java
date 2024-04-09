package edu.atria.oops.abstraction;

public class AbstractClassMain {

	public static void main(String[] args) {
		/*
		We cannot instantiate the abstract class Shape
		Shape s = new Shape(20.5f, 10.6f);
		*/
		
		//Dynamic Binding
		Shape sOne = new Square(10);
		sOne.calculateArea();
		sOne.display();
		
		Shape sTwo = new Rectangle(10.5f,20.5f);
		sTwo.calculateArea();
		sTwo.display();
		
	}

}
