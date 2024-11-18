package com.xworkz.jdbc2.constant;

public enum SignInConnection {

	URL("jdbc:mysql://localhost:3306/signin"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private String value;

	private SignInConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
