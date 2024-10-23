package com.xworkz.pegion.runner;

public class KettleRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.xworkz.pegion.internals.Kettle");
			System.out.println("Invoking a Kettle Class");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Invoking a Driver Class");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

}
