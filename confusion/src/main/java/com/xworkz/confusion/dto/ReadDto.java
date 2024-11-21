package com.xworkz.confusion.dto;

public class ReadDto {

	private String id;
	private String name;
	private int age;
	private String gender;
	private String email;
	private String password;
	private String phone;

	public ReadDto(String id, String name, int age, String gender, String email, String password, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
