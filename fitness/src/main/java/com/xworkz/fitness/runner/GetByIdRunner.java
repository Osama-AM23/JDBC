package com.xworkz.fitness.runner;

import java.util.List;

import javax.persistence.*;

public class GetByIdRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("fitness");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Query query=eManager.createNamedQuery("getUserIdAndWorkoutTypeById");
		query.setParameter("setId", 11);
		
		List<Object[]> list=query.getResultList();
		for(Object[] obj: list) {
			System.out.println("VALUES : "+"User Id :"+obj[0]+ " , "+"Workout Type :"+ obj[1]);
		}

	}

}
