package com.xworkz.jdbc.repo;

import com.xworkz.jdbc.dto.ApplicationDTO;

public interface ApplicationRepo {
	
	boolean save(ApplicationDTO applicationDTO);

}
