package edu.atria.oops.staticdemo;

class Student{
	int rollno;
	String name;
	static String college = "Atria";
	
	Student(int r, String n){
		rollno = r;
		name = n;
		college = "AIT";
	}
	public void display() {
		System.out.println("Rollno: "+ rollno + " " + "Name: "+ name + " "+"College: " + college);
	}
}



public class StaticDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(007,"Ananth");
		Student s2 = new Student(001,"Rahullaa");
		s1.display();
		s2.display();
	}

}
