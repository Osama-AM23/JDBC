package com.xworkz.exam.constants;

public enum Information2 {
	
	URL("jdbc:mysql://localhost:3306/result"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private Information2(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}
