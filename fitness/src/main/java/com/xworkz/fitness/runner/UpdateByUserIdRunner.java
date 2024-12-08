package com.xworkz.fitness.runner;

import javax.persistence.*;

public class UpdateByUserIdRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("fitness");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		try {
			
			eTrans.begin();
			Query query=eManager.createNamedQuery("updateByIsCompletedAndUserId");
			query.setParameter("complete", true);
			query.setParameter("user", 108);
			query.setParameter("workoutType", "Balance Training");
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
