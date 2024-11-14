package com.xworkz.shopping.constants;

public enum Shopping {
	
	URL("jdbc:mysql://localhost:3306/online_store"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private Shopping(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
