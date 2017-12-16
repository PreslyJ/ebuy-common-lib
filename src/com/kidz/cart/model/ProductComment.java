package com.kidz.cart.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProductComment implements Serializable {

    private static final long serialVersionUID = 2586167050875661578L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String review;

    private int stars;
    
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    private Date commentDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   
}
