package com.xworkz.dance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dance_table")
public class DanceEntity {
	@Id
	private int id;
	@Column(name = "danceName")
	private String danceName;
	@Column(name = "state")
	private String state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDanceName() {
		return danceName;
	}

	public void setDanceName(String danceName) {
		this.danceName = danceName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
