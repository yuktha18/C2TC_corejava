package edu.atria.oops.exceptionhandling;

import java.util.Scanner;

public class AgeTestDemo {

	static void validate(int age) throws InvalidAgeException{
		if (age<18) {
			throw new InvalidAgeException("Invalid age!!, you are not eligible to vote");
		}
		else {
			System.out.println("You are eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		
			int age;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age: ");
			age = sc.nextInt();
			try {
				validate(age);
			}
			catch(InvalidAgeException e) {
				System.out.println("Exception occured: " + e.getMessage());
			}
			sc.close();

	}

}
