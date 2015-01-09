package com.skrill.cart;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import com.skrill.cart.Service.PaymentType;

public class Test {

	static ArrayList<Item> catalog = new ArrayList<Item>();
	static HashMap<String, Integer> cart = new HashMap<String, Integer>();

	public static void main(String[] args) {
		System.out.println("Welcome!");
		addToCatalog();
		Menu menu = new Menu();
		menu.mainMenu();
	}

	static void addToCatalog() {
		Item rent = new Service("Rent", "Car renting services", 100, PaymentType.PERHOUR);
		Item repairPC = new Service("Service", " Repair computers and laptops", 30, PaymentType.FIXED);
		Item taxi = new Service("Taxi", "Drive you somewhere ", 150, 	PaymentType.PERHOUR);
		Item tv = new Product("TV", "Sony", 1200, "3D", new Date(2014, 12, 22));
		Item bicycle = new Product("Mountain bike", "Trek", 1500, "Pretty durable bike", new Date(2013, 4, 30));
		Item car = new Product("Car", "BMW", 35000, "Black", new Date(2013, 4, 30));
		Item bread = new Product("Bread", "Simidite", 1, "Delicious", new Date(2015, 1, 8));
		Item cigarettes = new Product("Cigarettes", "Marlboro", 1500, "Unique",new Date(2013, 4, 30));

		catalog.add(tv);
		catalog.add(bicycle);
		catalog.add(car);
		catalog.add(bread);
		catalog.add(cigarettes);
		catalog.add(rent);
		catalog.add(repairPC);
		catalog.add(taxi);
	}

	static void showCatalog() {
		for (int i = 0; i < catalog.size(); i++) {
			System.out.print(i + 1 + ". ");
			catalog.get(i).showCatalogItem();
		}
	}

	static void showCart() {
		for (Entry<String, Integer> item : cart.entrySet()) {
			if (item.getKey() == "TV") {
				catalog.get(0).showCartItem();
				System.out.println("    Quentity: " + item.getValue());
			} else if (item.getKey() == "Bicycle") {
				catalog.get(1).showCartItem();
				System.out.println("    Quentity: " + item.getValue());
			} else if (item.getKey() == "Car") {
				catalog.get(2).showCartItem();
				System.out.println("    Quentity: " + item.getValue());
			} else if (item.getKey() == "Bread") {
				catalog.get(3).showCartItem();
				System.out.println("    Quentity: " + item.getValue());
			} else if (item.getKey() == "Cigarettes") {
				catalog.get(4).showCartItem();
				System.out.println("    Quentity: " + item.getValue());
			} else if (item.getKey() == "Rent") {
				catalog.get(5).showCartItem();
				System.out.println("    Quentity: " + item.getValue());
			} else if (item.getKey() == "Repair") {
				catalog.get(6).showCartItem();
				System.out.println("    Quentity: " + item.getValue());
			} else if (item.getKey() == "Taxi") {
				catalog.get(7).showCartItem();
				System.out.println("    Quentity: " + item.getValue());
			}
		}
	}

	static void AddToCart(int number, int quentity) {
		if (number == 1) {
			cart.put("TV", quentity);
		} else if (number == 2) {
			cart.put("Bicycle", quentity);
		} else if (number == 3) {
			cart.put("Car", quentity);
		} else if (number == 4) {
			cart.put("Bread", quentity);
		} else if (number == 5) {
			cart.put("Cigarettes", quentity);
		} else if (number == 6) {
			cart.put("Rent", quentity);
		} else if (number == 7) {
			cart.put("Repair", quentity);
		} else if (number == 8) {
			cart.put("Taxi", quentity);
		}
	}

	static void RemoveFromCart(String name) {
		cart.remove(name);
	}

	static void clearCart() {
		cart.clear();
	}
}
