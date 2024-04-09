package edu.atria.oops.classandobjectsdemo;

import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee details: ");
		
		int id = sc.nextInt();
		String name = sc.next();
		float Salary = sc.nextFloat();
		String department = sc.next();
		
		Employee eOne = new Employee();
		eOne.setId(id);
		eOne.setName(name);
		eOne.setSalary(Salary);
		eOne.setDepartment(department);
		System.out.println(eOne);
		
		Employee eTwo = new Employee(id, name, Salary, department);
		System.out.println(eTwo);
		
		sc.close();
	}
	

}