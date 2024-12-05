package com.xworkz.institute.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class ReadRunner4 {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("institute");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		// finding salary by Id
		Query query = eManager.createNamedQuery("findSalaryById");
		query.setParameter("setId", 12);
		Object obj = query.getSingleResult();
		Double ref = (Double) obj;
		System.out.println("Salary :" + ref);

	}

}
