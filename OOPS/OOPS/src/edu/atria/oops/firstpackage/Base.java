package edu.atria.oops.firstpackage;

public class Base {

	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
/*
 * 	1. Private- accessible only within the particular class
 * 	2. Default- accessible only with all the classes created within the package
 * 	3. Public- accessible anywhere
 * 	4. Protected- accessible within all the classes created within the particular package and 
 * 	   also outside the package by extending the parent class.
 */
	
//	public int getVarProtected() {
//		return varProtected;
//	}

	
	void methodDefault() {
		
		System.out.println("Default access base class");
		System.out.println("Default variable: "+ varDefault);
	}
	
	void methodPublic() {
		
		System.out.println("Public access base class");
		System.out.println("Public variable: "+ varPublic);
	}
	
	void methodPrivate() {
		
		System.out.println("Private access base class");
		System.out.println("Private variable: "+ varPrivate);
	}
	
	void methodProtected() {
		
		System.out.println("Protected access base class");
		System.out.println("Protected variable: "+ varProtected);
	}
	
}
