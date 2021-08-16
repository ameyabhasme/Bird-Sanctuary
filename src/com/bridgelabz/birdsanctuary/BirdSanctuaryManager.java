package com.bridgelabz.birdsanctuary;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuaryManager {
	List<Bird> birdlist = new ArrayList<Bird>();
	private static BirdSanctuaryManager instance;
	
	private BirdSanctuaryManager() {
		
	}

	public synchronized static BirdSanctuaryManager getInstance() {
		if(instance == null) {
			instance = new BirdSanctuaryManager();
		}
		return instance;
	}
	
	public void add(Bird bird) {
		birdlist.add(bird);
	}

	public void remove(Bird bird) {
		birdlist.remove(bird);
	}
	
	public Bird getBird(String id) {
		for (int i = 0; i < birdlist.size(); i++) {
			if(birdlist.get(i).id.equals(id)) {
				return birdlist.get(i);
			}
		}
		return null;
	}
	
	public void printFlyable() {
		for (int i = 0; i < birdlist.size(); i++) {
			if (birdlist.get(i).isFlyable == true) {
				birdlist.get(i).fly();
			}
		}
	}

	public void printSwimmable() {
		for (int i = 0; i < birdlist.size(); i++) {
			if (birdlist.get(i).isSwimmable == true) {
				birdlist.get(i).swim();
			}
		}
	}

	public void printEatable() {
		for (int i = 0; i < birdlist.size(); i++) {
			birdlist.get(i).eat();
		}
	}

	public void print() {
		for (int i = 0; i < birdlist.size(); i++) {
			System.out.println(birdlist.get(i));
		}
	}
}
