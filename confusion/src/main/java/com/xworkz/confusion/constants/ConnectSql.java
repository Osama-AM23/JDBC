package com.xworkz.confusion.constants;

public enum ConnectSql {
	
	URL("jdbc:mysql://localhost:3306/notClear"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ConnectSql(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
