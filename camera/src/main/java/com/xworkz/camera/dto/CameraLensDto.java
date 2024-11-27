package com.xworkz.camera.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "camera_lens_table")
public class CameraLensDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "lens_name")
	private String lensName;
	@Column(name = "lens_type")
	private String lensType;
	@Column(name = "focal_length")
	private String focalLength;
	@Column(name = "aperture")
	private String aperture;
	@Column(name = "max_aperture")
	private String maxAperture;
	@Column(name = "lens_mount")
	private String lensMount;
	@Column(name = "filter_size")
	private String filterSize;
	@Column(name = "weight")
	private int weight;

	public CameraLensDto() {

	}

	public CameraLensDto(String lensName, String lensType, String focalLength, String aperture, String maxAperture,
			String lensMount, String filterSize, int weight) {
		super();
		this.lensName = lensName;
		this.lensType = lensType;
		this.focalLength = focalLength;
		this.aperture = aperture;
		this.maxAperture = maxAperture;
		this.lensMount = lensMount;
		this.filterSize = filterSize;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLensName() {
		return lensName;
	}

	public void setLensName(String lensName) {
		this.lensName = lensName;
	}

	public String getLensType() {
		return lensType;
	}

	public void setLensType(String lensType) {
		this.lensType = lensType;
	}

	public String getFocalLength() {
		return focalLength;
	}

	public void setFocalLength(String focalLength) {
		this.focalLength = focalLength;
	}

	public String getAperture() {
		return aperture;
	}

	public void setAperture(String aperture) {
		this.aperture = aperture;
	}

	public String getMaxAperture() {
		return maxAperture;
	}

	public void setMaxAperture(String maxAperture) {
		this.maxAperture = maxAperture;
	}

	public String getLensMount() {
		return lensMount;
	}

	public void setLensMount(String lensMount) {
		this.lensMount = lensMount;
	}

	public String getFilterSize() {
		return filterSize;
	}

	public void setFilterSize(String filterSize) {
		this.filterSize = filterSize;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
