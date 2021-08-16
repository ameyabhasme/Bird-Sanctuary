package com.bridgelabz.birdsanctuary;

public class Bird {
	enum Color {BLACK, WHITE, GREEN, GREY, YELLOW, BLUE, RED, VIOLET}
	 	
	protected String name;
	protected String id;
	protected Color color;
	protected boolean isFlyable;
	protected boolean isSwimmable;

	public void eat() {
		System.out.println(name + " is eating.");
	}
	
	public void fly() { 
		System.out.println(name + " is flying.");
	}
	
	public void swim() {
		System.out.println(name + " is swimming.");
	}

	@Override
	public String toString() {
		return "Bird [id= " + id + ", name= " + name + ", color= " + color + ", isFlyable= " + isFlyable + ", isSwimmable= "
				+ isSwimmable + "]";
	}
	
	
}
