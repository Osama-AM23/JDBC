package com.xworkz.travel.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.travel.entity.TravelEntity;

public class TravelRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory eMFactory =Persistence.createEntityManagerFactory("travelling");
		EntityManager eManager =eMFactory.createEntityManager();
		EntityTransaction eTransaction =eManager.getTransaction();
		
		try {
			
			eTransaction.begin();
			TravelEntity travelEntity=new TravelEntity();
			travelEntity.setId(9);
			travelEntity.setPlaceName("Athirappilly");
			travelEntity.setState("Kerala");
			travelEntity.setType("Spiritual Travel");
			eManager.persist(travelEntity);
			eTransaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			eManager.close();
			eMFactory.close();
		}
	}

}
