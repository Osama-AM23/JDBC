package com.xworkz.fitness.runner;

import javax.persistence.*;

public class GetCountRunner {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("fitness");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		Query query = eManager.createNamedQuery("getCountByWorkoutType&HeartRate");
		query.setParameter("workoutType", "Cardio");
		query.setParameter("heartRate", 120);

		Object obj = query.getSingleResult();
		Long result = (Long) obj;
		System.out.println("Count : " + result);
	}

}
