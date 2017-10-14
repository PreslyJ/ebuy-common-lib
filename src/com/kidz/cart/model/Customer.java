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
	
	private String address1;
	
	private String address2;
	
	private String address3;
	
	private Date registeredDate;
	
    @OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn
	private Account account;
	
	@ColumnDefault(value="false")
	private boolean enableld=false;
	
    @OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
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

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	
	
}
