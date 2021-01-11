package com.qa.main;

public class Fruit {

	private String name;
	private boolean isABerry;
	private int weightInGrams;
	
	public Fruit() { } 
	
	public Fruit(String name, int weightInGrams) {
		this.name = name;
		this.weightInGrams = weightInGrams;
	}
	
	public Fruit(String name, boolean isABerry, int weightInGrams) {
		this.name = name;
		this.isABerry = isABerry;
		this.weightInGrams = weightInGrams;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getIsABerry() {
		return isABerry;
	}

	public void setIsABerry(boolean isABerry) {
		this.isABerry = isABerry;
	}

	public int getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", isABerry=" + isABerry + ", weightInGrams=" + weightInGrams + "]";
	}
	
	
}
