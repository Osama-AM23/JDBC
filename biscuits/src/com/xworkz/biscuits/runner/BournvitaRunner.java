package com.xworkz.biscuits.runner;

public class BournvitaRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.xworkz.biscuits.internals.Bournvita");
			System.out.println("Invoking a bournvita class");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
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
