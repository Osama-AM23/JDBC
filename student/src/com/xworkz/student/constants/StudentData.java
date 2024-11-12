package com.xworkz.student.constants;

public enum StudentData {

	URL("jdbc:mysql://localhost:3306/students"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private StudentData(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
