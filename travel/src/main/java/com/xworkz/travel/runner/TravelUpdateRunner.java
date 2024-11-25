package com.xworkz.travel.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.travel.entity.TravelUpdateEntity;

public class TravelUpdateRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory managerFactory =Persistence.createEntityManagerFactory("travelling");
		EntityManager eManager =managerFactory.createEntityManager();
		EntityTransaction eTransaction =eManager.getTransaction();
		
		try {
			
			eTransaction.begin();
			TravelUpdateEntity entity=new TravelUpdateEntity();
			entity.setId(8);
			entity.setPlaceName("Burj Khalifa");
			entity.setState("Dubai");
			entity.setType("Architecture Travel");
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
