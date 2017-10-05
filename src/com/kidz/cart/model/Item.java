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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Item implements Serializable {

	private static final long serialVersionUID = 5410351499141792268L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String description;
	
	@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.MERGE)
	@JoinColumn
	@JsonIgnoreProperties("items")
	private Product product;
	
	private int minAge;
	
	private int maxAge;
	
	private double price;
	
	private int quantity;
	
	private String size;
	
	@Lob
	private String otherProperties;
	
	@Lob
	@JsonIgnore
	private byte[] image;

	@ColumnDefault(value="false")
	private boolean isRecomended=false;
	
	@ColumnDefault(value="false")
	private boolean isFeatured=false;
	
	private Date lupDate;
	
	public Item(){
		this.lupDate=new Date();
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getOtherProperties() {
		return otherProperties;
	}

	public void setOtherProperties(String otherProperties) {
		this.otherProperties = otherProperties;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public boolean isRecomended() {
		return isRecomended;
	}

	public void setRecomended(boolean isRecomended) {
		this.isRecomended = isRecomended;
	}

	public boolean isFeatured() {
		return isFeatured;
	}

	public void setFeatured(boolean isFeatured) {
		this.isFeatured = isFeatured;
	}

	public Date getLupDate() {
		return lupDate;
	}

	public void setLupDate(Date lupDate) {
		this.lupDate = lupDate;
	}
	
}
