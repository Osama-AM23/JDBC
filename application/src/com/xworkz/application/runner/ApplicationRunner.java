package com.xworkz.application.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ApplicationRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/pg";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQurey = "INSERT INTO application(id, name, lastName, age, email, address, pincode, mobileNo, aadhaarNo, qualification, motherTounge) VALUES "
				+ "(1, 'Aswin', 'G', 22, 'aswin23@gmail.com', 'palacode, TN', 636702, 8122407324, 234509871234, 'BA.Eng', 'Urdu'), "
				+ "(2, 'Azees', 'B', 22, 'azeesam@gmail.com', 'Dharmapuri, TN', 636701, 9845661103, 789043216754, 'EEE', 'Urdu'), "
				+ "(3, 'Akhib', 'M', 21, 'akhib254@gmail.com', 'Hosur, TN', 626001, 8072235606, 91287340921, 'CSE', 'Urdu'), "
				+ "(4, 'Ashif', 'K', 24, 'ashif034@gmail.com', 'Salem, TN', 626800, 8164409876, 324198706574, 'ECE', 'Tamil'), "
				+ "(5, 'Anwar', 'B', 25, 'anwar@gmail.com', 'Salem, TN', 636701, 9956022432, 457612098374, 'B.Tech', 'Tamil'), "
				+ "(6, 'Farook', 'M', 20, 'farook@gmail.com', 'Namakkal, TN', 636701, 8122409234, 654378902610, 'CSC', 'Telugu'), "
				+ "(7, 'Irfan', 'N', 19, 'irfan@gmail.com', 'Kovai, TN', 636701, 9944664654, 321409876509, 'EEE', 'Urdu'), "
				+ "(8, 'Imran', 'T', 20, 'imran63@gmail.com', 'Trichy, TN', 636701, 7765611246, 456372810191, 'B.Com', 'Tamil'), "
				+ "(9, 'Samiullah', 'H', 23, 'sami@gmail.com', 'Chennai, TN', 600001, 8172498832, 152472720908, 'BCA', 'Urdu'), "
				+ "(10, 'Ismail', 'P', 24, 'ismail@gmail.com', 'Pollachi, TN', 623019, 9609255412, 535309081281, 'B.Com.CA', 'Urdu'), "
				+ "(11, 'Ishak', 'M', 25, 'ishak401@gmail.com', 'palacode, TN', 636702, 7122509556, 324252629807, 'MSW', 'Tamil'), "
				+ "(12, 'Mujahid', 'A', 27, 'mujahid62@gmail.com', 'Caduulore, TN', 654703, 6381500876, 98743215678, 'B.Sc.Maths', 'Urdu'), "
				+ "(13, 'Assadiq', 'A', 21, 'assadiq@gmail.com', 'Vellore, TN', 616900, 6522509143, 767685850302, 'EEE', 'Urdu'), "
				+ "(14, 'Usman', 'U', 20, 'usman1@gmail.com', 'Namakkal, TN', 654231, 8065512657, 242325262710, 'BA.Eng', 'Urdu'), "
				+ "(15, 'Sadiq', 'D', 19, 'sadiq062@gmail.com', 'Dharmapuri, TN', 636701, 7655309271, 101090879767, 'BCA', 'Urdu'), "
				+ "(16, 'Nayeem', 'R', 20, 'nayeem@gmail.com', 'Banglore, KA', 736801, 6522416465, 454346420989, 'BSC', 'Kanada'), "
				+ "(17, 'Rizwan', 'L', 22, 'rizwan002@gmail.com', 'Banglore, KA', 736801, 9698224963, 123767698083, 'MCA', 'Kanada'), "
				+ "(18, 'Osama', 'A', 19, 'osama@gmail.com', 'Dharmapuri, TN', 636701, 9952644012, 890812657693, 'ECE', 'Urdu'), "
				+ "(19, 'Thameem', 'A', 18, 'thameem@gmail.com', 'Dharmapuri, TN', 636701, 9047500110, 240256784318, 'B.Tech', 'Urdu'), "
				+ "(20, 'Muhameed', 'A', 24, 'muhammed@gmail.com', 'Hosur, TN', 626001, 6522410933, 786509123403, 'MBA', 'Kanada')";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);

			Statement statement = connection.createStatement();
			int data = statement.executeUpdate(insertQurey);
			if (data > 0) {
				System.out.println("Connected Successfull");
			} else {
				System.err.println("Not connected");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
