package edu.atria.oops.firstpackage;

public class Executor {
	public static void main(String[] args) {
		
		Base b1 = new Base();
//		b1.methodDefault();
//		b1.methodPublic();
//		b1.methodPrivate();
//		b1.methodProtected();
		
		System.out.println(b1.varDefault);
		System.out.println(b1.varPublic);
	//	System.out.println(b1.varPrivate);  private members are not visible outside the class
		System.out.println(b1.varProtected);
	}

}
