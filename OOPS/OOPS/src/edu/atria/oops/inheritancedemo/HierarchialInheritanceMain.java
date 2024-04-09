package edu.atria.oops.inheritancedemo;

public class HierarchialInheritanceMain {

	public static void main(String[] args) {
		Citizen stud = new Student(989354215, "Indian", "Bengaluru", "30-08-2002", 'M', 007, "Ananth", "CSE");
		System.out.println(stud);
		
		
		Citizen mp = new MP(972364215, "Indian", "Bengaluru", "25-01-2002", 'M', 005, "Dr.S Jaishankar", "Bengaluru", "BJP");
		System.out.println(mp);
		
		
		
		
//		System.out.println("Name: "+ stud.getName());
//		System.out.println("Aadhaar number: "+ stud.getAadharNo());
//		System.out.println("Nationality: "+ stud.getNationality());
//		System.out.println("Address: "+ stud.getAddress());
//		System.out.println("DOB: "+ stud.getDob());
//		System.out.println("Gender: "+ stud.getGender());
//		System.out.println("Id: "+ stud.getId());		
//		System.out.println("Department: "+ stud.getDepartment());
		
		
		

	}

}
