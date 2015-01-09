package com.skrill.cart;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	static int choice = Integer.MAX_VALUE;
	static boolean isValidInput;

	static Scanner input = new Scanner(System.in);

	void mainMenu() {
		System.out.println();
		System.out.println("Enter the selected number:");
		System.out.println("1 to show catalog and add to cart.");
		System.out.println("2 to show cart and remove from cart.");
		System.out.println("0 for exit.");
		
		try {
			choice = Integer.parseInt(input.next());
		} catch (NumberFormatException a) {
			System.out.print("Enter a number.");
		}

		do {
			switch (choice) {
			case 1:
				catalogMenu();
				break;
			case 2:
				cartMenu();
				break;
			case 0:
				System.out.println("Good bye!");
				return;
			default:
				mainMenu();
				break;
			}
		} while (choice == 0);

	}

	void cartMenu() {

		System.out.println();
		System.out.println();
		if (Test.cart.isEmpty()) {
			System.out.println("Your cart is empty.");
			mainMenu();
		}
		Test.showCart();
		System.out.println("To remove item enter 1.");
		System.out.println("To return to main menu enter 2.");
		System.out.println("To clear the cart enter 3;");
		System.out.println("To exit enter 0.");

		try {
			choice = Integer.parseInt(input.next());
		} catch (NumberFormatException a) {
			System.out.print("Enter a number.");
		}

		do {
			switch (choice) {
			case 1:
				removeMenu();
				break;
			case 2:
				mainMenu();
				break;
			case 3:
				Test.clearCart();
			case 0:
				System.out.println("Good bye!");
				return;
			default:
				cartMenu();
				break;
			}
		} while (choice == 0);
	}

	void removeMenu() {
		if (Test.cart.containsKey("TV")) {
			System.out.println("To remove TV enter 1.");
		} else if (Test.cart.containsKey("Bicycle")) {
			System.out.println("To remove Bicycle enter 2.");
		} else if (Test.cart.containsKey("Car")) {
			System.out.println("To remove Car enter 3.");
		} else if (Test.cart.containsKey("Bread")) {
			System.out.println("To remove Bread enter 4.");
		} else if (Test.cart.containsKey("Cigarettes")) {
			System.out.println("To remove Cigarettes enter 5.");
		} else if (Test.cart.containsKey("Rent")) {
			System.out.println("To remove Rent enter 6.");
		} else if (Test.cart.containsKey("Repair")) {
			System.out.println("To remove Repair enter 7.");
		} else if (Test.cart.containsKey("Taxi")) {
			System.out.println("To remove Taxi enter 8.");
		}

		System.out.println("To return to main menu enter 9.");
		System.out.println("Te exit enter 0.");
		choiceToRemove();
	}

	void confirmRemove() {
		System.out.println("Remove successfull");
		cartMenu();
	}

	void choiceToRemove() {

		try {
			choice = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("You didn't enter a number. Return To menu:");
			cartMenu();
		}

		switch (choice) {
		case 1:
			if (Test.cart.containsKey("TV")) {
				Test.cart.remove("TV");
				confirmRemove();
			} else {
				System.out.println("Nothing removed.");
			}
			break;
		case 2:
			if (Test.cart.containsKey("Bicycle")) {
				Test.cart.remove("Bicycle");
				confirmRemove();
			} else {
				System.out.println("Nothing removed.");
			}
			break;
		case 3:
			if (Test.cart.containsKey("Car")) {
				Test.cart.remove("Car");
				confirmRemove();
			} else {
				System.out.println("Nothing removed.");
			}
			break;
		case 4:
			if (Test.cart.containsKey("Bread")) {
				Test.cart.remove("Bread");
				confirmRemove();
			} else {
				System.out.println("Nothing removed.");
			}
			break;
		case 5:
			if (Test.cart.containsKey("Cigarettes")) {
				Test.cart.remove("Cigarettes");
				confirmRemove();
			} else {
				System.out.println("Nothing removed.");
			}
			break;
		case 6:
			if (Test.cart.containsKey("Rent")) {
				Test.cart.remove("Rent");
				confirmRemove();
			} else {
				System.out.println("Nothing removed.");
			}
			break;
		case 7:
			if (Test.cart.containsKey("Service")) {
				Test.cart.remove("Service");
				confirmRemove();
			} else {
				System.out.println("Nothing removed.");
			}
			break;
		case 8:
			if (Test.cart.containsKey("Taxi")) {
				Test.cart.remove("Taxi");
				confirmRemove();
			} else {
				System.out.println("Nothing removed.");
			}
			break;
		case 9:
			mainMenu();
			break;
		case 0:
			System.out.println("Good bye!");
			return;
		default:
			break;
		}
		cartMenu();
	}

	void catalogMenu() {
		System.out.println();
		Test.showCatalog();
		System.out.println();
		System.out.println("If you want to add an item to cart enter 1.");
		System.out.println("If you want to return to main menu enter 2.");
		System.out.println("To exit enter 0");

		try {
			choice = Integer.parseInt(input.next());
		} catch (NumberFormatException a) {
			System.out.print("Enter a number.");
		}

		do {
			switch (choice) {
			case 1:
				addToCartMenu();
				break;
			case 2:
				mainMenu();
				break;
			case 0:
				System.out.println("Good bye!");
				return;
			default:
				catalogMenu();
				break;
			}
		} while (choice == 0);

	}

	void addToCartMenu() {
		System.out.println("Just enter the number of the item.");
		int itemChoice = Integer.MAX_VALUE;
		try {
			itemChoice = Integer.parseInt(input.next());
		} catch (NumberFormatException a) {
			System.out.print("Enter a number.");
		}

		System.out.println("Enter quentity: ");
		int quentity = Integer.MAX_VALUE;
		try {
			quentity = Integer.parseInt(input.next());
		} catch (NumberFormatException a) {
			System.out.print("Enter a number.");
		}

		if ((itemChoice >= 1) && (itemChoice <= 9) && (quentity > 0)) {
			Test.AddToCart(itemChoice, quentity);
			System.out.println("Item succesfully added to cart.");
			catalogMenu();
		} else if (quentity <= 0) {
			System.out.println("Nothing is added to cart.");
			catalogMenu();
		} else if (itemChoice == 0) {
			System.out.println("Good bye!");
			return;
		} else {
			System.out.println();
		}
	}
}
