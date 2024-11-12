package com.xworkz.wifi.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.wifi.constants.WifiData;

public class WifiRunner {

	public static void main(String[] args) {
		
		String insertQuery = "INSERT INTO network (id, name, password, ip_address, subnet_mask, gateway, location, phone, email, address, price, brand_name) VALUES " +
			    "(1, 'airtelXtreme', 'airtel@1234', '192.168.5.1', '255.255.255.0', '192.168.1.254', 'Office', 9047990132, 'mahindar@gmail.com', 'Rajajinagar, 3rd Blk', 6000, 'Airtel'), " +
			    "(2, 'airtelStream5G', 'golden@2005', '192.168.4.2', '255.255.255.0', '192.168.2.101', 'Office', 7052280923, 'govardhan@gmail.com', 'Indiranagar, 5th Blk', 6400, 'Airtel'), " +
			    "(3, 'JioFiber', 'jio@1234', '192.168.1.1', '255.255.255.0', '192.168.1.254', 'Home', 8765432100, 'Chethan@gmail.com', 'MG Road', 5500, 'Reliance'), " +
			    "(4, 'BSNL Broadband', 'bsnl@2022', '192.168.2.1', '255.255.255.0', '192.168.2.254', 'Home', 9898989898, 'Azees@gmail.com', 'Jayanagar', 3000, 'BSNL'), " +
			    "(5, 'ACT Fibernet', 'act@1234', '192.168.3.1', '255.255.255.0', '192.168.3.254', 'Office', 9988776655, 'irfan@gmail.com', 'Koramangala', 4500, 'ACT'), " +
			    "(6, 'Hathway', 'hathway@5678', '192.168.4.1', '255.255.255.0', '192.168.4.254', 'Home', 9876543210, 'gunal@gmail.com', 'BTM Layout', 4000, 'Hathway'), " +
			    "(7, 'Videocon D2H', 'videocon@abcd', '192.168.5.1', '255.255.255.0', '192.168.5.254', 'Office', 8765432109, 'vikram@gmail.com', 'Whitefield', 3700, 'Videocon'), " +
			    "(8, 'Tata Sky Broadband', 'tata@1234', '192.168.6.1', '255.255.255.0', '192.168.6.254', 'Home', 7654321098, 'ashif@gmail.com', 'Indiranagar', 6000, 'Tata'), " +
			    "(9, 'BSNL Fiber', 'bsnl@fiber', '192.168.7.1', '255.255.255.0', '192.168.7.254', 'Office', 6543210987, 'yash@gmail.com', 'Marathahalli', 3200, 'BSNL'), " +
			    "(10, 'Jio Fiber Plus', 'jio@plus', '192.168.8.1', '255.255.255.0', '192.168.8.254', 'Home', 5432109876, 'vinoth@gmail.com', 'Old Airport Road', 7500, 'Reliance'), " +
			    "(11, 'Airtel 5G', 'airtel@5g', '192.168.9.1', '255.255.255.0', '192.168.9.254', 'Home', 4321098765, 'charan@gmail.com', 'HSR Layout', 8200, 'Airtel'), " +
			    "(12, 'Hathway 4G', 'hathway@4g', '192.168.10.1', '255.255.255.0', '192.168.10.254', 'Office', 3210987654, 'prem@gmail.com', 'Jakkur', 4800, 'Hathway'), " +
			    "(13, 'Tata Fiber', 'tata@fiber', '192.168.11.1', '255.255.255.0', '192.168.11.254', 'Home', 2109876543, 'javeed@gmail.com', 'Bellandur', 6900, 'Tata'), " +
			    "(14, 'Reliance Jio', 'jio@reliance', '192.168.12.1', '255.255.255.0', '192.168.12.254', 'Office', 1098765432, 'mujahid@gmail.com', 'Electronic City', 7300, 'Reliance'), " +
			    "(15, 'ACT Stream', 'act@stream', '192.168.13.1', '255.255.255.0', '192.168.13.254', 'Home', 9988776644, 'leo@gmail.com', 'Sarjapur', 5600, 'ACT'), " +
			    "(16, 'Airtel Xtreme Fiber', 'xtreme@fiber', '192.168.14.1', '255.255.255.0', '192.168.14.254', 'Office', 9876543222, 'mia@gmail.com', 'KR Puram', 6000, 'Airtel'), " +
			    "(17, 'Vodafone Supernet', 'vodafone@1234', '192.168.15.1', '255.255.255.0', '192.168.15.254', 'Home', 8765432233, 'sadhik@gmail.com', 'Banaswadi', 7000, 'Vodafone'), " +
			    "(18, 'BSNL 4G', 'bsnl@4g', '192.168.16.1', '255.255.255.0', '192.168.16.254', 'Office', 7654321122, 'omkar@gmail.com', 'Nagarbhavi', 2900, 'BSNL'), " +
			    "(19, 'Jio 4G', 'jio@4g', '192.168.17.1', '255.255.255.0', '192.168.17.254', 'Home', 6543212233, 'haji@gmail.com', 'Hulimavu', 5400, 'Reliance'), " +
			    "(20, 'Hathway 5G', 'hathway@5g', '192.168.18.1', '255.255.255.0', '192.168.18.254', 'Office', 5432198765, 'arun@gmail.com', 'JP Nagar', 4200, 'Hathway');";

		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(WifiData.URL.getValue(), WifiData.USERNAME.getValue(),
					WifiData.PASSWORD.getValue());
			
			Statement statement =connection.createStatement();
			int i =statement.executeUpdate(insertQuery);
			if(i>0) {
				System.out.println("Connection Successfully");
				}
			else {
				System.err.println("Not Connected");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
