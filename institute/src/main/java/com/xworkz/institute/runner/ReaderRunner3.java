package com.xworkz.institute.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class ReaderRunner3 {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("institute");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		// find name by Email

		Query query = eManager.createNamedQuery("findNameByEmail");
		query.setParameter("getEmail", "sanjay28@gmail.com");
		Object obj = query.getSingleResult();
		String str = (String) obj;
		System.out.println("Values : " + str);

	}

}
