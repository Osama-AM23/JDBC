package com.xworkz.fitness.runner;

import javax.persistence.*;

public class DeleteRowRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("fitness");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		try {
			eTrans.begin();
			Query query=eManager.createNamedQuery("delete");
			query.setParameter("setId", 20);
			query.setParameter("calo", 540);
			query.executeUpdate();
			eTrans.commit();
			
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
			e.printStackTrace();
		}finally {
			eManager.close();
			emFactory.close();
		}


	}

}
