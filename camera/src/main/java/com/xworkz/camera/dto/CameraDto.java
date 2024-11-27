package com.xworkz.camera.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "camera_table")

public class CameraDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "c_name")
	private String cameraName;
	@Column(name = "model")
	private String model;
	@Column(name = "price")
	private double price;
	@Column(name = "type")
	private String type;
	@Column(name = "resolution")
	private double resolution;
	@Column(name = "screen_size")
	private double screenSize;
	@Column(name = "battery_life")
	private int batteryLife;
	@Column(name = "weight")
	private double weight;
	@Column(name = "warranty")
	private int warranty;
	
	public CameraDto() {
		
	}

	public CameraDto( String cameraName, String model, double price, String type, double resolution,
			double screenSize, int batteryLife, double weight, int warranty) {
		super();
		
		this.cameraName = cameraName;
		this.model = model;
		this.price = price;
		this.type = type;
		this.resolution = resolution;
		this.screenSize = screenSize;
		this.batteryLife = batteryLife;
		this.weight = weight;
		this.warranty = warranty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCameraName() {
		return cameraName;
	}

	public void setCameraName(String cameraName) {
		this.cameraName = cameraName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getResolution() {
		return resolution;
	}

	public void setResolution(double resolution) {
		this.resolution = resolution;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	
}
