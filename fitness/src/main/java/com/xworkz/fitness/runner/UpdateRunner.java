package com.xworkz.fitness.runner;

import javax.persistence.*;
public class UpdateRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("fitness");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		try {
			eTrans.begin();
			Query query=eManager.createNamedQuery("update");
			query.setParameter("id", 3);
			query.setParameter("calo", 420);
			query.setParameter("duration", 50);
			int update=query.executeUpdate();
			eTrans.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
			eManager.close();
			emFactory.close();
		}
		

		

	}

}
