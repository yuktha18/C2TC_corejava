package edu.atria.oops.secondpackage;

import edu.atria.oops.firstpackage.Base;

public class Executor extends Base{

	public static void main(String[] args) {
		
//		Base b1 = new Base();
//		System.out.println(b1.varPublic);
//		System.out.println(b1.getVarProtected());
		
	/*	Private and Default are the available only within the package. Hence they are not visible 
		outside the package.
		The level of security of access modifiers is:
			Private > Default > Protected > Public
		System.out.println(b1.varPrivate);
		System.out.println(b1.varDefault);
		
	*/
//		other way
//		Protected members are accessible outside the package by extending the base class 
		Executor ex = new Executor();
		System.out.println(ex.varProtected);
		
//		Public is accessible everywhere
		System.out.println(ex.varPublic);
	
	}

}
