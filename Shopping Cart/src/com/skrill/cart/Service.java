package com.skrill.cart;

public class Service extends Item {

	private String name;
	private String description;
	private int price;
	private PaymentType paymentType;
	

	public enum PaymentType {
		FIXED, PERHOUR;
	}

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

	public Service(String name, String description, int price, PaymentType paymentType) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.setPaymentType(paymentType);
	}
	
	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	@Override
	public void showCatalogItem() {
		System.out.println(getName() + ", " + getDescription() + ", The Price is " + getPrice() + ", " + getPaymentType());
	}
	
	@Override
	public void showCartItem() {
		System.out.print(getName() + ", " + getDescription() + ", The Price is " + getPrice() + ", " + getPaymentType());
	}
}
