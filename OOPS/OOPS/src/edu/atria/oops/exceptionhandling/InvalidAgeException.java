package edu.atria.oops.exceptionhandling;

//To demonstrate custom exception

public class InvalidAgeException extends Exception{

	public InvalidAgeException() {
		super("invalid age");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
}
