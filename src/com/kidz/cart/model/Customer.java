package com.kidz.cart.model;

import java.io.Serializable;
import java.util.Date;

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
public class Customer implements Serializable{
		
	private static final long serialVersionUID = 104564654646L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String firstName;

	private String lastName;
	
	private String email;
	
	private String phoneNumber;
	
	private String address;
	
	private Date registeredDate;
	
    @OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.MERGE)
    @JoinColumn
	private Account account;
	
	@ColumnDefault(value="false")
	private boolean enableld=false;
	
    @OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.MERGE)
	@JoinColumn
    @JsonIgnoreProperties("customer")
	private Cart cart;

	public Customer(){
		this.registeredDate=new Date();
	}
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
