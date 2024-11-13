package com.xworkz.exam.constants;

public enum Information {
	
	URL("jdbc:mysql://localhost:3306/examination"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private Information(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
