package com.xworkz.shopping.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.shopping.constants.Shopping;
import com.xworkz.shopping.dto.ShoppingDTO;

public class ShoppingRunner {

	public static void main(String[] args) {

		ShoppingDTO dto = new ShoppingDTO(1, "Aswin", "G", "aswin@gmail.com", 8122410103L, "police station BackSide","Dharmapuri", "TN", "626802");
		ShoppingDTO dto2 = new ShoppingDTO(2, "Jeevan", "A", "jeevan@gmail.com", 7084310103L, "Rj Street", "Salem","TN", "626702");
		ShoppingDTO dto3 = new ShoppingDTO(3, "Vikram", "M", "vikram@gmail.com", 7084096503L, "KR Market", "Bangalore","KA", "826602");
		ShoppingDTO dto4 = new ShoppingDTO(4, "Prakash", "V", "prakash@gmail.com", 8074310103L, "RR Block", "Chennai","TN", "620002");
		ShoppingDTO dto5 = new ShoppingDTO(5, "Akshar", "L", "akshar@gmail.com", 6724310103L, "DNV Nagar", "Kovai","TN", "600302");
		ShoppingDTO dto6 = new ShoppingDTO(6, "Jagan", "K", "jagan@gmail.com", 8074223103L, "Gandhi Street", "Trichy","TN", "626501");
		ShoppingDTO dto7 = new ShoppingDTO(7, "Arul", "R", "arul@gmail.com", 9952644987L, "RajajiNagar", "Bangalore","KA", "828701");
		ShoppingDTO dto8 = new ShoppingDTO(8, "Madhan", "H", "madhan@gmail.com", 8073354261L, "Rj Street", "Bangalore","KA", "836001");
		ShoppingDTO dto9 = new ShoppingDTO(9, "Osama", "A", "osama@gmail.com", 9953711342L, "Rj Street", "Hosur","TN", "626003");
		ShoppingDTO dto10 = new ShoppingDTO(10, "Mujahid", "A", "mujahid@gmail.com", 6345211989L, "Adhiyaman road","Salem", "TN", "626701");

		Connection connection = null;

		PreparedStatement prst = null;

		try {
			connection = DriverManager.getConnection(Shopping.URL.getValue(), Shopping.USERNAME.getValue(), Shopping.PASSWORD.getValue());
			prst = connection.prepareStatement("insert into new_table values (?,?,?,?,?,?,?,?,?)");

			prst.setInt(1, dto.getId());
			prst.setString(2, dto.getFirstName());
			prst.setString(3, dto.getLastName());
			prst.setString(4, dto.getEmail());
			prst.setLong(5, dto.getPhone());
			prst.setString(6, dto.getAddress());
			prst.setString(7, dto.getCity());
			prst.setString(8, dto.getState());
			prst.setString(9, dto.getPincode());
			prst.addBatch();

			prst.setInt(1, dto2.getId());
			prst.setString(2, dto2.getFirstName());
			prst.setString(3, dto2.getLastName());
			prst.setString(4, dto2.getEmail());
			prst.setLong(5, dto2.getPhone());
			prst.setString(6, dto2.getAddress());
			prst.setString(7, dto2.getCity());
			prst.setString(8, dto2.getState());
			prst.setString(9, dto2.getPincode());
			prst.addBatch();

			prst.setInt(1, dto3.getId());
			prst.setString(2, dto3.getFirstName());
			prst.setString(3, dto3.getLastName());
			prst.setString(4, dto3.getEmail());
			prst.setLong(5, dto3.getPhone());
			prst.setString(6, dto3.getAddress());
			prst.setString(7, dto3.getCity());
			prst.setString(8, dto3.getState());
			prst.setString(9, dto3.getPincode());
			prst.addBatch();

			prst.setInt(1, dto4.getId());
			prst.setString(2, dto4.getFirstName());
			prst.setString(3, dto4.getLastName());
			prst.setString(4, dto4.getEmail());
			prst.setLong(5, dto4.getPhone());
			prst.setString(6, dto4.getAddress());
			prst.setString(7, dto4.getCity());
			prst.setString(8, dto4.getState());
			prst.setString(9, dto4.getPincode());
			prst.addBatch();

			prst.setInt(1, dto5.getId());
			prst.setString(2, dto5.getFirstName());
			prst.setString(3, dto5.getLastName());
			prst.setString(4, dto5.getEmail());
			prst.setLong(5, dto5.getPhone());
			prst.setString(6, dto5.getAddress());
			prst.setString(7, dto5.getCity());
			prst.setString(8, dto5.getState());
			prst.setString(9, dto5.getPincode());
			prst.addBatch();

			prst.setInt(1, dto6.getId());
			prst.setString(2, dto6.getFirstName());
			prst.setString(3, dto6.getLastName());
			prst.setString(4, dto6.getEmail());
			prst.setLong(5, dto6.getPhone());
			prst.setString(6, dto6.getAddress());
			prst.setString(7, dto6.getCity());
			prst.setString(8, dto6.getState());
			prst.setString(9, dto6.getPincode());
			prst.addBatch();

			prst.setInt(1, dto7.getId());
			prst.setString(2, dto7.getFirstName());
			prst.setString(3, dto7.getLastName());
			prst.setString(4, dto7.getEmail());
			prst.setLong(5, dto7.getPhone());
			prst.setString(6, dto7.getAddress());
			prst.setString(7, dto7.getCity());
			prst.setString(8, dto7.getState());
			prst.setString(9, dto7.getPincode());
			prst.addBatch();

			prst.setInt(1, dto8.getId());
			prst.setString(2, dto8.getFirstName());
			prst.setString(3, dto8.getLastName());
			prst.setString(4, dto8.getEmail());
			prst.setLong(5, dto8.getPhone());
			prst.setString(6, dto8.getAddress());
			prst.setString(7, dto8.getCity());
			prst.setString(8, dto8.getState());
			prst.setString(9, dto8.getPincode());
			prst.addBatch();

			prst.setInt(1, dto9.getId());
			prst.setString(2, dto9.getFirstName());
			prst.setString(3, dto9.getLastName());
			prst.setString(4, dto9.getEmail());
			prst.setLong(5, dto9.getPhone());
			prst.setString(6, dto9.getAddress());
			prst.setString(7, dto9.getCity());
			prst.setString(8, dto9.getState());
			prst.setString(9, dto9.getPincode());
			prst.addBatch();

			prst.setInt(1, dto10.getId());
			prst.setString(2, dto10.getFirstName());
			prst.setString(3, dto10.getLastName());
			prst.setString(4, dto10.getEmail());
			prst.setLong(5, dto10.getPhone());
			prst.setString(6, dto10.getAddress());
			prst.setString(7, dto10.getCity());
			prst.setString(8, dto10.getState());
			prst.setString(9, dto10.getPincode());
			prst.addBatch();
			
			int[] values=prst.executeBatch();
			
			for(int i: values) {
				if(i>0) {
					System.out.println("Connected Succesfully");
				}else {
					System.err.println("Not connected");
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
