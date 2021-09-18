package com.bridgelabz.birdsanctuary;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.birdsanctuary.Bird.Color;

public class BirdSanctuaryManager {
	Set<Bird> birdlist = new HashSet<Bird>();
	private static BirdSanctuaryManager instance;
	final Scanner SC = new Scanner(System.in);

	private BirdSanctuaryManager() {

	}

	public synchronized static BirdSanctuaryManager getInstance() {
		if (instance == null) {
			instance = new BirdSanctuaryManager();
		}
		return instance;
	}

	public void addDummyBirds() {
		Bird bird = new Bird();
		bird.name = "Penguin";
		bird.id = "Pen";
		bird.color = Color.BLACK;
		bird.isFlyable = false;
		bird.isSwimmable = true;
		birdlist.add(bird);

		Bird bird1 = new Bird();
		bird1.name = "Parrot";
		bird1.id = "Par";
		bird1.color = Color.GREEN;
		bird1.isFlyable = true;
		bird1.isSwimmable = false;
		birdlist.add(bird1);

		Bird bird2 = new Bird();
		bird2.name = "Pigeon";
		bird2.id = "Pig";
		bird2.color = Color.GREY;
		bird2.isFlyable = true;
		bird2.isSwimmable = true;
		birdlist.add(bird2);

		Bird bird3 = new Bird();
		bird3.name = "Crow";
		bird3.id = "Cro";
		bird3.color = Color.BLACK;
		bird3.isFlyable = true;
		bird3.isSwimmable = true;
		birdlist.add(bird3);

		Bird bird4 = new Bird();
		bird4.name = "Penguin";
		bird4.id = "Pen1";
		bird4.color = Color.BLACK;
		bird4.isFlyable = false;
		bird4.isSwimmable = true;
		birdlist.add(bird4);

	}

	public void add(Bird bird) {
		birdlist.add(bird);
	}

	public void remove(Bird bird) {
		birdlist.remove(bird);
	}

	public Bird edit(Bird updateBird) {
		int exit = 1;
		while (exit != 0) {
			System.out.println("1) ID: " + updateBird.id + "\n2) Bird Name: " + updateBird.name + "\n3) Bird Color: "
					+ updateBird.color + "\n4) FLyable: " + updateBird.isFlyable + "\n5) Swimmable: "
					+ updateBird.isSwimmable + "\n0) Save and Update\n Selevt from option: ");
			exit = SC.nextInt();
			switch (exit) {
			case 0:

				break;
			case 1:
				System.out.println("Enter Bird ID: ");
				updateBird.id = SC.next();
				break;
			case 2:
				System.out.println("Enter Bird Name: ");
				updateBird.name = SC.next();
				break;
			case 3:
				System.out.println("1) White\n2) Black\n3) Green\n4) Grey\n5) Yellow\n6) Blue\n7) Red\n8) Violet");
				System.out.println("Enter Bird Color: ");
				int option = SC.nextInt();
				switch (option) {
				case 1:
					updateBird.color = Color.WHITE;
					break;
				case 2:
					updateBird.color = Color.BLACK;
					break;
				case 3:
					updateBird.color = Color.GREEN;
					break;
				case 4:
					updateBird.color = Color.GREY;
					break;
				case 5:
					updateBird.color = Color.YELLOW;
					break;
				case 6:
					updateBird.color = Color.BLUE;
					break;
				case 7:
					updateBird.color = Color.RED;
					break;
				case 8:
					updateBird.color = Color.VIOLET;
					break;
				default:
					System.out.println("Enter from the options!!");
				}
				break;
			case 4:
//				System.out.println("Can the bird fly?(true or false): ");
//				updateBird.isFlyable = SC.nextBoolean();
				flyable(updateBird);
				break;
			case 5:
//				System.out.println("Can the bird swim?(true or false): ");
//				updateBird.isSwimmable = SC.nextBoolean();
				swimmable(updateBird);
				break;
			default:
				break;
			}
		}
		return null;
	}
	
	   public void flyable(Bird bird) {
	        boolean flag = true;
	        while (flag) {
	            try {
	                System.out.println("Can the bird fly?(true or false): ");
	                bird.isFlyable = inputUser();
	                flag = false;
	            } catch (Exception e) {
	                System.out.println("Invalid Input");
	            }
	        }
	    }

	    public void swimmable(Bird bird) {
	        boolean flag = true;
	        while (flag) {
	            try {
	                System.out.println("Can the bird swim?(true or false): ");
	                bird.isSwimmable = inputUser();
	                flag = false;
	            } catch (Exception e) {
	                System.out.println("Invalid Input");
	            }
	        }
	    }

	    public boolean inputUser() {
	        Scanner sc = new Scanner(System.in);
	        return sc.nextBoolean();
	    }


	public Bird getBird(String id) {
//		for (Bird bird : birdlist) {
//			if (bird.id.equals(id)) {
//				return bird;
//			}
//		}
		return birdlist.stream().filter(bird -> bird.id.equals(id)).findFirst().orElse(null);
//		return birdlist.stream().filter(bird -> bird.id.equals(id)).anyMatch(bird).orElse(null);
//		return null;
	}

	public void printFlyable() {
//		for (Bird bird : birdlist) {
//			if (bird.isFlyable) {
//				bird.fly();
//			}
//		}
		birdlist.stream().filter(bird -> bird.isFlyable).forEach(bird -> bird.fly());
	}

	public void printSwimmable() {
//		for (Bird bird : birdlist) {
//			if (bird.isSwimmable) {
//				bird.swim();
//			}
//		}
		birdlist.stream().filter(bird -> bird.isSwimmable).forEach(bird -> bird.swim());
	}

	public void printEatable() {
//		for (Bird bird : birdlist) {
//			bird.eat();
//		}
		birdlist.stream().forEach(bird -> bird.eat());
	}

	public void print() {
//		for (Bird bird : birdlist) {
//			System.out.println(bird);
//		}
		birdlist.stream().forEach(System.out::println);
	}

	public void dummyGetBirdNameList() {
		birdlist.stream().map(bird -> bird.name).forEach(System.out::println);
		System.out.println(birdlist.stream().count());
//		List<String> myBirdList = birdlist.stream().map(bird -> bird.name).collect(Collectors.toList());
//		System.out.println(myBirdList);
	}
}
