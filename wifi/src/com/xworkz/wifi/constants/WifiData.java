package com.xworkz.wifi.constants;

public enum WifiData {
	
	URL("jdbc:mysql://localhost:3306/jingalala"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private WifiData(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}


}
