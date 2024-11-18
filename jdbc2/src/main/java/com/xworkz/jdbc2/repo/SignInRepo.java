package com.xworkz.jdbc2.repo;

import com.xworkz.jdbc2.dto.SignInDTO;

public interface SignInRepo {
	
	boolean valid(SignInDTO signInDTO);

}
