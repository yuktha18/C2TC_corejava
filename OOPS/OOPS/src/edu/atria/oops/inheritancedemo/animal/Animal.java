package edu.atria.oops.inheritancedemo.animal;

public class Animal {
		
	private boolean vegetarian;
	private String eats;
	private int noOflegs;
	
	public Animal(boolean veg, String food, int legs) {
		this.vegetarian=veg;
		this.eats=food;
		this.noOflegs=legs;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public int getNoOflegs() {
		return noOflegs;
	}

	public void setNoOflegs(int noOflegs) {
		this.noOflegs = noOflegs;
	}

	@Override
	public String toString() {
		return "Animal [vegetarian=" + vegetarian + ", eats=" + eats + ", noOflegs=" + noOflegs + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}


