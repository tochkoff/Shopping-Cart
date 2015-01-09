package com.skrill.cart;

import java.util.Date;

public class Product extends Item {

	private String name;
	private String description;
	private int price;
	private String manifacturer;
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManifacturer() {
		return manifacturer;
	}

	public void setManifacturer(String manifacturer) {
		this.manifacturer = manifacturer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product(String name, String manifacturer, int price, String description, Date date) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.manifacturer = manifacturer;
		this.date = date;
	}

	@Override
	public void showCatalogItem() {
		System.out.println(getName() + ", Made form: " + getManifacturer() + ", The price is " + getPrice() + ", " + getDescription() + ", " + getDate());
	}

	@Override
	public void showCartItem() {
		System.out.print(getName() + ", Made from: " + getManifacturer() + ", The price is " + getPrice() + ", " + getDescription() + ", " + getDate());
	}
}
