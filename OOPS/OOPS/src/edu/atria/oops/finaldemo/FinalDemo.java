package edu.atria.oops.finaldemo;

class Bike{
	
	final void run() {
		System.out.println("Running....");
		
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.run();
		
	}

}
