package com.xworkz.dance.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.dance.entity.DanceEntity;

public class DanceRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory managerFactory =Persistence.createEntityManagerFactory("dancing");
		EntityManager eManager =managerFactory.createEntityManager();
		EntityTransaction eTransaction =eManager.getTransaction();
		
		try {
			
			eTransaction.begin();
			DanceEntity entity=new DanceEntity();
			entity.setId(5);
			entity.setDanceName("Bharatanatyam");
			entity.setState("Tamil Nadu");
			eManager.persist(entity);
			eTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			eManager.close();
			managerFactory.close();
		}

	}

}
