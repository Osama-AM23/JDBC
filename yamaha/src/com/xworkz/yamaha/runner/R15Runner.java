package com.xworkz.yamaha.runner;

public class R15Runner {

	public static void main(String[] args) {

		try {
			Class.forName("com.xworkz.yamaha.internals.R15");
			System.out.println("Invoking a R15 class");
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
