package edu.atria.oops.abstraction;

public abstract class Shape {
		//static float area;
		float area;
	
		//abstract method
		public abstract float calculateArea();  
		
//						ABSTRACT
//	1. An abstract class can have both abstract & non-abstract methods. 
//	2. If there is atleast one abstract method within a class then the class should be an abstract class.   
//	3. An abstract class can have static methods.
//	4. The sub-class which extends the abstract base class should implement all the abstract methods.
				
		//non-abstract method
		/*public static void display() {
			System.out.println("Area of the shape: "+area); 
		}*/
		
		public void display() {
			System.out.println("Area of the shape: "+area); 
		}
		
		
}

//						PACKAGES
//1.Package is a collection of classes and interfaces
//2. Java have huge number of build in classes in jre
//3. Package in java can be categorized as user-defined and built-in 

// Built-in consist of large number of predefined classes, interfaces and methods.
// Java 1.8 consist of 14 predefined packages, 150 sub-packages, 7000 classes, 7 lakh methods

/*  Java-
 * 		 Java.lang-
 * 				Class
 * 				Object
 * 				String
 * 				Thread	
 * 		 Java.util-
 * 				Linked List
 * 				Date
 * 				Calender
 * 				Hash Table
 * 		 Java.io-
 * 				I/O Stream
 * 				O/P Stream
 * 		 Java.net-
 * 				URL
 * 				Socket
 * 		 Java.applet-
 * 				applet
 */

/*	User-defined package:
 * 			The package defined by the user is called user-defined package
 * 			Java supports a keyword called package which is used to create user-defined packages
 * 			Ex:  package(keyword) com.ibm.hdfc.loan.homeloan;
 * 
 *  Rules for creating a package:
 *  	- Give a meaningful names for the package
 *  	- Organize classes based on their functionality
 *  	- Always try to avoid over nesting of packages
 *  	- Always keep a balance between hierarchy and simplicity
 *  	- Follow java naming conventions
 *  	- Use the lowercase for package names and follow the reverse domain notation
 *  	- Use power access modifiers for classes within your package. limit visibility to only what's 
 *  	  necessary for other classes.
 */





