package com.kidz.cart.model;

import java.io.Serializable;
import java.util.Date;

public class PurchasedItems implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	
	private Customer customer;
	
	private Item item;
	
	private int noOfItems;
	
	private Date purchasedDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public Date getPurchasedDate() {
		return purchasedDate;
	}

	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}
	
	
}
