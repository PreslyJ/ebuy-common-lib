package com.kidz.cart.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class SubCategory implements Serializable{
	
   private static final long serialVersionUID = -1864407176880199272L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @NotEmpty(message = "The name must not be null")
    @Length(max = 255, message = "The field must be less than 255 characters")
    @Column(unique=true)
	private String name;
	
    @Lob
	private String description;
	
    @ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.MERGE)
	@JoinColumn
	@JsonIgnoreProperties("subCategories")
	private Category category;

    @OneToMany(cascade={CascadeType.MERGE,CascadeType.REMOVE},fetch=FetchType.EAGER,mappedBy="subCategory")
    @JsonIgnoreProperties("subCategory")
    private List<Item> items=new ArrayList<Item>();
	
    private String status;
    
    private Date lupDate;
    
    public SubCategory(){
    	
    	this.lupDate=new Date();
    	this.status="active";
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLupDate() {
		return lupDate;
	}

	public void setLupDate(Date lupDate) {
		this.lupDate = lupDate;
	}

	
}
