package edu.atria.oops.classandobjectsdemo;

public class Employee {
		private int id;
		private String name;
		private float Salary;
		private String department;

	

		public Employee(){
			System.out.println("Default constuctor is called........");
		}

		public Employee(int id, String name, float Salary, String department) {
			System.out.println("Parametric constructor is called......");
			this.id=id;
			this.name=name;
			this.Salary=Salary;
			this.department=department;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getSalary() {
			return Salary;
		}

		public void setSalary(float salary) {
			Salary = salary;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", department=" + department + "]";
		}
		
			
		
}





