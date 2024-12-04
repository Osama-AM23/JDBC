package com.xworkz.eCommerce.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="products_table")

@NamedQuery(name="findByProdcutId", query="Select ent From ECommerceEntity ent where ent.productId=20115")
@NamedQuery(name="findByProductName", query="Select et From ECommerceEntity et where et.productName='Jockey-InnerWear'")
@NamedQuery(name="findById", query="Select enty From ECommerceEntity enty where enty.id= 11")
@NamedQuery(name = "findByProductId&ProductName", query = "Select et From ECommerceEntity et Where et.id =9")
@NamedQuery(name= "findByProductName&Category", query="Select et From ECommerceEntity et Where et.productId=34560")

public class ECommerceEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int productId;
	
	private String productName;
	
	private double price;
	
	private String category;
	
	public ECommerceEntity() {
		
	}

	public ECommerceEntity(int productId, String productName, double price, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}

	@Override
	public String toString() {
		return "ECommerceEntity [id=" + id + ", productId=" + productId + ", productName=" + productName + ", price="
				+ price + ", category=" + category + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	

}
