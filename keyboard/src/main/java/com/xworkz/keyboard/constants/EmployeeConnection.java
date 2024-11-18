package com.xworkz.keyboard.constants;

public enum EmployeeConnection {
	
	URL("jdbc:mysql://localhost:3306/detail"), USERNAME("root"), PASSWORD("Xworkzodc@123");
	
	private final String value;
	
	private EmployeeConnection(String value) {
		this.value=value;
	}
	
	public String getValue() {
		return value;
	}
}
