package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		// default values only
		Fruit fruit1 = new Fruit();
		System.out.println(fruit1.toString());
		
		// initialised as default values, but then the variables get re-assigned
		Fruit fruit2 = new Fruit();
		fruit2.setName("Apple");
		fruit2.setIsABerry(false);
		fruit2.setWeightInGrams(300);
		System.out.println(fruit2.getName());
		System.out.println(fruit2.getIsABerry());
		System.out.println(fruit2.getWeightInGrams());
		System.out.println(fruit2.toString());
		
		// created from the new constructor we've just made
		Fruit fruit3 = new Fruit("Strawberry", true, 5);
		System.out.println(fruit3.toString());
		
		// constructors with different method signatures are fine, though!
		Fruit fruit4 = new Fruit("Snozberry", 15);
		System.out.println(fruit4.toString());
		
	}
	
}
