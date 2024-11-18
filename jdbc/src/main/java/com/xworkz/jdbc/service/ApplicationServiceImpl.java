package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.ApplicationDTO;
import com.xworkz.jdbc.repo.ApplicationRepo;
import com.xworkz.jdbc.repo.ApplicationRepoImpl;

public class ApplicationServiceImpl implements ApplicationService {

	@Override
	public boolean validation(ApplicationDTO applicationDTO) {
		
		System.out.println("In this service Impl ");
		System.out.println("Name : "+applicationDTO.getName());
		System.out.println("email : "+applicationDTO.getEmail());
		System.out.println("phone : "+applicationDTO.getPhone());
		System.out.println("address : "+applicationDTO.getAddress());
		System.out.println("pincode : "+applicationDTO.getPincode());
		
		
		ApplicationRepo repo= new ApplicationRepoImpl();
		boolean saved=repo.save(applicationDTO);
		System.out.println("Save :"+ saved);
		
		return saved;
	}

}
