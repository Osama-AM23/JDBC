package com.xworkz.confusion.service;

import com.xworkz.confusion.dto.ReadDto;
import com.xworkz.confusion.repo.ReadRepoImpl;

public class ReadServiceImpl implements ReadService {

	@Override
	public boolean condition(ReadDto readDto) {

		boolean check = true;

		if (readDto != null) {

			String name = readDto.getName();
			if (name == null && name.length() < 3 && name.isEmpty()) {
				System.err.println("Name is Not Valid");
				check = false;
			}

			int age = readDto.getAge();
			if (age < 18) {
				System.err.println("Age is Not valid");
				check = false;
			}

			String email = readDto.getEmail();
			if (email == null && !email.contains("@") && !email.endsWith(".com") && email.isEmpty()) {
				System.err.println("Email is Not Valid");
				check = false;
			}

			String password = readDto.getPassword();
			if (password == null && password.length() < 4 && password.isEmpty()) {
				System.err.println("Password is Not Valid");
				check = false;
			}

			String phone = readDto.getPhone();
			if (phone == null && phone.length() != 10) {
				System.err.println("phone is Not Valid");
				check = false;
			}

		}

		if (check) {
			ReadRepoImpl impl = new ReadRepoImpl();
			return impl.saved(readDto);
		} else {
			System.out.println("Not Data Valid");
			return false;
		}

	}
	
	public String getNameByPhone(String phone) {
		
		ReadRepoImpl impl= new ReadRepoImpl();
		String name= impl.updateByEmail(phone);
		return name;
	}
	
	public int deleteDataById(int id) {
		
		ReadRepoImpl impl= new ReadRepoImpl();
		int val=impl.deleteDataById(id);
		return val;
	}

	public String updateByEmail(String email) {
		ReadRepoImpl impl= new ReadRepoImpl();
		String em=impl.updateByEmail(email);
		return em;
	}
	
	public String getListById(int id) {
		ReadRepoImpl impl= new ReadRepoImpl();
		String st=impl.getLisyById(id);
		return st;
	}
}
