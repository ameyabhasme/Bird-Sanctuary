package com.bridgelabz.birdsanctuary;

import java.util.Objects;

public class Bird {
	enum Color {
		BLACK, WHITE, GREEN, GREY, YELLOW, BLUE, RED, VIOLET
	}

	protected String name;
	protected String id;
	protected Color color;
	protected boolean isFlyable;
	protected boolean isSwimmable;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(id, other.id);
	}

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
		return "Bird [id= " + id + ", name= " + name + ", color= " + color + ", isFlyable= " + isFlyable
				+ ", isSwimmable= " + isSwimmable + "]";
	}

}
