package com.xworkz.confusing.runner;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.confusing.dto.ConfusingDto;

public class GetEmailByName {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("confuse");
		EntityManager eManager=emfactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		List<ConfusingDto> li= eManager.createQuery("Select cd from ConfusingDto cd where cd.name like 'O%'", ConfusingDto.class).getResultList();
		
		for(ConfusingDto dtos: li) {
			System.out.println("Email : "+ dtos.getEmail());
		}
		
		try {
			eTrans.begin();
			eTrans.commit();
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
		}finally {
			eManager.close();
			emfactory.close();
		}

	}

}
