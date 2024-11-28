package com.xworkz.confusing.runner;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.confusing.dto.ConfusingDto;

public class UpdateRunner2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("confuse");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		List<ConfusingDto> list = eManager.createQuery("select cd.name, cd.phoneNo from ConfusingDto cd where cd.age >15", ConfusingDto.class)
				.getResultList();
		
		for(ConfusingDto dto: list) {
			System.out.println("ConfusingDto = "+ dto.getName() + ", "+ dto.getAge());
		}
		
		try {
			eTrans.begin();
			eTrans.commit();
			
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
		}finally {
			emFactory.close();
			eManager.close();
		}
	}

}
