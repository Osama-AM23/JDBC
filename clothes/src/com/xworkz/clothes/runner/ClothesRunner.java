package com.xworkz.clothes.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ClothesRunner {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/sigma";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query = "INSERT INTO cust_data (cust_id, cust_Name, cust_Address, cust_Email, cust_mobileNo, total_Bill, discount, date, time, nameOfClothes, quantity) VALUES "
				+ "(1, 'Osama', 'Dharmapuri', 'osama@gmail.com', 9952644321, 3000, 2, NOW(), NOW(), 'Baggy Jeans', 2), "
				+ "(2, 'Kavi', 'Dharmapuri', 'kavi@gmail.com', 8077644321, 4000, 3, NOW(), NOW(), 'Baggy Jeans', 2), "
				+ "(3, 'Gunal', 'Krisnigiri', 'gunal@gmail.com', 8005643121, 2000, 2, NOW(), NOW(), 'Cargo Jeans', 1), "
				+ "(4, 'Mujahid', 'Palacode', 'mujahid@gmail.com', 7908643121, 1000, 1, NOW(), NOW(), 'Denim Shirt', 2), "
				+ "(5, 'Assadiq', 'Krishnigiri', 'assadiq@gmail.com', 8068643453, 700, 1, NOW(), NOW(), 'Cap', 1), "
				+ "(6, 'Thameem', 'Hosur', 'thameem@gmail.com', 8072243113, 1000, 1, NOW(), NOW(), 'Shirt', 1), "
				+ "(7, 'Riyaz', 'Hosur', 'riyaz@gmail.com', 8146320143, 1100, 1, NOW(), NOW(), 'Jacket', 1), "
				+ "(8, 'Chethan', 'Chitradurga', 'chethan@gmail.com', 7146013316, 1500, 1, NOW(), NOW(), 'Denim Shirt', 1), "
				+ "(9, 'Charan', 'Mangalore', 'charan@gmail.com', 8146013316, 1200, 2, NOW(), NOW(), 'T-Shirt', 3), "
				+ "(10, 'Ajay', 'Belagavi', 'ajay@gmail.com', 9036013316, 1500, 2, NOW(), NOW(), 'T-Shirt', 2), "
				+ "(11, 'Arun', 'Belagavi', 'arun@gmail.com', 9842660114, 1000, 1, NOW(), NOW(), 'Cap', 2), "
				+ "(12, 'Sachin', 'Mangalore', 'sachin@gmail.com', 9047581043, 500, 1, NOW(), NOW(), 'Gym Vest', 1), "
				+ "(13, 'Nagaraj', 'Hasaan', 'nagaraj@gmail.com', 9655900543, 800, 1, NOW(), NOW(), 'Hoodie', 1), "
				+ "(14, 'Kiran', 'Ballari', 'kiran@gmail.com', 9994500012, 300, 1, NOW(), NOW(), 'InnerWear', 1), "
				+ "(15, 'Harish', 'Hosur', 'harish@gmail.com', 7654501342, 2000, 2, NOW(), NOW(), 'Formal Shirt', 2), "
				+ "(16, 'Omkar', 'RajajiNagar', 'omkar@gmail.com', 9001201324, 2000, 3, NOW(), NOW(), 'T-Shirt', 2), "
				+ "(17, 'Vikram', 'Palacode', 'vikram@gmail.com', 8073301302, 1000, 1, NOW(), NOW(), 'Jersey', 2), "
				+ "(18, 'Deepak', 'Malleshwaram', 'deepak@gmail.com', 7602201182, 1000, 1, NOW(), NOW(), 'Raincoat', 2), "
				+ "(19, 'Saqib', 'Kr Puram', 'saqib@gmail.com', 9951200843, 1200, 2, NOW(), NOW(), 'Oversize T-shirt', 2), "
				+ "(20, 'Haji', 'Shrirampuram', 'haji@gmail.com', 984230112, 2000, 1, NOW(), NOW(), 'Cotton Jean', 2)";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			int i = statement.executeUpdate(query);
			if (i > 0) {
				System.out.println("Connected Successfull");
			} else {
				System.err.println("Not Connected");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
