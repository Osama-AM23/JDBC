package com.xworkz.Lg.main;

public class TelevisionRunner {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.xworkz.Lg.internals.Television");
			System.out.println("Invoking a Television class");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Invoking a Driver class");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
