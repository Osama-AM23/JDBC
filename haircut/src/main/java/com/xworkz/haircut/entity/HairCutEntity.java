package com.xworkz.haircut.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "haircut_table")

public class HairCutEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "haircut_name")
	private String haircutName;
	@Column(name = "price")
	private double price;
	
	public HairCutEntity() {
		
	}

	public HairCutEntity(String haircutName, double price) {
		super();
		this.haircutName = haircutName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHaircutName() {
		return haircutName;
	}

	public void setHaircutName(String haircutName) {
		this.haircutName = haircutName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
