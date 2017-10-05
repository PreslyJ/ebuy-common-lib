package com.kidz.cart.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cart implements Serializable{

    private static final long serialVersionUID = 4110828160339396501L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @Fetch(value=FetchMode.SUBSELECT)
    @JsonIgnoreProperties("cart")
    private List<CartItem> cartItems;

    @OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.MERGE)
    @JoinColumn
    @JsonIgnoreProperties("cart")
    private Customer customer;

    private double grandTotal;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
}
