package edu.atria.oops.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Display{
	static void show(String s) {
		System.out.println("******** " + s + " ********");
	}
}

public class UsingFunctionalInterface {

	public static void main(String[] args) {
		Consumer<String> consumer = Display::show; //:: is method referencing
		consumer.accept("Amith");
		
		Supplier<String> supplier = ()-> "Hello from supplier!";
		consumer.accept(supplier.get());
		
		Supplier<Double> supplier1 = ()-> Math.random() ;
		System.out.println(supplier1.get());
		
		//Positive or negative number test
		Predicate<Integer> predicate = num -> num > 0;
		System.out.println(predicate.test(24));
		System.out.println(predicate.test(-20));
		
		// max test
		BiFunction<Integer, Integer, Integer> maxFunction = (x,y) -> x > y ? x : y;
		System.out.println(maxFunction.apply(25, 114));
		
		BiFunction<String, Integer, String> printFunction = (name, num) -> name + num; //here String and Integer are I/P 1 and 2, Integer is O/P
		System.out.println(printFunction.apply("Good Evening ", 2));
	}

}
