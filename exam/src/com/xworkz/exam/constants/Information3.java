package com.xworkz.exam.constants;

public enum Information3 {
	
	URL("jdbc:mysql://localhost:3306/wifi"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private Information3(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
