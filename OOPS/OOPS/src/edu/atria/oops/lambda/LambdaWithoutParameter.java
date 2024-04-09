package edu.atria.oops.lambda;

public class LambdaWithoutParameter {

	public static void main(String[] args) {
		Statement s = ()->{return "Hello";};
		System.out.println(s.greet());
		isOdd odd = (a)-> a%2!=0 ? true : false;
		System.out.println(odd.checkOdd(5));
	}

}
