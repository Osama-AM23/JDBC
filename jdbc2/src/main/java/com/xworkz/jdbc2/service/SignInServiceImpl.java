package com.xworkz.jdbc2.service;

import com.xworkz.jdbc2.dto.SignInDTO;
import com.xworkz.jdbc2.repo.SignInRepoImpl;

public class SignInServiceImpl implements SignInService {

	@Override
	public boolean save(SignInDTO dto) {

		System.out.println("name :" + dto.getName());
		System.out.println("email :" + dto.getEmail());
		System.out.println("pssword :" + dto.getPassword());

		SignInRepoImpl repoImpl= new SignInRepoImpl();
		boolean check=repoImpl.valid(dto);
		System.out.println("save :" + check);
		
		return check;

	}

}
