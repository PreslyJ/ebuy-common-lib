package com.kidz.cart.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.hibernate.annotations.ColumnDefault;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kidz.login.model.Account;


@Entity
public class Customer extends Account {
		
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	
	private String firstName;

	private String lastName;
	
	private String email;
	
	private String phoneNumber;
	
	private String address;
	
	@ColumnDefault(value="false")
	private boolean enableld=false;
	
    @OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.MERGE)
	@JoinColumn
    @JsonIgnoreProperties("customer")
	private Cart cart;
	
	public Customer(String email,String password){
		super(email,password);
	}
		
	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public boolean isEnableld() {
		return enableld;
	}

	public void setEnableld(boolean enableld) {
		this.enableld = enableld;
	}

	public Cart getCart() {
		return cart;
	}



	public void setCart(Cart cart) {
		this.cart = cart;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
