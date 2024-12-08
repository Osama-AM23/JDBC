package com.xworkz.fitness.runner;

import javax.persistence.*;

public class GetCountByDistance {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("fitness");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		
		Query query=eManager.createNamedQuery("getCountByDistance");
		query.setParameter("dist", 3.0);
		
		Object obj=query.getSingleResult();
		Long distance=(Long)obj;
		System.out.println("Distance Count >(3.0) : "+distance);
		
		
		

	}

}
