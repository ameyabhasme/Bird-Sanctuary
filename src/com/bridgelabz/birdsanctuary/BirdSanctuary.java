package com.bridgelabz.birdsanctuary;

import java.util.Scanner;

import com.bridgelabz.birdsanctuary.Bird.Color;

public class BirdSanctuary {
	final Scanner SC = new Scanner(System.in);

	public void showMenu() {
		int exit = 1;
		BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();

		while (exit != 0) {
			System.out.println("1) Add Bird \n2) Remove Bird \n3) Update Bird" + "\n4) Print All Birds \n5) Print Flyable Bird"
							+ "\n6) Print Swimmable Bird \n7) Print Eatable Bird \n0)Exit");
			System.out.print("Select from Menu: ");
			int choice = SC.nextInt();

			switch (choice) {
			case 0:
				exit = 0;
				break;
			case 1:
				Bird bird = new Bird();
				System.out.print("Enter Bird name: ");
				bird.name = SC.next();

				System.out.print("Enter Bird id: ");
				bird.id = SC.next();

				System.out.print("1) White\n2) Black\n3) Green\n4) Grey\n5) Yellow\n6) Blue\n7) Red\n8) Violet");
				System.out.print("Enter Bird color option: ");
				int option = SC.nextInt();
				switch (option) {
				case 1:
					bird.color = Color.WHITE;
					break;
				case 2:
					bird.color = Color.BLACK;
					break;
				case 3:
					bird.color = Color.GREEN;
					break;
				case 4:
					bird.color = Color.GREY;
					break;
				case 5:
					bird.color = Color.YELLOW;
					break;
				case 6:
					bird.color = Color.BLUE;
					break;
				case 7:
					bird.color = Color.RED;
					break;
				case 8:
					bird.color = Color.VIOLET;
					break;
				default:
					System.out.println("Enter from the options!!");
				}

				System.out.print("Can the bird fly?(true or false): ");
				bird.isFlyable = SC.nextBoolean();

				System.out.print("Can the bird swim?(true or false): ");
				bird.isSwimmable = SC.nextBoolean();

				birdSanctuaryManager.add(bird);
				break;

			case 2:
				System.out.print("Enter the Bird ID: ");
				String id = SC.next();
				Bird rem = birdSanctuaryManager.getBird(id);
				birdSanctuaryManager.remove(rem);
				break;

			case 3:
				System.out.print("Enter the Bird ID: ");
				break;

			case 4:
				birdSanctuaryManager.print();
				break;

			case 5:
				birdSanctuaryManager.printFlyable();
				break;

			case 6:
				birdSanctuaryManager.printSwimmable();
				break;

			case 7:
				birdSanctuaryManager.printEatable();
				break;

			default:
				System.out.println("Enter option from the Menu!");

			}
		}

	}

	public static void main(String[] args) {
		BirdSanctuary birdSanctuary = new BirdSanctuary();

//		Duck duck = new Duck();
//		duck.id = "Duc";
//		Parrot parrot = new Parrot();
//		parrot.id = "Par";
//		Penguin penguin = new Penguin();
//		penguin.id = "Pen";
//		Pigeon pigeon = new Pigeon();
//		pigeon.id = "Pig";
//
//		birdSanctuaryManager.add(duck);
//		birdSanctuaryManager.add(parrot);
//		birdSanctuaryManager.add(penguin);
//		birdSanctuaryManager.add(pigeon);

		birdSanctuary.showMenu();

	}
}
