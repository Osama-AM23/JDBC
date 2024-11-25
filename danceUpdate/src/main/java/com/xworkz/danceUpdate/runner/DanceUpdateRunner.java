package com.xworkz.danceUpdate.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.danceUpdate.entity.DanceUpdateEntity;

public class DanceUpdateRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory managerFactory =Persistence.createEntityManagerFactory("dancing");
		EntityManager eManager =managerFactory.createEntityManager();
		EntityTransaction eTransaction =eManager.getTransaction();
		
		try {
			
			eTransaction.begin();
			DanceUpdateEntity entity=new DanceUpdateEntity();
			entity.setId(5);
			entity.setDanceName("Manipuri");
			entity.setState("Manipur");
			eManager.merge(entity);
			eTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			eManager.close();
			managerFactory.close();
		}


	}

}
