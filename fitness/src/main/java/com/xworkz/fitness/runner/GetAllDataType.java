package com.xworkz.fitness.runner;

import java.time.LocalDate;

import javax.persistence.*;

public class GetAllDataType {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("fitness");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		LocalDate workoutDate = LocalDate.of(2024, 12, 11);

		Query query1 = eManager.createNamedQuery("getUserIdByWorkoutDate");
		query1.setParameter("byWorkoutDate", workoutDate);
		Integer value = (Integer) query1.getSingleResult();
		System.out.println("VALUE :" + value);

		Query query2 = eManager.createNamedQuery("getIdByCaloriesBurned");
		query2.setParameter("byCalo", 380);
		Integer calories = (Integer) query2.getSingleResult();
		System.out.println("VALUE :" + calories);

		Query query3 = eManager.createNamedQuery("getDistanceBySteps");
		query3.setParameter("bySteps", 4200);
		Double distance = (Double) query3.getSingleResult();
		System.out.println("VALUE :" + distance);
		
		Query query4 = eManager.createNamedQuery("getCompleteByUserId");
		query4.setParameter("byUserId", 114);
		Boolean complete = (Boolean) query4.getSingleResult();
		System.out.println("VALUE :" + complete);
		
		Query query5 = eManager.createNamedQuery("getWorkoutTypeById");
		query5.setParameter("byId", 18);
		String type = (String) query5.getSingleResult();
		System.out.println("VALUE :" + type);
	}

}
