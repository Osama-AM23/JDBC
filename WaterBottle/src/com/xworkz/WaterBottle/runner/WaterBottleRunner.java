package com.xworkz.WaterBottle.runner;

public class WaterBottleRunner {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.xworkz.WaterBottle.internals.CelloWaterBottle");
			System.out.println("Invoking a Cello WaterBottle class");
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
